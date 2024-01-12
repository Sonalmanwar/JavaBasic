//Write a Java program to swap two numbers without using the third variable


class swapnum{

public static void main(String[]arg){
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);


}
}