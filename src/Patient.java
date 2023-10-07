class Patient extends Person {
    private MedicalRecord medicalRecord;

    public Patient(String name, int age, MedicalRecord medicalRecord) {
        super(name, age);
        this.medicalRecord = medicalRecord;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }
}