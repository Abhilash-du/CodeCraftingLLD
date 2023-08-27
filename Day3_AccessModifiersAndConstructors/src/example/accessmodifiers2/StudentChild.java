// File: StudentChild.java in package example.accessmodifiers2
package example.accessmodifiers2;

import example.accessmodifiers1.Student;

public class StudentChild extends Student {

    void doSomething() {
        // Uncommenting the following lines will result in compilation errors due to access modifiers:
        // name = "Abhi";  // private attribute, not accessible
        // age = 12;       // default attribute, not accessible from a different package
        gender = "Male"; // protected attribute, accessible in the child class
        email = "abho@email.com"; // public attribute, accessible from anywhere
    }
}


/*

In the Student class:
1. The name attribute is set to a default value of "abc".
2. The default constructor doesn't take any parameters and outputs a message.
3. The custom constructor takes parameters name, age, and gender, and sets the name attribute using the this keyword to
distinguish it from the parameter name.
 */