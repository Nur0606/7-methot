class Apartment {
    private String title;
    private double price;
    private String address;

    public Apartment(String title, double price, String address) {
        this.title = title;
        this.price = price;
        this.address = address;
    }

    public void payPerMonth(Student[] students) {
        double perStudentPayment = price / students.length;
        for (Student student : students) {
            System.out.println(student.getFullName() + " Babki za kajdomu: " + perStudentPayment);
        }
    }

    public void printApartmentDetailsWithStudents(Student[] students) {
        System.out.println("kvartira: " + title);
        System.out.println("kvartiranyn adresi: " + address);
        System.out.println("Stoimost: " + price);

        System.out.println("Studentu kotorye vzali v arendu:");
        for (Student student : students) {
            System.out.println(student.getFullName());
        }
    }
}
