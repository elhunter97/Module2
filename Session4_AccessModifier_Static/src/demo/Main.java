package demo;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Friend friend = new Friend("Ngoc");
        Friend friend2 = new Friend("Linh");
        Friend friend3 = new Friend("Anh");
        System.out.println(Friend.cntFriends);
    }
}
