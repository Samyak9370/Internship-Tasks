import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks for Maths: ");
        int mark1 = sc.nextInt();

        System.out.print("Enter marks for Physics: ");
        int mark2 = sc.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int mark3 = sc.nextInt();

        int totalMarks = mark1 + mark2 + mark3;
        double average_percentage = (totalMarks / 3);

        String grade = calculateGrade(average_percentage);

        System.out.println("Student Name: " + name);
        System.out.println("Total Marks Obtained(Out of 300): " + totalMarks);
        System.out.println("Average Percentage: " + average_percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }

    public static String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 80) {
            return "B";
        } else if (percentage >= 70) {
            return "C";
        } else if (percentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
