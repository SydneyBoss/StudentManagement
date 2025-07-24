
import java.util.*;
import java.util.Map;


public class StudentService {
    Students s1;
    Scanner sc=new Scanner(System.in);
    HashMap<Integer, Students> rollMap = new HashMap<>();

    public void addStudent(Students s) {
        rollMap.put(s.RollNo(), s);
        System.out.println(s.RollNo() + " Added sucessfully");
    }

    public void viewStudents() {
        for (Map.Entry<Integer, Students> entry : rollMap.entrySet()) {
            Integer key = entry.getKey();
            Students obj = entry.getValue();
            System.out.println("ID: " + key);
            System.out.println("Name: " + obj.Name());
            System.out.println("Age: " + obj.Age());
            System.out.println("City: " + obj.City());
            System.out.println("Course: " + obj.Course());
            System.out.println("------------");
        }
    }

    public void viewById(int id) {
        for (Map.Entry<Integer, Students> entry : rollMap.entrySet()) {
            Integer key = entry.getKey();
            Students obj = entry.getValue();
            if (key == id) {
                System.out.println("ID: " + key);
                System.out.println("Name: " + obj.Name());
                System.out.println("Age: " + obj.Age());
                System.out.println("City: " + obj.City());
                System.out.println("Course: " + obj.Course());
                System.out.println("------------");
            }
        }
    }

    public void deleteStudent(int id) {
        if (rollMap.containsKey(id)) {
            rollMap.remove(id);
            System.out.println("Deleted Successfully.....");
        } else {
            System.out.println("Student not found.....");
        }
    }


    public void updateStudent(int id, Students s){
        if (rollMap.containsKey(id)) {
            rollMap.remove(id);
            rollMap.put(s.RollNo(), s);
            System.out.println("Updated Successfully...");
        } else {
            System.out.println("Student not found...");
        }
    }

}
