public class DoctorBuilder {
    /**
     * Имя врача.
     */
    private String name;

    /**
     * Возраст врача.
     */
    private int age;

    /**
     * Специализация врача.
     */
    private String specialization;

    /**
     * Сеттер имени врача.
     *
     * @param name Имя врача.
     * @return Ссылка на объект строителя.
     */
    public DoctorBuilder setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Сеттер возраста врача.
     *
     * @param age Возраст врача.
     * @return Ссылка на объект строителя.
     */
    public DoctorBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    /**
     * Сеттер специализации врача.
     *
     * @param specialization Специализация врача.
     * @return Ссылка на объект строителя.
     */
    public DoctorBuilder setSpecialization(String specialization) {
        this.specialization = specialization;
        return this;
    }

    /**
     * Билдер объекта врача на основе установленных параметров.
     *
     * @return Объект врача.
     */
    public Doctor build() {
        return new Doctor(name, age, specialization);
    }
}