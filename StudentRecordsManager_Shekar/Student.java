import java.util.*;

public class Student {
    private String studentId;
    private String name;
    private int[] grades;

    public Student(String studentId, String name, int[] grades) {
        this.studentId = studentId;
        this.name = name;
        this.grades = grades;
    }

    public double getAverage() {
        return Arrays.stream(grades).average().orElse(0);
    }

    public char getLetterGrade() {
        double avg = getAverage();
        if (avg >= 90) return 'A';
        else if (avg >= 80) return 'B';
        else if (avg >= 70) return 'C';
        else if (avg >= 60) return 'D';
        else return 'F';
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(studentId).append("\n");
        sb.append("Name: ").append(name).append("\n");
        sb.append("Grades: ");
        for (int grade : grades) {
            sb.append(grade).append(" ");
        }
        sb.append("\n");
        sb.append("Average: ").append(String.format("%.2f", getAverage())).append("\n");
        sb.append("Letter Grade: ").append(getLetterGrade()).append("\n");
        return sb.toString();
    }
}
