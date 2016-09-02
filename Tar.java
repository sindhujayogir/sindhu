import java.io.*;
import java.util.*;
class Tar
{
public static void main(String ar[])
{
 Scanner s=new Scanner(System.in);
 int n=s.nextInt();
 int a[]=new int[n];
 int x=s.nextInt();
 for(int i=0;i<a.length;i++)
 {
  for(int j=i+1;j<a.length;j++)
  {
   if(a[i]+a[j]==x)
   {
     System.out.println(a[i]+" "+a[j]);
     break;
   }
  }
 }
}
}