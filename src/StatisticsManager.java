import java.util.*;

public class StatisticsManager implements StatisticsService {
    private final Clinic clinic;

    /**
     * Конструктор для создания объекта менеджера статистики.
     *
     * @param clinic Поликлиника, для которой ведется статистика.
     */
    public StatisticsManager(Clinic clinic) {
        this.clinic = clinic;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getNumberOfAppointmentsByDoctor(Doctor doctor) {
        int count = 0;
        for (Patient patient : clinic.getPatients()) {
            for (Appointment appointment : patient.getAppointments()) {
                if (appointment.getDoctor().equals(doctor)) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<String> getDiagnosesByDoctor(Doctor doctor) {
        List<String> diagnoses = new ArrayList<>();
        for (Patient patient : clinic.getPatients()) {
            for (Appointment appointment : patient.getAppointments()) {
                if (appointment.getDoctor().equals(doctor) && appointment.getDiagnosis() != null) {
                    diagnoses.add(appointment.getDiagnosis());
                }
            }
        }
        return diagnoses;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, Integer> getSpecializationStatistics() {
        Map<String, Integer> specializationCount = new HashMap<>();
        for (Person employee : clinic.getEmployees()) {
            if (employee instanceof Doctor) {
                Doctor doctor = (Doctor) employee;
                String specialization = doctor.getSpecialization();
                specializationCount.put(specialization, specializationCount.getOrDefault(specialization, 0) + 1);
            }
        }
        return specializationCount;
    }
}
