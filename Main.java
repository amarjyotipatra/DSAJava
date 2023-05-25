import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String num = sc.next();
    char lastNum = num.charAt(num.length() - 1);
    int lastDigit = Character.getNumericValue(lastNum);
    System.out.println("Last Number is " + lastDigit);
  }
}