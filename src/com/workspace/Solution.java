/**
 * Author : beeyeas@gmail.com
 * Program to read a string and load into array list ... do some operations
 */

package com.workspace;

import java.io.*;
import java.util.*;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //double d = scan.nextDouble();
        //scan.nextLine();
        ArrayList<String> seriesList = new Arraylist<String> ();
        for (i=0;i<n;i++){
            String series = scan.nextLine();
            seriesList.add(series);
        }


    }
}