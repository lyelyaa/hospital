import java.util.*;

interface StatisticsService {
    // Методы для предоставления статистической информации о работе поликлиники
    int getNumberOfAppointmentsByDoctor(Doctor doctor);
    List<String> getDiagnosesByDoctor(Doctor doctor);
    Map<String, Integer> getSpecializationStatistics();
}