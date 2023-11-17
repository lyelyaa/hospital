import java.util.*;

interface StatisticsService {
    /**
     * Метод для получения числа записей на прием у конкретного врача.
     *
     * @param doctor Врач, для которого собирается статистика.
     * @return Число записей на прием у врача.
     */
    int getNumberOfAppointmentsByDoctor(Doctor doctor);

    /**
     * Метод для получения списка диагнозов, выставленных конкретным врачом.
     *
     * @param doctor Врач, для которого собирается статистика.
     * @return Список диагнозов, выставленных врачом.
     */
    List<String> getDiagnosesByDoctor(Doctor doctor);

    /**
     * Метод для получения статистики по специализациям врачей в поликлинике.
     *
     * @return Карта, где ключ - специализация врача, значение - количество врачей с этой специализацией.
     */
    Map<String, Integer> getSpecializationStatistics();
}
