import java.util.*;
class StatisticsManager implements StatisticsService {
    private Clinic clinic;
    // Конструктор
    public StatisticsManager(Clinic clinic) {
        this.clinic = clinic;
    }
    // Реализация методов интерфейса StatisticsService
    @Override
    public int getNumberOfAppointmentsByDoctor(Doctor doctor) {
        // Реализация подсчета числа записей на прием у врача
        return 0; // Заглушка
    }
    @Override
    public List<String> getDiagnosesByDoctor(Doctor doctor) {
        // Реализация получения диагнозов, выставленных врачом
        return new ArrayList<>(); // Заглушка
    }
    @Override
    public Map<String, Integer> getSpecializationStatistics() {
        // Реализация статистики по специализациям врачей
        return new HashMap<>(); // Заглушка
    }
}