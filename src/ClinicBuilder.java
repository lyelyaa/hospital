import java.util.ArrayList;
import java.util.List;

public class ClinicBuilder {
    /**
     * Список сотрудников поликлиники.
     */
    private final List<Person> employees = new ArrayList<>();

    /**
     * Список пациентов поликлиники.
     */
    private final List<Patient> patients = new ArrayList<>();

    /**
     * Метод для добавления сотрудника в поликлинику.
     *
     * @param employee Сотрудник, который добавляется.
     * @return Текущий объект ClinicBuilder для продолжения построения.
     */
    public ClinicBuilder addEmployee(Person employee) {
        this.employees.add(employee);
        return this;
    }

    /**
     * Метод для добавления пациента в поликлинику.
     *
     * @param patient Пациент, который добавляется.
     * @return Текущий объект ClinicBuilder для продолжения построения.
     */
    public ClinicBuilder addPatient(Patient patient) {
        this.patients.add(patient);
        return this;
    }

    /**
     * Билдер объекта поликлиники.
     *
     * @return Объект поликлиники с установленными сотрудниками и пациентами.
     */
    public Clinic build() {
        Clinic clinic = new Clinic();
        clinic.setEmployees(employees);
        clinic.setPatients(patients);
        return clinic;
    }
}