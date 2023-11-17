import java.util.*;

class MedicalRecord {
    /**
     * История пациента
     */
    private List<String> medicalHistory;
    /**
     * Список приемов пациента.
     */
    private List<Appointment> appointments;
    /**
     * Список диагнозов пациента.
     */
    private Map<Patient, List<String>> patientDiagnoses;

    /**
     * Конструктор для создания объекта медицинской записи.
     */
    public MedicalRecord() {
        this.medicalHistory = new ArrayList<>();
        this.appointments = new ArrayList<>();
        this.patientDiagnoses = new HashMap<>();
    }

    /**
     * Метод для добавления записи в медицинскую историю.
     *
     * @param entry Запись, добавляемая в медицинскую историю.
     */
    public void addMedicalEntry(String entry) {
        if (entry != null) {
            medicalHistory.add(entry);
        }
    }

    /**
     * Получение медицинской истории пациента.
     *
     * @return Список записей в медицинской истории.
     */
    public List<String> getMedicalHistory() {
        return Collections.unmodifiableList(medicalHistory);
    }

    /**
     * Метод для добавления приема в список приемов пациента.
     *
     * @param appointment Прием, добавляемый в список.
     */
    public void addAppointment(Appointment appointment) {
        if (appointment != null) {
            appointments.add(appointment);

            Patient patient = appointment.getPatient();

            List<String> patientDiagnosesList = patientDiagnoses.computeIfAbsent(patient, k -> new ArrayList<>());

            patientDiagnosesList.add(appointment.getDiagnosis());
        }
    }

    /**
     * Геттер списка приемов пациента.
     *
     * @return Список приемов пациента.
     */
    public List<Appointment> getAppointments() {
        return Collections.unmodifiableList(appointments);
    }
    /**
     * Геттер последнего диагноза пациента.
     *
     * @param patient Пациент.
     * @return Последний диагноз пациента.
     */
    public String getLastDiagnosis(Patient patient) {
        List<String> diagnoses = patientDiagnoses.get(patient);
        if (diagnoses != null && !diagnoses.isEmpty()) {
            return diagnoses.get(diagnoses.size() - 1);
        }
        return null;
    }
}
