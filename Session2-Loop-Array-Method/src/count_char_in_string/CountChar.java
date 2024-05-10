package count_char_in_string;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s ="avfsdfspripaewzxczjsdjfwq";
        System.out.println("Enter character you want to count");
        char cCnt = sc.next().charAt(0);
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==cCnt){
                cnt++;
            }
        }
        System.out.println("Appear: "+cnt);
    }
}
