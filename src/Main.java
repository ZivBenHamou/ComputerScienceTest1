import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AxisSystem axisSystem = new AxisSystem(); //this line displays the initial axis
        q1();
        q2();
        q3();
        q4();
        q5();
        q6();


    }

     public static void q1 () {
        AxisSystem axisSystem = new AxisSystem();
        axisSystem.addSinglePoint(100,150, "black");



    }
    public static void q2 (){
        AxisSystem axisSystem = new AxisSystem();
        axisSystem.addSinglePoint(-200,200,"black");
    }
public static void q3 (){
        AxisSystem axisSystem = new AxisSystem();
        axisSystem.addMultiplePoints(new int[]{50,50,60,60,70,70}, "black");
}
public static void q4 () {
        AxisSystem axisSystem = new AxisSystem();
        Scanner scanner = new Scanner(System.in);
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                axisSystem.addSinglePoint(x,y,"black");
}

public static void q5 () {
    AxisSystem axisSystem = new AxisSystem();
    Scanner scanner = new Scanner(System.in);

    System.out.println("enter how much points you want");
    int amount = scanner.nextInt();
    System.out.println("enter color");
    String color = scanner.next();
    Random random = new Random();
    for (int i = 0; 1 < amount; i++) {
        int x = random.nextInt(50);
        int y = random.nextInt(50);
        axisSystem.addSinglePoint(x, y, color);
    }
}
public static void q6() {
        AxisSystem axisSystem = new AxisSystem();
                int x = 5;
        int y = 2 * x + 100;
        for (int i = 0; i < 10 ; i++) {
            axisSystem.addSinglePoint(x,y,"black");
            x=x+1;
            y= 2 * x + 100;
        }



}

    }

