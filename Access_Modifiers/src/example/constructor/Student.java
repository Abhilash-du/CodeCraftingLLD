package example.constructor;

public class Student {

    String name = "abc"; // Default value for name attribute

    // Default Constructor
    public Student() {
        System.out.println("Custom Constructor without parameter is starting");
    }

    // Custom Constructor
    public Student(String name, int age, String gender) {
        System.out.println("Custom Constructor with parameter is starting");
        // Here, name=name would lead to confusion, so we use "this" to refer to the attribute of the object
        this.name = name; // "this.name" means the attribute value of the object, setting it explicitly
    }
}
