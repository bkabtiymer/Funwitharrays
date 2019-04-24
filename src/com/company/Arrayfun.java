package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class Arrayfun{

    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        Scanner input = new Scanner(System.in);
//
//        Add colors to the array list and print out values
        color.add("blue");
        color.add("red");
        color.add("yellow");
        color.add("black");
        color.add("white");
//        Print out the values out index 1
        color.add(1, "purple");
        System.out.println("Colors in our list " + color.get(1));

//        Prompting the use to add one new color
        System.out.println("Please enter one new color: ");
        String colorResponse = input.nextLine();


        while
            (!colorResponse.equalsIgnoreCase("Q"))
            {
                color.add(colorResponse);
                System.out.println("Enter another color or q to quit : ");
                colorResponse= input.nextLine();



            }
        System.out.print("Colors in our list are now: " + color);
        }
    }
