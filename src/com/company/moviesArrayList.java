package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class moviesArrayList {

    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();
        Scanner input = new Scanner(System.in);

//        Prompt the user to enter their favorite movie
        System.out.println("Enter the name of your favorite movie:");
        String response = input.nextLine();


        while (!response.equalsIgnoreCase("Q"))
        {
            movies.add(response);
            System.out.println("Enter another response or Q to quit");
            response = input.nextLine();

        }
        System.out.println("The movies you have entered are"+movies);

    }
}
