package d14multidimensionalarrays_arraylist;

import java.util.ArrayList;

public class DnmArrayList01 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
       //add()
        names.add("Tuba");
        names.add("Hamit");
        names.add("Kubra");
        names.add("Nur");
        System.out.println("names = " + names);//[Tuba, Hamit, Kubra, Nur]
        //set()
        String setEdilenIsim = names.set(3, "Ali");
        System.out.println("setEdilenIsim= " + setEdilenIsim);
        System.out.println("names = " + names);//[Tuba, Hamit, Kubra, Ali]
        //get()
        System.out.println("names.get(1) = " + names.get(1));//Hamit
        ArrayList<String> newNames = new ArrayList<>();
        newNames.add("Nur");
        newNames.add("Ecren");
        //addAll()
        names.addAll(newNames);
        System.out.println("names = " + names);//[Tuba, Hamit, Kubra, Ali, Nur, Ecren]
        System.out.println("names.size() = " + names.size());//6



    }
}
