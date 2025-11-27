package m08_POO;

public class Student {
    int score;

    public Student(int score) {
        this.score = score;

    }

    void aprobacion() {
        if (score >= 60 && score <= 100) {
            System.out.println("Fue aprobad@!!!");
        } else {
            System.out.println("No fue aprobad@");

        }
    }
}
