package count_student_pass;

import java.util.Scanner;

public class CountStudentPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do{
            System.out.println("Enter size(not exceed 30): ");
            size = sc.nextInt();
        }while(size<=0 || size>30);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Mark for student " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("List of mark: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int cnt = 0;
        for (int i = 0; i < size; i++) {
            if(checkPass(arr[i])){
                cnt++;
            }
        }
        System.out.print("The number of students passing the exam is "+cnt);

    }

    public static boolean checkPass(int mark){
        if(mark < 5){
            return false;
        }
        return true;
    }
}
