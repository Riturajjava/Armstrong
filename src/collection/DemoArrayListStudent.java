package collection;

import model.Stundent;

import java.util.ArrayList;

public class DemoArrayListStudent {

    public static void main (String[] args) {


        // maintain student data

        // ArrayList <DataType> OBJ_NAME=new ArrayList  <DataType>();

        ArrayList <Stundent> StudentArraylist=new ArrayList<>();
        // create records for student using parameterized constructor

    Stundent stundent1=new Stundent("Bhupendra",26,"CS");
    Stundent stundent2=new Stundent("Gourab",29,"Hardware");
    Stundent stundent3=new Stundent("Rishab",35,"technical");
    Stundent stundent4=new Stundent("Vindo",39,"Painter");


    //add data to the list
        StudentArraylist.add(stundent1);
        StudentArraylist.add(stundent2);
        StudentArraylist.add(stundent3);
        StudentArraylist.add(stundent4);

        // display records or data of students using for each loop

        for (Stundent var:StudentArraylist){
          System.out.println("Printing name "+var.getName());
          System.out.println("Printing age "+var.getAge());
          System.out.println("Printing branch "+var.getBranch());
        }

    }

}
