/**
 * Author : beeyeas@gmail.com
 * Generate random date
 */

package com.workspace;

import java.util.*;
import java.text.*;
class RandomDateGen{
public static void main(String[] args) {
        Long max =0L;
        Long min =100000000000L;
        //Use the date format that best suites you
        SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy");

        for (int i = 0; i <= 10; i++) {
            Random r = new Random();
            Long randomLong=(r.nextLong() % (max - min)) + min;
            Date dt =new Date(randomLong);
            System.out.println("Generated Long:"+ randomLong);
            System.out.println("Date generated from long: "+spf.format(dt));
        }
    }
}