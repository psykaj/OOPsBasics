import java.util.Scanner;

interface client {
    void input(); //bydefault public and abstract
    void output(); //bydefault public and abstract
}

class pankaj implements client {

    String name;
    double sal;
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Username : ");
        name = sc.nextLine(); //input for String
        
        System.out.println("Enter Salary : ");
        sal = sc.nextDouble(); //input for double
    }
    
    public void output()
    {
        System.out.println("Username : " + name);
        System.out.println("Salary is : " + sal);
    }
}

public class Main
{
	public static void main(String[] args) 
	{
	    client c = new pankaj(); //reference variable
	    c.input();
	    c.output();
	}
}
