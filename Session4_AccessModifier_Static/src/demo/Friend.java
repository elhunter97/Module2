package demo;

public class Friend {
    String name;

    static int cntFriends;

    public Friend(String name) {
        this.name = name;
        cntFriends++;
    }
}
