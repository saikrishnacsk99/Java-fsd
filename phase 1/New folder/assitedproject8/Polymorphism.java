package oops;
class Animal
{
    public void makeSound()
    {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal 
{
    @Override
    public void makeSound() 
    {
        System.out.println("Woof!");
    }
}

class Cat extends Animal 
{
    @Override
    public void makeSound()
    {
        System.out.println("Meow!");
    }
}
public class Polymorphism 
{
	 public static void main(String[] args) {
	        Animal animal1 = new Dog();
	        Animal animal2 = new Cat();

	        animal1.makeSound(); 
	        animal2.makeSound(); 
	    }
	

}
