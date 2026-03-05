public class App {

    public static char calculateGrade(int m1, int m2, int m3) {

        int total = m1 + m2 + m3;
        double average = total / 3.0;

        if (average >= 90) {
            return 'A';
        } else if (average >= 75) {
            return 'B';
        } else if (average >= 60) {
            return 'C';
        } else if (average >= 50) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {

        int m1 = 85;
        int m2 = 90;
        int m3 = 80;

        char grade = calculateGrade(m1, m2, m3);

        System.out.println("Student Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Grade: " + grade);
    }
}
