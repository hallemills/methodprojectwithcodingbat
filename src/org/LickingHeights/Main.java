package org.LickingHeights;

public class Main {

    public static void main(String[] args) {
	// write your code here

        printGrettings("World");
        printGrettings("Friends");
        printGrettings("People");
        printGrettings("Universe");

        int a = 18;
        int b = 9;
        System.out.println(a-b);
        int c = a-b;
        int d = a - c;
        System.out.println(d);
        makeNumber800(d);
        System.out.println("Outside of method after it's called "+d);




    }


    public static void printGrettings(String noun){
        System.out.println("Hello " +noun);

    }
    public static int subtract( int firstNumber, int secondNumber) {
        int answer = firstNumber - secondNumber;

                return firstNumber - secondNumber;
    }
    public static int makeNumber800(int number){
        System.out.println("before number changes: "+ number);
        number = 800;
        System.out.println("after number changes: "+ number);
        return number;
    }
}