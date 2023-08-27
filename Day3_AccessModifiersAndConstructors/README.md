# Access Modifiers in Object-Oriented Programming

In the previous section, we discussed the concept of Encapsulation and its advantages:

1. It holds related elements together, as we covered previously.
2. It protects the encapsulated elements from external influences, and to achieve this protection, we use **Access Modifiers**.

Access Modifiers allow us to control access to attributes and methods, preventing external classes or methods from directly accessing them.

```pseudo
Access Modifiers are like locks. They prevent external classes and methods from accessing attributes and methods directly, thus ensuring better control over the encapsulated elements.
```

In Java, there are four main access modifiers:

**Public**: The most permissive access modifier, allowing access from anywhere.

**Private**: Limits access to within the same class.

**Protected**: Allows access within the same class and within the same package.

**Default** (no modifier specified): Allows access within the same class, same package, but not outside the package.

Access Modifiers from most restricted to least restricted:

**Private**: Limits access to within the same class.

**Protected**: Allows access within the same class and the same package.

**Default**: Allows access within the same class and the same package.

**Default**: Provides the least restricted access, allowing access from anywhere.
Let's illustrate this with examples:

Assume we have a class called **'Student'**:
```java
class Student {
    private String name;  // Accessible only within the same class
    int age;             // Accessible within the same class and package
    String gender;
    Double psp;
    
    void performAction() {
        name = "Abhi";  // This works as it's inside the class
    }
}

```
Understanding the significance of default access, consider another class named **'Main'**:
```java
class Main {
    public static void main(String[] args) {
        Student s = new Student();  
        s.name = "Abhilash";  // This won't work as `name` is private
        s.age = 12;           // This works because it's in the same package
    }
}
```
When a class like **'Main2'**.java resides in a different package, the *'age'* attribute access is restricted due to the default access modifier.

### Child Classes and Access Modifiers: Extending the Boundaries

When it comes to child classes inheriting from parent classes, the interplay of access modifiers becomes crucial. While child classes inherit attributes and methods from their parent classes, their ability to access these inherited elements is influenced by the access modifiers.

Consider the scenario below:

```java
class User {
    private String email;
    String name;
}

class Student extends User {
    void performAction() {
        email = "abhi@email.com"; // This won't work as `email` is private
        name = "abhilash";       // This won't work due to the restricted default access modifier in the child class
    }
}
```
The Access Modifiers Hierarchy provides a clear structure of permissible access:
```plaintext
------------------------------------------------------------------------
| Access Modifier | Same Class | Same Package | Child Class | Anywhere |
|-----------------|------------|--------------|-------------|----------|
| Private         | Yes        | No           | No          | No       |
| Default         | Yes        | Yes          | No          | No       |
| Protected       | Yes        | Yes          | Yes         | No       |
| Public          | Yes        | Yes          | Yes         | Yes      |
------------------------------------------------------------------------
```
This hierarchy clarifies the level of accessibility for each access modifier, providing a structured approach to controlling the interactions between classes and promoting effective encapsulation.

In summary, understanding access modifiers in the context of child classes ensures that inheritance is coupled with controlled visibility, promoting effective encapsulation and well-structured class hierarchies.

### Constructors: Crafting New Instances

Constructors play a pivotal role in the object creation process within a class. A constructor is a specialized function with the same name as the class itself.

#### Default Constructor:

When a constructor isn't explicitly defined, Java automatically generates a default constructor. It initializes attributes to the default values of their corresponding data types.

```java
class Student {
    String name;    // Default value: null
    int age;        // Default value: 0
    Double pspl;    // Default value: null
    String univName;// Default value: null
}
```

### Custom Constructor:
Developers can create custom constructors to initialize objects with specific values. These constructors are created using the same name as the class and can accept parameters.

For example:
```java
class Student {
    public Student(String name, int age, String gender) {
        System.out.println("Constructor is starting");
        this.name += name + " xyz";
    }
}

```
A custom constructor empowers you to execute actions during object creation and tailor attribute initialization according to your requirements.

How a Custom Constructor Works:
1. Before executing the first line of the constructor, Java initializes object attributes with the default values of their data types.
2. If attributes are updated within the constructor, their default values are overridden.

By grasping the significance of Constructors, you gain mastery over the art of object creation. Whether it's through default constructors' automatic attribute initialization or custom constructors' tailored setup, constructors facilitate the birth of objects in a controlled and purposeful manner.

