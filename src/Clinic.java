import java.util.*;

class Clinic {
    /**
     * Список сотрудников поликлиники.
     */
    private final List<Person> employees;

    /**
     * Список пациентов поликлиники.
     */
    private final List<Patient> patients;

    /**
     * Конструктор для создания объекта поликлиники.
     */
    public Clinic() {
        this.employees = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    /**
     * Метод для добавления сотрудника в поликлинику.
     *
     * @param person Сотрудник, который добавляется.
     */
    public void addEmployee(Person person) {
        if (person != null) {
            employees.add(person);
        }
    }

    /**
     * Метод для удаления сотрудника из поликлиники.
     *
     * @param person Сотрудник, который удаляется.
     */
    public void removeEmployee(Person person) {
        employees.remove(person);
    }

    /**
     * Метод для добавления пациента в поликлинику.
     *
     * @param patient Пациент, который добавляется.
     */
    public void addPatient(Patient patient) {
        if (patient != null) {
            patients.add(patient);
        }
    }

    /**
     * Метод для удаления пациента из поликлиники.
     *
     * @param patient Пациент, который удаляется.
     */
    public void removePatient(Patient patient) {
        patients.remove(patient);
    }

    /**
     * Сеттер списка сотрудников поликлиники.
     *
     * @param employees Список сотрудников.
     */
    public void setEmployees(List<Person> employees) {
        if (employees != null) {
            this.employees.clear();
            this.employees.addAll(employees);
        }
    }

    /**
     * Сеттер списка пациентов поликлиники.
     *
     * @param patients Список пациентов.
     */
    public void setPatients(List<Patient> patients) {
        if (patients != null) {
            this.patients.clear();
            this.patients.addAll(patients);
        }
    }

    /**
     * Геттер списка пациентов поликлиники.
     *
     * @return Список пациентов поликлиники.
     */
    public List<Patient> getPatients() {
        return new ArrayList<>(patients);
    }

    /**
     * Геттер списка сотрудников поликлиники.
     *
     * @return Список сотрудников поликлиники.
     */
    public List<Person> getEmployees() {
        return new ArrayList<>(employees);
    }
}