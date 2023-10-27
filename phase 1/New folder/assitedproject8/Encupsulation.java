package oops;
class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age should be a positive integer.");
        }
    }
}

public class Encupsulation 
{
	    public static void main(String[] args)
	    {
	        Student student1 = new Student();
	        student1.setName("John");
	        student1.setAge(25);	        
	        System.out.println("Name: " + student1.getName());
	        System.out.println("Age: " + student1.getAge());
	    }
	


}
