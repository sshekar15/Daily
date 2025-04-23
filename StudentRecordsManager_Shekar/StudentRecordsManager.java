import java.io.*;
import java.util.*;

/**
 * Main class that manages student records.
 * Demonstrates file I/O and exception handling in Java.
 */
public class StudentRecordsManager {

    public static void main(String[] args) {
        StudentRecordsManager manager = new StudentRecordsManager();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter input filename: ");
            String inputFile = scanner.nextLine();

            System.out.print("Enter output filename: ");
            String outputFile = scanner.nextLine();

            manager.processStudentRecords(inputFile, outputFile);
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    public void processStudentRecords(String inputFile, String outputFile) {
        try {
            List<Student> students = readStudentRecords(inputFile);
            writeResultsToFile(students, outputFile);
            System.out.println("Student records processed.");
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
            System.err.println("Please check the path and spelling.");
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
            System.err.println("Please check disk space and file permissions.");
        }
    }

    public List<Student> readStudentRecords(String filename) throws IOException {
        List<Student> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNumber = 0;

            while ((line = reader.readLine()) != null) {
                lineNumber++;
                try {
                    String[] parts = line.split(",");
                    if (parts.length < 6) {
                        throw new ArrayIndexOutOfBoundsException("Line " + lineNumber + ": Not enough fields.");
                    }

                    String studentId = parts[0].trim();
                    String name = parts[1].trim();
                    int[] grades = new int[4];

                    for (int i = 0; i < 4; i++) {
                        grades[i] = Integer.parseInt(parts[i + 2].trim());
                        if (grades[i] < 0 || grades[i] > 100) {
                            throw new InvalidGradeException("Line " + lineNumber + ": Grade out of range: " + grades[i]);
                        }
                    }

                    students.add(new Student(studentId, name, grades));
                } catch (NumberFormatException e) {
                    System.err.println("Line " + lineNumber + ": Invalid number format - " + e.getMessage());
                } catch (InvalidGradeException | ArrayIndexOutOfBoundsException e) {
                    System.err.println("Line " + lineNumber + ": " + e.getMessage());
                }
            }
        }

        return students;
    }

    public void writeResultsToFile(List<Student> students, String filename) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println("=== Student Report ===");
            writer.println("----------------------");

            int total = 0;
            double sum = 0;
            int aCount = 0, bCount = 0, cCount = 0, dCount = 0, fCount = 0;

            for (Student s : students) {
                writer.println(s.toString());
                total++;
                double avg = s.getAverage();

                sum += avg;
                switch (s.getLetterGrade()) {
                    case 'A' -> aCount++;
                    case 'B' -> bCount++;
                    case 'C' -> cCount++;
                    case 'D' -> dCount++;
                    case 'F' -> fCount++;
                }
            }

            writer.println("\n=== Statistics ===");
            writer.println("Total students: " + total);
            writer.printf("Class average: %.2f%n", total > 0 ? sum / total : 0);
            writer.println("Grade Distribution:");
            writer.println("A: " + aCount);
            writer.println("B: " + bCount);
            writer.println("C: " + cCount);
            writer.println("D: " + dCount);
            writer.println("F: " + fCount);
        }
    }
}
