import java.util.Scanner;

class base 
{
    int age;
    String name ;
    Scanner sc = new Scanner(System.in);
    void getdata()
    {
        System.out.println("enter you name ");
        name = sc.nextLine();
        System.out.println("enter you age  ");
        age = sc.nextInt();
    }
     void showdata()
    {
        System.out.println(" you name "+name);
       
        System.out.println("you age  "+age);
       
    }
    
}
class Main extends base 
{
      int sem;
   String branch ;
    Scanner sc = new Scanner(System.in);
    void geta()
    {
        System.out.println("enter you semester ");
       branch = sc.nextLine();
        System.out.println("enter you branch  ");
        sem = sc.nextInt();
    }
     void showa()
    {
        System.out.println(" you semester "+sem);
       
        System.out.println("you  branch  "+branch);
       
    }
    public static void main(String[] arg )
    {
        Main ob = new Main();
        ob.geta();
        ob.showa();
        ob.getdata();
        ob.showdata();
    }
}
