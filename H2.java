import java.io.*;
import java.util.*;
class H2
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
 a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
 for(int j=i+1;j<n;j++)
 {
  if(a[i]==a[j])
  {
     System.out.println(a[i]);
     System.exit(0);
}
}
}
}
}