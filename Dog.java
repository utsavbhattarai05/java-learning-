public class Dog {
    private String name;
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static void main(String[] args) {
        // Creating two instances of the Dog class
        Dog dog1 = new Dog("Buddy", "Labrador");
        Dog dog2 = new Dog("Charlie", "Golden Retriever");

        // Printing the details of the initial dogs
        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());

        // Modifying attributes using setter methods
        dog1.setName("Max");
        dog2.setBreed("Poodle");

        // Printing the details of the updated dogs
        System.out.println("Updated Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Updated Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());
    }
}
