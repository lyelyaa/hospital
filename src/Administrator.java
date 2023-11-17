public class Administrator {
    /**
     * Метод для добавления сотрудника в поликлинику.
     *
     * @param person Сотрудник, который добавляется.
     * @param clinic Поликлиника, в которую добавляется сотрудник.
     */
    public void addEmployee(Person person, Clinic clinic) {
        if (person != null && clinic != null) {
            clinic.addEmployee(person);
        }
    }

    /**
     * Метод для удаления сотрудника из поликлиники.
     *
     * @param person Сотрудник, который удаляется.
     * @param clinic Поликлиника, из которой удаляется сотрудник.
     */
    public void removeEmployee(Person person, Clinic clinic) {
        if (person != null && clinic != null) {
            clinic.removeEmployee(person);
        }
    }

    /**
     * Метод для добавления пациента в поликлинику.
     *
     * @param patient Пациент, который добавляется.
     * @param clinic  Поликлиника, в которую добавляется пациент.
     */
    public void addPatient(Patient patient, Clinic clinic) {
        if (patient != null && clinic != null) {
            clinic.addPatient(patient);
        }
    }

    /**
     * Метод для удаления пациента из поликлиники.
     *
     * @param patient Пациент, который удаляется.
     * @param clinic  Поликлиника, из которой удаляется пациент.
     */
    public void removePatient(Patient patient, Clinic clinic) {
        if (patient != null && clinic != null) {
            clinic.removePatient(patient);
        }
    }
}
