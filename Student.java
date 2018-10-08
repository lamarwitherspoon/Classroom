package student;

import java.util.ArrayList;

public class Student  {

    private String firstname;

    private String lastname;

   public Double[] examsScores ;

    ArrayList<Double> examScores = new ArrayList<Double>();

   public Student (String firstname, String lastname, double testScores){

        this.firstname = firstname;

        this.lastname = lastname;


    }


    public String getFirstname() {
        return firstname;
    }


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public String getLastname(){

       return lastname;
    }


    public void setLastname(String lastname){

       this.lastname = lastname;
    }


    public int getNumberOfExamsTaken(){

       return getNumberOfExamsTaken();

    }

        public int getExamScores(){

       return getNumberOfExamsTaken();
        }

    public void addexamScore(double v) {

       this.examScores = examScores;
    }


        public void setExamsScores(int examsScores,double examscores){

       this.setExamsScores(examsScores, examscores);

        }




    }
