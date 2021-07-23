package collection;

import java.util.ArrayList;

public class Arreylist {

    public void demo() {
// ArrayList  OBJ_NAME=new ArrayList ();

        ArrayList list = new ArrayList();// Without datatype
        list.add("pune");
        list.add("Jaipur");
        list.add("Jhansi");
        list.add("java");

     for(Object var: list){
         System.out.println("Printing list..."+var);

     }
    }
    //GENERICS : Tells the datatype of collection

    public void Generics() {

        ArrayList<Integer> listofmarks = new <Integer>ArrayList();
        listofmarks.add(22);
        listofmarks.add(56);
        listofmarks.add(58);
        listofmarks.add(49);
        listofmarks.add(19);

        for (int var : listofmarks) {
            System.out.println("Printing listofmarks " + var);
        }
        System.out.println("Usnig get on listofmarks "+listofmarks.get(0));

     ArrayList<String> cityname=new <String>ArrayList();
        cityname.add("Varanasi");
        cityname.add("Rajasthan");
        cityname.add("Manali");
        cityname.add("Bengaluru");

     for (String var:cityname){
         System.out.println("Printing of cityname "+var);
     }

     ArrayList<Double> price=new ArrayList<>();
     price.add(55.3);
     price.add(71.23);
     price.add(41.6);
     price.add(42.5);

      System.out.println("Using GET on "+cityname.get(1) );
     for (double var: price){
         System.out.println("Printing price of list "+var);

     }
    }

    public static void main (String[] args) {
        Arreylist obj=new Arreylist();
        obj.demo();
        obj.Generics();


    }













}
