import java.util.*;
class MedicalHistoryManager {
    // Метод для получения медицинской истории пациента
    public List<String> getMedicalHistory(Patient patient) {
        return patient.getMedicalRecord().getMedicalHistory();
    }
}