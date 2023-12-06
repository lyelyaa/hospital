/**
 * Класс для построения объекта пациента.
 */
public class PatientBuilder {

    /**
     * Имя пациента.
     */
    private String name;

    /**
     * Возраст пациента.
     */
    private int age;

    /**
     * Медицинская запись пациента.
     */
    private MedicalRecord medicalRecord;

    /**
     * Сеттер имени пациента.
     *
     * @param name Имя пациента.
     * @return Экземпляр построителя.
     */
    public PatientBuilder setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Сеттер возраста пациента.
     *
     * @param age Возраст пациента.
     * @return Экземпляр построителя.
     */
    public PatientBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    /**
     * Сеттер медицинской записи пациента.
     *
     * @param medicalRecord Медицинская запись пациента.
     * @return Экземпляр построителя.
     */
    public PatientBuilder setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
        return this;
    }

    /**
     * Билдер объекта пациента.
     *
     * @return Объект пациента.
     */
    public Patient build() {
        return new Patient(name, age, medicalRecord);
    }
}
