public class Student extends User {
    private String department;
    private String degree;

    public Student() {
    }

    public Student(String department, String degree) {
        this.department = department;
        this.degree = degree;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
