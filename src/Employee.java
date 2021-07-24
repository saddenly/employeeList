public class Employee {
    private String name;
    private String surname;
    private int age;
    private String gender;
    private String education;
    private String specialty;
    private String department;

    public Employee(String name, String surname, int age, String gender, String education, String specialty, String department) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.education = education;
        this.specialty = specialty;
        this.department = department;
    }

    @Override
    public String toString() {
        return String.format("%-15s%-15s%-15d%-15s%-15s%-15s%-15s",
                name, surname, age, gender, education, specialty, department);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}