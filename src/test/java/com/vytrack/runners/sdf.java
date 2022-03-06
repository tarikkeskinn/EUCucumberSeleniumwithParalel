package com.vytrack.runners;

import java.util.Scanner;

public class sdf {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

       if (str.contains("bread")) {

           int first= str.indexOf("bread");
           int last= str.lastIndexOf("bread");

           if (first==last){

               System.out.println("Nothing");
           }else {
               System.out.println(str.substring(first+5, last));
           }



       }else System.out.println("Nothing");

    }
}
