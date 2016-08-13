import java.io.*;
import java.lang.*;
import java.util.*;
class Reversal
{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
StringBuffer s1=new StringBuffer(s);
StringBuffer s2=new StringBuffer();
s1.reverse();
System.out.println(s1);
for(int i=0;i<s1.length();i++)
{
 char a[]=new char[100];
 a[i]=s1.charAt(i);
 if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
 {
  s1.deleteCharAt(i);
 }
}
System.out.println(s1);
}
}  
