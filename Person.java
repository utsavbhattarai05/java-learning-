public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Creating two instances of the Person class
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Printing the details of the first person
        System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());

        // Printing the details of the second person
        System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge());
    }
}
