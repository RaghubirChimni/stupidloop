// @author Raghubir Chimni
// @version 1.0 11/24/18

import java.util.*;
public class SubFactorial {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int k =0;
    k = scan.nextInt();
    System.out.print(subFact(k));
  }
  public static int subFact(int a)
  {
    if(a==0)
      return 1;
    else if(a==1)
      return 0;
    else 
      return (a-1)*(subFact(a-1)+subFact(a-2));

  }
}
