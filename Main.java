import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public  static void main(String[] args){

        ArrayList<Student> students = new ArrayList<>();
        System.out.println("Nhap so sinh vien: ");
        int n = scanner.nextInt();

        for(int i=0;i<n;i++){
            Student student = new Student();
            student.input();
            students.add(student);
        }

        for(int i=0;i<n;i++){
            students.get(i).output();
        }
    }
}