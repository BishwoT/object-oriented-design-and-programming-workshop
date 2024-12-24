package workshop1;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
        this.age = 21; 
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class qn15 {
    public static void main(String[] args) {
        Person person1 = new Person("Arpan", 20);  
        Person person2 = new Person("Aakriti");   

        System.out.println("Person 1 Details:");
        person1.printDetails();  

        System.out.println("Person 2 Details:");
        person2.printDetails();  
    }
}
