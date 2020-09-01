package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Петя", "Группа 250");
        System.out.println(student.getGroup());

        Teacher teacher = new Teacher("Ольга Борисовна", "Экономическая теория");
        System.out.println(teacher.getDiscipline());

        student.printInfo();

        teacher.printInfo();
    }
}
