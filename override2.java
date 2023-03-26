import java.util.*;

class Address
{
     void getAddress()
     {
       Scanner sc=new Scanner(System.in);
       String a=sc.next();
       Address obj=new Address();
       obj.setAddress(a);
      };

     void setAddress(String a)
     { System.out.println("address"+a); };
}



class HomeAddress extends Address
{
    void getAddress()
     {  Scanner sc=new Scanner(System.in);
        String a=sc.next();
        HomeAddress obj=new HomeAddress();
       obj.setAddress(a);
      };

     void setAddress(String a)
     { String s=a;
       System.out.println("home address - bihar" +s);  };
}


class OfficeAddress extends Address
{
    void getAddress()
     {  Scanner sc=new Scanner(System.in);
        String a=sc.next();
        OfficeAddress obj=new OfficeAddress();
        obj.setAddress(a);
     };

     void setAddress(String a)
     {
      System.out.println("Office address - bbs"+a);    
      };
}


class SchoolAddress extends Address
{
     void getAddress()
     {  Scanner sc=new Scanner(System.in);
       String a=sc.next();
       SchoolAddress obj=new SchoolAddress();
       obj.setAddress(a);
      };

        
     void setAddress(String a)
     {System.out.println("School address -"+a); };
}


public class Override2
{
 public static void main(String arg[])
{
    Address d=new Address();
    OfficeAddress  of=new OfficeAddress();
    SchoolAddress  sc=new SchoolAddress();
    HomeAddress  h=new HomeAddress();

    Address r;
    r=d; 
    r.getAddress();
    r=of;  
    r.getAddress();
    r=sc;   
    r.getAddress();
    r=h;   
    r.getAddress();
}
}  