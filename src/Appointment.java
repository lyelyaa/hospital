import java.util.Date;

public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private Date date;
    private String diagnosis;

    /**
     * Конструктор для создания объекта приема.
     *
     * @param patient    Пациент, назначенный на прием.
     * @param doctor     Врач, к которому записан пациент.
     * @param date       Дата и время назначенного приема.
     * @param diagnosis  Диагноз, который был выставлен на приеме.
     */
    public Appointment(Patient patient, Doctor doctor, Date date, String diagnosis) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;

        MedicalRecord medicalRecord = patient.getMedicalRecord();
        String lastDiagnosis = medicalRecord.getLastDiagnosis(patient);
        this.diagnosis = lastDiagnosis;
    }

    /**
     * Геттер пациента, назначенного на прием.
     *
     * @return Объект пациента.
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Сеттер пациента для приема.
     *
     * @param patient Объект пациента.
     */
    public void setPatient(Patient patient) {
        if (patient != null) {
            this.patient = patient;
        } else {
            // Обработка случая, когда передан null
        }
    }

    /**
     * Геттер врача, к которому записан пациент.
     *
     * @return Объект врача.
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * Сеттер врача для приема.
     *
     * @param doctor Объект врача.
     */
    public void setDoctor(Doctor doctor) {
        if (doctor != null) {
            this.doctor = doctor;
        }
    }

    /**
     * Геттер даты и времени назначенного приема.
     *
     * @return Дата и время приема.
     */
    public Date getDate() {
        return date;
    }

    /**
     * Сеттер даты и времени приема.
     *
     * @param date Дата и время приема.
     */
    public void setDate(Date date) {
        if (date != null) {
            this.date = date;
        }
    }

    /**
     * Геттер диагноза приема.
     *
     * @return Диагноз приема.
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     * Сеттер диагноза приема.
     *
     * @param diagnosis Диагноз приема.
     */
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
