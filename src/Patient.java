import java.util.Collections;
import java.util.List;

class Patient extends Person {
    /**
     * Запись пациента.
     */
    private MedicalRecord medicalRecord;

    /**
     * Конструктор для создания объекта пациента.
     *
     * @param name           Имя пациента.
     * @param age            Возраст пациента.
     * @param medicalRecord  Медицинская запись пациента.
     */
    public Patient(String name, int age, MedicalRecord medicalRecord) {
        super(name, age);
        this.medicalRecord = medicalRecord;
    }

    /**
     * Геттер медицинской записи пациента.
     *
     * @return Медицинская запись пациента.
     */
    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    /**
     * Геттер медицинской истории пациента.
     *
     * @return Список записей в медицинской истории пациента.
     */
    public List<String> getMedicalHistory() {
        if (medicalRecord != null) {
            return medicalRecord.getMedicalHistory();
        } else {
            return Collections.emptyList();
        }
    }

    /**
     * Сеттер медицинской записи пациента.
     *
     * @param medicalRecord Новая медицинская запись пациента.
     */
    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    /**
     * Геттер списка приемов пациента.
     *
     * @return Список приемов пациента.
     */
    public List<Appointment> getAppointments() {
        if (medicalRecord != null) {
            return medicalRecord.getAppointments();
        } else {
            return Collections.emptyList();
        }
    }

    /**
     * Получение последнего диагноза пациента.
     *
     * @return Последний диагноз пациента.
     */
    public String getLastDiagnosis() {
        if (medicalRecord != null) {
            List<Appointment> appointments = medicalRecord.getAppointments();
            if (!appointments.isEmpty()) {
                return appointments.get(appointments.size() - 1).getDiagnosis();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Patient{name='" + getName() + "', age=" + getAge() + ", medicalRecord=" + getMedicalRecord() + "}";
    }
}