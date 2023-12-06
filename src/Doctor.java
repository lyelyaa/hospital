class Doctor extends Person {
    /**
     * Специализация врача.
     */
    private String specialization;

    /**
     * Конструктор для создания объекта врача.
     *
     * @param name           Имя врача.
     * @param age            Возраст врача.
     * @param specialization Специализация врача.
     */
    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    /**
     * Геттер специализации врача.
     *
     * @return Специализация врача.
     */
    public String getSpecialization() {
        return specialization;
    }

    /**
     * Сеттер специализации врача.
     *
     * @param specialization Новая специализация врача.
     */
    public void setSpecialization(String specialization) {
        if (specialization != null) {
            this.specialization = specialization;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Doctor{name='");
        sb.append(getName()).append("', age=").append(getAge()).append(", specialization='").append(getSpecialization()).append("'}");
        return sb.toString();
    }
}
