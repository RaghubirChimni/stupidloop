// @author rugger
// @version 1.0 11/24/18

import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = "";
    int k = 0;
    System.out.print("want to play?");
    s= scan.next();
    while(s.equalsIgnoreCase("yes"))
    {
      k = (int)(Math.random()*10);
      if(k==0)
        System.out.println("Hello");
      else if(k>0 && k<8)
        System.out.println("Random");
      else
        System.out.println("whatever");
      System.out.print("wanna do this again?");
        s = scan.next();

    }
  }
}
