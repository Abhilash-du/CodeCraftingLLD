package example.constructor;

public class Main {

    public static void main(String[] args) {
        // Creating an instance of Student with default constructor
        Student s = new Student(); // This will call the default constructor
        // Creating an instance of Student with custom constructor
        Student s2 = new Student("Abhi", 22, "Male"); // This will call the custom constructor
    }
}

/*
Explanation:
In the Main class, we create two instances of the Student class: s and s2.
For the first instance, s, the default constructor of Student is called.
For the second instance, s2, the custom constructor with parameters is called, passing the values "Abhi", 22, and "Male".

 */