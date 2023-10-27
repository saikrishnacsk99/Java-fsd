package oops;
class Person {
    String name;
    int age;
    // Constructor
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // Method to display information about the person
    public void displayInfo() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Class_object 
{
	public static void main(String[] args)
	{
	        // Creating objects of the Person class
	        Person person1 = new Person("John Doe", 25);
	        Person person2 = new Person("Jane Doe", 30);

	        // Accessing object properties
	        System.out.println("Details of person1:");
	        person1.displayInfo();

	        System.out.println("\nDetails of person2:");
	        person2.displayInfo();
	    }
}
