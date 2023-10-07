import java.util.*;

class MedicalRecord {
    private List<String> medicalHistory;
    // Конструктор
    public MedicalRecord() {
        this.medicalHistory = new ArrayList<>();
    }
    // Метод для добавления записей в медицинскую историю
    public void addMedicalEntry(String entry) {
        medicalHistory.add(entry);
    }
    // Геттер для медицинской истории
    public List<String> getMedicalHistory() {
        return medicalHistory;
    }
}