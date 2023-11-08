
class Student {
    private String fullName;
    private String phoneNumber;
    private String address;
    private String bankAccount;

    public Student(String fullName, String phoneNumber, String address, String bankAccount) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.bankAccount = bankAccount;
    }

    public String getFullName() {
        return fullName;
    }

    public void liveIn(Apartment apartment, Student[] students) {
        apartment.printApartmentDetailsWithStudents(students);
    }
}