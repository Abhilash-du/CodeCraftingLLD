// File: Student.java in package example.accessmodifiers1
package Day3_AccessModifiersAndConstructors.src.example.accessmodifiers1;

public class Student {
    private String name;
    int age;
    protected String gender;
    public String email;

    void do1() {
        name = "abhi"; // Can access 'name' from within the same class because it's private
    }

    public void changeName(String newName) {
        name = newName; // Updating private variable using a method
    }
}
