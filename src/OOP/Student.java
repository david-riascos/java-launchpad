package OOP;

public class Student {

    private int score;

    Student(){

    }

    public Student(int score) {
        this.score = score;
    }

    public void Score(){

        if(this.score >= 60){
            System.out.println("Aproved");
        }else{
            System.out.println("Not Aproved");
        }

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
