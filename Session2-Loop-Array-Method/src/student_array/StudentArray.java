package student_array;

import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] student = {"Bao Ngoc","The Anh","Thanh Long","Dao Hoang","Huy Hoang","Quang Truong","Anh Dung","Doan Quyen","Thanh Ngoc"};
        System.out.println("Enter student' name you need search: ");
        String searchName = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < student.length; i++) {
            if(student[i].equals(searchName)){
                System.out.print("Found student name is "+searchName+" at "+i);
                isExist = true;
                break;
            }
        }

        if (!isExist){
            System.out.println("Not found "+searchName);
        }

    }
}
