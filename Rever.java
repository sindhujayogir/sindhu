import java.io.*;
import java.util.*;
class Rever
{
public static void main(String ar[])
{
 Scanner s=new Scanner(System.in);
 int n=s.nextInt();
 int m=0;
 int count=0;
 int d=n;
 while(d!=0)
 {
   d=d/10;
   count++;
 }
int a[]=new int[count];
int i=0;
while(n!=0)
 {
  m=n%10;
  a[i]=m;
  n=n/10;
  i++;
}
for(int j=0;j<count;j++)
{
System.out.print(a[j]);
}
}
}