class Doctor extends Person {
    private String specialization;
    // Конструктор
    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }
    // Геттер и сеттер для специализации
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}