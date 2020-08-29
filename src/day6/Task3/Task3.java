package day6.Task3;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Иванов Иван Студентович");

        Teacher teacher = new Teacher("Сидоров Сидор Петрович", "Информатика");
        teacher.evaluate(student);
    }
}
