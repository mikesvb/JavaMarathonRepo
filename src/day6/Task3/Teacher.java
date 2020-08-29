package day6.Task3;

public class Teacher {
    private String fio;
    private String discipline;

    public Teacher(String fio, String discipline) {
        this.fio = fio;
        this.discipline = discipline;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public void evaluate(Student student){

        int assessment = (int) ( Math.random() * 4 + 2 );

        String assessmentText="";
        switch (assessment){
            case 2:
                assessmentText="Неудовлетворительно";
                break;
            case 3:
                assessmentText="Удовлетворительно";
                break;
            case 4:
                assessmentText="Хорошо";
                break;
            case 5:
                assessmentText="Отлично";
                break;
            default:
                assessmentText="Неизвестная оценка";
        }

        System.out.println("Преподаватель "+ this.getFio() +" оценил студента с именем "+ student.getFio() +" по предмету "+ this.getDiscipline() +" на оценку "+ assessmentText +".");
    }
}
