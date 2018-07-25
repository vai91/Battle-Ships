package com.ekiner;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void getXCoordinates(){
        System.out.println("Enter the X coordinate for your ship:  ");
        x = input.nextInt();
        if(x > 9 || x < 0 ){
            System.out.println("Coordinates can only be between 0-9.");
            getXCoordinates();

        }else {

        }
    }
    public static void getYCoordinates(){
        System.out.println("Enter the Y coordinate for your ship:  ");
        y = input.nextInt();
    }
    static Scanner input = new Scanner(System.in);
    static int x,y;

    public static void main(String[] args) {
        System.out.println("**** Welcome to Battle Ships game! **** \n");
        System.out.println("Right now, the sea is empty.. \n");



        String[][] sea = new String[10][10];
        for(String[] row:sea){
            Arrays.fill(row," ");
        }

        System.out.println("   0123456789   ");
        for(int i=0; i<sea.length; i++){

            System.out.print(i + " |");
            for(int j=0; j<sea.length; j++){
                //Checking if the loop is running correctly by assigning indexes
                //to the appropriate places of the "sea" array.
                //sea[i][j] = Integer.toString(i) + Integer.toString(j);
                System.out.print(sea[i][j]);
            }
            System.out.println("| " + i);
        }

        System.out.println("   0123456789   ");


        //User input is being assigned to the variables, to place the ships at the
        //coordinates the user requests.
        int[][] coordinates = new int[5][2];
        for(int i=0; i<5; i++){
            getXCoordinates();
            getYCoordinates();
        }
        /*if(x > 9 || x < 0 ){
            for (int[] xCoordinate :coordinates){
                for(int yCoordinate : xCoordinate){

                }
            }
                System.out.println("Coordinates can be between 0-9. \n Enter the X coordinate for your ship: ");
        }else {

        }
        int x = input.nextInt();
        System.out.println("Enter the Y coordinate for your ship:  ");
        int y = input.nextInt();*/




    }
}
