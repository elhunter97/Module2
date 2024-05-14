package fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,true,10,"yellow");
        Fan fan2 = new Fan(2,false,5,"blue");

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        outer:
        for (int i = 0; i <10; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.println(i+j);
                if(j==10){
                    break outer;
                }
            }
        }
    }
}
