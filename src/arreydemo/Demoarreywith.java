package arreydemo;

import java.util.Scanner;

public class Demoarreywith {


    public void demo() {
    // SYNTAX of  Array : DataType [] variable_name={,,,}

    int[] arrey = {1, 23, 22, 5, 3};
    // advance loop for (Datatype variable : array/collection){}


    for (int name : arrey) {
        System.out.println("Printing value of advance loop " + name);
    }
    for (int i = 0; i < arrey.length; i++) {
        System.out.println("Printing value of normal loops " + arrey[i]);
    }
}
    public void demostringarrey() {
        // SYNTAX of  Array : DataType [] variable_name={,,,}

        String name[] = {"Rahul", "Raj", "Mukesh", "jay"};

        for (String var : name) {
            System.out.println("Printing value of advance loop " + var);
        }
        for (int i = 0; i < name.length; i++) {
            System.out.println("Printing value of normal loop " + name[i]);
        }
    }
        public void age () {
            double var[] = {56.23, 23.6, 12.6, 18.6, 45.6};

            for (double demo : var){
                System.out.println("Printing value of advance loop "+demo);
            }
        }

    public static void main (String[] args) {
        Demoarreywith object=new Demoarreywith();
        object.demo();
        object.demostringarrey();
        object.age();

        Scanner myObj = new Scanner(System.in);
        int []arrey=new int[5];
        for(int i=0;i<5;i++){
            System.out.println("please enter element of arrey");
            int input=myObj.nextInt();
            arrey[i]=input;
        }


    // advance loop for (Datatype variable : array/collection){}
       for (int name : arrey) {
           System.out.println("Printing value of advance loop " + name);
       }
}
}