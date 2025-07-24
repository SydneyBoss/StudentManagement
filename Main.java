import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Students s1;
      StudentService ss=new StudentService();
      boolean endFlag = true;
      while (true) {
        System.out.println("1.Add the student");
        System.out.println("2.Delete the student");
        System.out.println("3.Update the student");
        System.out.println("4.View all students");
        System.out.println("5.View by RollNo");
        System.out.println("6.Exit");
        int choice=sc.nextInt();
        switch (choice){
          case 1:
            System.out.println("Enter the RollNo");
            int r =sc.nextInt();
            System.out.println("Enter the Name");
            String na =sc.next();
            System.out.println("Enter the Age");
            int age =sc.nextInt();
            System.out.println("Enter the City");
            String city =sc.next();
            System.out.println("Enter the Course");
            String cour =sc.next();
            s1=new Students(r,na,age,city,cour);
            ss.addStudent(s1);
            break;
          case 2:
            System.out.println("Enter the RollNo you want to delete");
            int rn =sc.nextInt();
            ss.deleteStudent(rn);
            break;
          case 3:
            System.out.println("Enter the new RollNo");
            int rnn =sc.nextInt();
            System.out.println("Enter the new Name");
            String naa =sc.next();
            System.out.println("Enter the new Age");
            int ages =sc.nextInt();
            System.out.println("Enter the new City");
            String citys =sc.next();
            System.out.println("Enter the new Course");
            String cours =sc.next();
            s1=new Students(rnn,naa,ages,citys,cours);
            ss.updateStudent(rnn,s1);
            break;
          case 4:
            ss.viewStudents();
            break;
          case 5:
            System.out.println("Enter the RollNo you want to see");
            int rnnn =sc.nextInt();
            ss.viewById(rnnn);
            break;
          case 6:
            endFlag=false;
            break;
        }


      }
    }
}