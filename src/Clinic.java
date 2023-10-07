import java.util.*;
class Clinic {
    private List<Person> employees;
    private List<Patient> patients;
    // Конструктор
    public Clinic() {
        this.employees = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
    // Методы для добавления и удаления сотрудников и пациентов
    public void addEmployee(Person person) {
        employees.add(person);
    }
    public void removeEmployee(Person person) {
        employees.remove(person);
    }
    public void addPatient(Patient patient) {
        patients.add(patient);
    }
    public void removePatient(Patient patient) {
        patients.remove(patient);
    }
}