import java.util.Scanner;
public class StudentGradeCalculator{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("🎓 Welcome to the Student Grade Calculator");
        System.out.print("Enter the number of subjects:");
        int numSubjects=scanner.nextInt();
        int[] marks=new int[numSubjects];
        int totalMarks=0;
        for (int i=0; i<numSubjects;i++){
            System.out.print("Enter marks for Subject "+(i+1)+": ");
            marks[i] = scanner.nextInt();
            if (marks[i]<0 || marks[i]>100){
                System.out.println("❌ Invalid marks. Please enter between 0 and 100.");
                i--;
                continue;
            }
            totalMarks+=marks[i];
        }
        double average=(double)totalMarks/numSubjects;
        char grade;
        if(average>=90) grade='A';
        else if(average>=80) grade='B';
        else if(average>=70) grade='C';
        else if(average>=60) grade='D';
        else if(average>=50) grade='E';
        else grade='F';
        System.out.println("\n📊 --- Result ---");
        System.out.println("Total Marks: "+totalMarks+" / " +(numSubjects*100));
        System.out.printf("Average Percentage:%.2f%%\n",average);
        System.out.println("Grade: "+grade);
        scanner.close();
    }
}
