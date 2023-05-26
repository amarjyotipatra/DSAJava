import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
  public static void main(String args[]) throws IOException {
    Scanner sc = new Scanner(System.in);
    int testcase = sc.nextInt();
    for (int i = 0; i < testcase; i++) {
      int hour = sc.nextInt();
      int minute = sc.nextInt();
      double hourAngle = (hour % 12 + minute / 60.0) * 30;
      int minuteAngle = minute * 6;
      int angle = (int)Math.abs(hourAngle - minuteAngle);
      if (angle > 180) {
        angle = 360 - angle;
      }
      System.out.println(angle);
    }
  }
}
