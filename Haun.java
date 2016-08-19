import java.io.*;
import java.util.*;
class Haun
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int temp=0;
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int b[]=new int[n];
for(int i=0;i<n;i++)
{
 for(int j=i+1;j<n;j++)
{
 if(a[i]<a[j])
 {
   temp=a[i];
   a[i]=a[j];
   a[j]=temp;
}
}
}
for(int i=0;i<n;i++)
{
 System.out.print(a[i]);
}
}
}
   