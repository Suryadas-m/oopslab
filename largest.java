import java.util.*;
class largest{
public static void main(String args[])
{
 int a,b,c;
 Scanner obj=new Scanner(System.in);
  
  System.out.println("type first number:");
  a=obj.nextInt();
  
  System.out.println("type first number:");
  b=obj.nextInt();
  
  System.out.println("type first number:");
  c=obj.nextInt();
  
 
 if(a>b&&a>c)
 {
  System.out.println("largest number:"+a);
  
 }
 else if(b>a&&b>c)
 {
  System.out.println("Largest number:"+b);
 }
 else
 {
  System.out.println("Largest number:"+c);
 }
}
}
