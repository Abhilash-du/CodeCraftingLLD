package Day2_IntroToLLDandOOP.src.classes.students;

public class Student {

    //Attributes:-
    String name;
    int age;
    String email;
    String password;
    double psp;
    String batchName;

    // Methods:-
    void changeBatch(String newBatchName){
        batchName=newBatchName;

    }
    void updatePsp(double offset){
        // updates problem solving percentage
        psp+=offset;
    }

    void printNameWithHello(){
        System.out.println(name +"  ,Hello!");
    }
}
