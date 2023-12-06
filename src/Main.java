import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Создаем объекты для демонстрации
        MedicalRecord medicalRecord = new MedicalRecord();
        Doctor doctor = new DoctorBuilder()
                .setName("Светлана")
                .setAge(35)
                .setSpecialization("Терапевт")
                .build();

        Patient patient = new PatientBuilder()
                .setName("Вадим")
                .setAge(40)
                .setMedicalRecord(medicalRecord)
                .build();

        Clinic clinic = new ClinicBuilder()
                .addEmployee(doctor)
                .addPatient(patient)
                .build();

        // Создаем объекты для тестирования
        Administrator administrator = new Administrator();
        AppointmentManager appointmentManager = new AppointmentManager();
        appointmentManager.setClinic(clinic);
        AuthenticationService authService = new SimpleAuthenticationService();
        StatisticsManager statisticsManager = new StatisticsManager(clinic);

        // Добавляем сотрудника и пациента в клинику
        administrator.addEmployee(doctor, clinic);
        administrator.addPatient(patient, clinic);

        // Добавляем медицинские записи к пациенту
        medicalRecord.addMedicalEntry("ОРВИ");
        medicalRecord.addMedicalEntry("Отравление");
        medicalRecord.addMedicalEntry("Грипп");

        Date appointmentDate1 = new Date();
        String diagnosis1 = "Профилактический осмотр";
        appointmentManager.requestAppointment(patient, doctor, appointmentDate1, diagnosis1);

        // Аутентификация
        boolean isAuthenticated = authService.authenticate("user123", "password123");
        System.out.println("Аутентификация: " + isAuthenticated);

        // Запрос на запись на прием
        Date appointmentDate = new Date();
        String diagnosis = "Профилактический осмотр";
        boolean isAppointmentScheduled = appointmentManager.requestAppointment(patient, doctor, appointmentDate, diagnosis);
        System.out.println("Есть ли свободная дата: " + isAppointmentScheduled);

        // Вывод медицинской истории пациента
        List<String> medicalHistory = patient.getMedicalHistory();
        System.out.println("История болезни: " + medicalHistory);

        // Вывод диагноза последнего приема
        String lastDiagnosis = patient.getLastDiagnosis();
        System.out.println("Последний диагноз: " + lastDiagnosis);

//        // Получение статистики
//        int numberOfAppointments = statisticsManager.getNumberOfAppointmentsByDoctor(doctor);
//        System.out.println("Число записей у доктора Светланы: " + numberOfAppointments);
//
//        List<String> diagnoses = statisticsManager.getDiagnosesByDoctor(doctor);
//        System.out.println("Диагнозы, поставленные Светланой: " + diagnoses);
    }
}
