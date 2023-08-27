// File: Main.java in package example.accessmodifiers2
package example.accessmodifiers2;

import example.accessmodifiers1.Student;

public class Main {

    public static void main(String[] args) {
        Student s = new Student();

        // Uncommenting the following lines will result in compilation errors due to access modifiers:
        // s.name = "Abh";   // private attribute, not accessible
        // s.age = 14;       // default attribute, not accessible from a different package
        // s.gender = "Male"; // protected attribute, not accessible from a different package
        s.email = "abhi@email.com"; // public attribute, accessible from anywhere
        s.changeName("abhi"); // Updating private variable using a public method
    }
}
