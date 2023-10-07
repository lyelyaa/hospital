class Administrator {
    // Методы для управления данными о сотрудниках и пациентах
    public void addEmployee(Person person, Clinic clinic) {
        clinic.addEmployee(person);
    }
    public void removeEmployee(Person person, Clinic clinic) {
        clinic.removeEmployee(person);
    }
    public void addPatient(Patient patient, Clinic clinic) {
        clinic.addPatient(patient);
    }
    public void removePatient(Patient patient, Clinic clinic) {
        clinic.removePatient(patient);
    }
}