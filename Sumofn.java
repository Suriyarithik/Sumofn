# Sumofn
import java.io.*;
import java.util.*;
public class Sumofn
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=10;
    int sum=0;
    n=n*(n+1)/2;
    for(int i=0;i<=n;i++)
    {
      sum=sum+i;
      System.out.println(sum);
    }
  }
}  
