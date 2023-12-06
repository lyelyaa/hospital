import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppointmentManager {
    /**
     * Список приемов, хранящихся в менеджере.
     */
    private List<Appointment> appointments;
    private Clinic clinic;
    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }
    /**
     * Конструктор для создания объекта AppointmentManager.
     */
    public AppointmentManager() {
        this.appointments = new ArrayList<>();
    }
    /**
     * Метод для запроса приема пациента к врачу.
     *
     * @param patient Пациент, который хочет записаться на прием.
     * @param doctor  Врач, к которому пациент хочет записаться.
     * @param date    Желаемая дата и время приема.
     * @return true, если прием успешно запрошен, иначе false.
     */
    public boolean requestAppointment(Patient patient, Doctor doctor, Date date, String diagnosis) {
        if (patient == null || doctor == null || date == null) {
            throw new IllegalArgumentException("Patient, doctor, and date cannot be null");
        }

        boolean isTimeSlotAvailable = isTimeSlotAvailable(doctor, date);

        if (isTimeSlotAvailable) {
            Appointment appointment = new Appointment(patient, doctor, date, diagnosis);
            appointments.add(appointment);

            // Добавляем диагноз в медицинскую историю пациента
            patient.getMedicalRecord().addMedicalEntry(diagnosis);

            return true;
        }
        return false;
    }


    /**
     * Метод для получения доступных временных слотов у врача на указанную дату.
     *
     * @param doctor Врач, для которого ищутся доступные слоты.
     * @param date   Дата, на которую ищутся слоты.
     * @return Список доступных временных слотов.
     */
    public List<Date> getAvailableSlots(Doctor doctor, Date date) {
        if (doctor == null || date == null) {
            throw new IllegalArgumentException("Doctor and date cannot be null");
        }

        List<Date> occupiedSlots = getAppointmentsForDoctorAndDate(doctor, date);

        // Предположим, что врач работает с 9:00 до 17:00 и приемы длится 1 час
        // Здесь можно добавить более сложную логику для определения свободных слотов
        List<Date> availableSlots = new ArrayList<>();
        long currentTime = date.getTime();
        long workEndTime = date.getTime() + 8 * 3600000; // 17:00

        while (currentTime < workEndTime) {
            Date timeSlot = new Date(currentTime);
            if (!occupiedSlots.contains(timeSlot)) {
                availableSlots.add(timeSlot);
            }
            currentTime += 3600000; // 1 час
        }

        return availableSlots;
    }

    /**
     * Проверяет, доступен ли временной слот у врача на указанную дату.
     *
     * @param doctor Врач, для которого проверяется доступность слота.
     * @param date   Дата, на которую проверяется доступность слота.
     * @return true, если слот доступен, иначе false.
     */
    private boolean isTimeSlotAvailable(Doctor doctor, Date date) {
        List<Date> occupiedSlots = getAppointmentsForDoctorAndDate(doctor, date);
        // Предположим, что врач принимает по 8 пациентов в день
        return occupiedSlots.size() < 8;
    }

    /**
     * Получает список временных слотов, занятых врачом на указанную дату.
     *
     * @param doctor Врач, для которого получается список слотов.
     * @param date   Дата, для которой получается список слотов.
     * @return Список временных слотов, занятых врачом.
     */
    private List<Date> getAppointmentsForDoctorAndDate(Doctor doctor, Date date) {
        List<Date> occupiedSlots = new ArrayList<>();
        for (Appointment appointment : appointments) {
            if (appointment.getDoctor().equals(doctor) && appointment.getDate().equals(date)) {
                occupiedSlots.add(appointment.getDate());
            }
        }
        return occupiedSlots;
    }

    private Appointment createAppointment(Patient patient, Doctor doctor, Date date, String diagnosis) {
        Appointment appointment = new Appointment(patient, doctor, date, diagnosis);
        appointment.setDiagnosis(diagnosis);
        return appointment;
    }
}
