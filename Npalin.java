import java.io.*;
import java.util.*;
class Npalin
{
 public static void main(String ar[])
 {
   Scanner s=new Scanner(System.in);
   String s1=s.nextLine();
   int l=s1.length();
   int a[]=new int[s1.length()];
   char ch[]=s1.toCharArray();
   for(int i=0;i<ch.length;i++)
  {
    for(int j=i+1;j<ch.length;j++)
    {
       if(s1.charAt(i)!=s1.charAt(j))
        {
           String s2=s1.substring(i,j+1);
           int n=s2.length();
           //String s3=s2.reverse();
           StringBuffer st=new StringBuffer(s2);
           st.reverse();
           String b=new String(st);
           if(!(s1.equals(b)))
           {
              a[i]=n;
            }
          }
      }
 }
int m=a[0];
for(int i=1;i<a.length;i++)
{
  if(m<a[i])
 {
   m=a[i];
  }
}
System.out.println(m);
}
}