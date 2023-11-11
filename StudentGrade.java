import java.util.Scanner;
 
public class StudentGrade {
    public static void main(String[] args) {
        int count, i;
        float totalMarks = 0, percentage, average;
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Enter Number of Subject");
        count = scanner.nextInt();
 
        System.out.println("Enter Marks of " + count + " Subject");
        for (i = 0; i < count; i++) {
            totalMarks += scanner.nextInt();
        }
        System.out.println("Total MArks : " + totalMarks);
        average = totalMarks/4;
        System.out.println("Average percentage is: "+average);
        System.out.print("The student Grade is: ");
        if(average>=80)
        {
            System.out.print("A");
        }
        else if(average>=60 && average<80)
        {
           System.out.print("B");
        } 
        else if(average>=40 && average<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}
