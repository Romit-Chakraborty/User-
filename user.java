import java.util.*;
class a
{
public static String []user={"John","Max","James"};
public static String []password={"123","456","789"};
void checka(String u,String p)
{
int i=0;int f=0;
for(i=0;i<=user.length-1;i++)
{
if(u.equals(user[i]) && p.equals(password[i]))
{
f=1;
}
}
if(f==1)
{
System.out.println("------------------Welcome to gmail inbox------------------");
}
else
{
System.out.println("Please try again :( Userid or Password is invalid :(");
}
}
public static void main(String []k)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter username");
String su=sc.next();
System.out.println("Enter password");
String sp=sc.next();
a ob=new a();
ob.checka(su,sp);
}
}