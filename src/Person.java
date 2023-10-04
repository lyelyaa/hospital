import java.util.Date;

public abstract class Person {
    private int id;
    private String name;
    private String gender;
    private Date dateOfBirth;
    private String contactInfo;

    // Конструктор
    public Person(int id, String name, String gender, Date dateOfBirth, String contactInfo) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.contactInfo = contactInfo;
    }

    // Геттеры и сеттеры
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void updateContactInfo(String newContactInfo) {
        this.contactInfo = newContactInfo;
    }

    // Абстрактный метод для получения информации о персоне
    public abstract String getDetails();
}
