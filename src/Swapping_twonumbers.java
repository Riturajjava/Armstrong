public class Swapping_twonumbers {

    public static void main (String[] args) {

        int x=10;
        int y=20;

        System.out.println("befor sawapping number");
        System.out.println("value of x is "+x);
        System.out.println("value of y is "+y);

        //add both the numbers and assign it to first
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After sawapping Number");
        System.out.println("Value of x is "+x);
        System.out.println("value of y is "+y);


    }
}
