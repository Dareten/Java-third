import java.lang.*;
public class BallTest {
    public static void main(String[] args) {
        Ball b1 = new Ball("Beta", 240);
        Ball b2 = new Ball("Charlie", 75);
        Ball b3 = new Ball("Delta");
        b3.setPrice(100);
        System.out.println(b1);
        b1.ballInfo();
        b2.ballInfo();
        b3.ballInfo();
    }
}