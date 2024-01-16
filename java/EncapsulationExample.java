public class EncapsulationExample {
    private String name;
    private int age;

    // Constructor
    public EncapsulationExample(String name, int age) {
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

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be a positive number.");
        }
    }

    public static void main(String[] args) {
        EncapsulationExample example = new EncapsulationExample("Ali", 26);

        // Accessing private variables using getters
        System.out.println("Name: " + example.getName());
        System.out.println("Age: " + example.getAge());

        // Modifying private variables using setters
        example.setName("Rehman");
        example.setAge(30);

        // Displaying updated information
        System.out.println("Updated Name: " + example.getName());
        System.out.println("Updated Age: " + example.getAge());
    }
}
