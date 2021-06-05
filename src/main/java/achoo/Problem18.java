package achoo;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Kelleher
 */
public class Problem18 {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.print("Enter C to convert from Fahrenheit to Celsius or F to convert from Celsius to Fahrenheit ");
        String e = a.next();
        double t;
        if(e.equals("C")){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            t = a.nextDouble();
            t = (t-32)*(5/9);
            System.out.println("The temperature in Celsius is "+t);
        }
        else if(e.equals("F")){
            System.out.print("Please enter the temperature in Celsius: ");
            t = a.nextDouble();
            t = (t*9/5)+32;
            System.out.println("The temperature in Fahrenheit is "+t);
        }
    }
}
