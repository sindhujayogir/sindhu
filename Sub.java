import java.io.*;
import java.util.*;
class Sub
{
public static void main(String ar[])
{
 Scanner s=new Scanner(System.in);
 String s1=s.nextLine();
 int l=s1.length();
 int a[]=new int[s1.length()];
 char ch[]s1.toCharArray();
 for(int i=0;i<ch.length;i++)
 {
  for(int j=i+1;ch.length;j++)
  {
   if(ch[i]!=ch[j])
   {
   String s2=s1.substring(i,j+1);
   int l2=s2.length();
   String s3=s2.reverse();
   StringBuffer st=new StringBuffer(s3);
   if(!(s2.equals(st)))
   {
     a[i]=l-l2;
   }
  }
 }
}
 int k=a[0];
 for(int i=1;i<a.length;i++)
 {
  if(k<a[i])
  {
   k=a[i];
  }
 }
System.out.println(k);
}
}