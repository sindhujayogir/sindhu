import java.io.*;
import java.util.*;
class Vow
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
StringBuffer st=new StringBuffer(s1);
st.reverse();
System.out.println(st);
for(int i=0;i<st.length();i++)
{
if(st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i' || st.charAt(i)=='o' ||st.charAt(i)=='u' ||st.charAt(i)=='A' || st.charAt(i)=='E' || st.charAt(i)=='I' || st.charAt(i)=='O' ||st.charAt(i)=='U')
{
st.deleteCharAt(i);
}
System.out.print(st.charAt(i));
}
}
}