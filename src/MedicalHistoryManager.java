import java.util.Collections;
import java.util.List;

class MedicalHistoryManager {
    /**
     * Метод для получения медицинской истории пациента.
     *
     * @param patient Пациент, чья медицинская история запрашивается.
     * @return Список записей в медицинской истории пациента.
     */
    public List<String> getMedicalHistory(Patient patient) {
        if (patient != null && patient.getMedicalRecord() != null) {
            return patient.getMedicalRecord().getMedicalHistory();
        } else {
            return Collections.emptyList();
        }
    }
}
