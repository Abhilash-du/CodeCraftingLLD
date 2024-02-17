package Generics;

import java.util.ArrayList;

public class cwh_generics {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add("str1");
        arrayList.add(54);
        arrayList.add(642);

        //  if we want to store specific data type in the array list
        int a =(int) arrayList.get(0);
        System.out.println("HELLLLLW");
        System.out.println(a);

    }
}
