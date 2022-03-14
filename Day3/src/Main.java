public class Main {
    public static void main (String[] args) {
        Student student = new Student("Java ", "4. Sınıf");
        StudentManager studentManager = new StudentManager();
        studentManager.add(student);

        User user = new User(1, "LeylaJava" , "ley@etiya", "etiya");
        UserManager userManager = new UserManager();
        userManager.add(user);

        Instructor instructor = new Instructor("Engin", "Demiroğ");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);


    }
}
