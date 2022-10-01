package week02;

class Driver {
    public static void main(String[] args) {
        Student kavindu = new Student();
        kavindu.setRegNo("115");
        kavindu.setFirstName("Kavindu");
        kavindu.setLastName("Kavishwara");
        kavindu.setEmail("kavindu@abc.lk");
        kavindu.setContactNo("0711234567");
        kavindu.setAge(12);
        kavindu.printDetails();
    }
}

class Student {
    private String regNo;
    private String firstName;
    private String lastName;
    private String email;
    private String contactNo;
    private int age;

    public Student(){
        
    }

    public Student(String regNo, String firstName, String lastName, String email, String contactNo, int age){
        setRegNo(regNo);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setContactNo(contactNo);
        setAge(age);
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getRegNo() {
        return this.regNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 5000) {
            this.age = age;
        }else{
            throw new RuntimeException("Age should be in 0 to 5000 range");
        }
    }

    void printDetails() {
        System.out.println(firstName + " " + lastName + " " + age);
    }

}
