package classes.students;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");  // Output: Hello World! (Prints a message)

        Student abhilash = new Student(); // Creating an instance of Student class for Abhilash
        abhilash.psp = 70; // Setting PSP score for Abhilash
        abhilash.age = 26; // Setting age for Abhilash
        abhilash.name = "Abhilash"; // Setting name for Abhilash
        abhilash.batchName = "April 23 Intermediate"; // Setting batch name for Abhilash

        Student naman = new Student(); // Creating an instance of Student class for Naman
        naman.email = "akl@email.com"; // Setting email for Naman
        naman.name = "Naman"; // Setting name for Naman
        naman.batchName = "May 23 Advance"; // Setting batch name for Naman

        abhilash.changeBatch("Feb 24 Advance");  // Changing the batch name for Abhilash
        naman.changeBatch("April 22 Intermediate"); // Changing the batch name for Naman
    }
}

/*

// Here Naman and Abhilash are different and they are independent
// Any changes that are made in the object naman will not affect Abhilash

// The example above illustrates that:
   - Each object is independent and has its own memory space.
   - Each object operates on its own set of attributes.
   - Changes made to one object's attributes do not affect the attributes of other objects.

 */
