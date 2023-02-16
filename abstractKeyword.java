abstract class Animal 
{
    public void print()
    {
        System.out.println("Animal Class");
    }
      
}
class Dog extends Animal 
{
    public void printDog()
    {
        System.out.println("Dog Class");
    } 
}

public class Main
{
	public static void main(String[] args) 
	{
	    //we cannot create Object for abstract class but 
	    //we can make reference variable to access 
		Animal ani = new Dog(); //reference variable
		ani.print();
		Dog d = new Dog();
		d.printDog();
	}
}
