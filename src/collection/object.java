package collection;

import java.util.ArrayList;

public class object {

    public void Employee(){

        ArrayList name=new ArrayList();
        name.add("Rammohan");
        name.add("Ramesh");
        name.add("Savitri");
        name.add("Himanshu");

        for (Object var: name){
            System.out.println("Printing list "+var);
        }
    }


    public static void main (String[] args) {
        object object=new object();
        object.Employee();
    }








}
