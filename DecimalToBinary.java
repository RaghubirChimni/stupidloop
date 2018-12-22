//@author Raghubir Chimni
// @version 11/24/2018
import java.util.*;
public class DecimalToBinary {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int a =0;
    a = scan.nextInt();
    System.out.print(decToBin(a));
  }
  public static String decToBin(int k)
  {
    String t = "";
    if(k==0)
      return "0";
    else if(k<0)
      return "0";
    else 
    {
      if(k%2==0)
        return decToBin(k/2) + "0";
      return decToBin(k/2) + "1";
  }
  }
}
