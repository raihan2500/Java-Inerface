package E102;

public class Quiz implements Measurable{
    private double score;
    private String grade;

    public Quiz(double score, String grade) {
        this.score = score;
        this.grade = grade;
    }

    @Override
    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Score: " + score + "\n" +
                "Grade: " + grade + "\n";
    }
}
