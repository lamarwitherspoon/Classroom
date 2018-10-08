package student;

public class Classroom {

    public int maxNumberofStudents;

    public Student[] students;

    public double averageExamScores;

    public Classroom(int maxNumberofStudents,Student[] students, double averageAverageExamScores){

        this.averageExamScores = averageAverageExamScores;

        this.maxNumberofStudents = maxNumberofStudents;

        this.students = students;
    }

    public Classroom(){

        int students = 30;

    }

    public Student[] getStudents() {
        return students;

    }

    public void setStudents(Student[] students) {
        this.students = students;

    }


    public Student getAverageExamScores( ){

        return getAverageExamScores();
    }

    public int setAverageExamScores(int num1, int num2){

       return (num1 + num2);


    }

    public Student addStudent(Student student){

        return student;
    }

    public  Student removeStudent(String firstName, String lastName){

        return removeStudent(firstName, lastName);
    }


    public Student getStudentbyScore(Student student){

        return student;
    }






}

