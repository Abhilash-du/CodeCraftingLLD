package example.accessmodifiers1;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();

        // Uncommenting the following lines will result in compilation errors due to access modifiers:
        // student.name = "abhi";  // private attribute, not accessible
        student.age = 12;        // default attribute, accessible within the same package
        student.gender = "Male"; // protected attribute, accessible within the same package
        student.email = "abhilash@email.com"; // public attribute, accessible from anywhere
    }
}
