package Chapters.chapter_13.listing_13.listing13_05;

import java.math.*;
import java.util.ArrayList;

public class LargestNumbers {
    public static void main(String[] args) {
        ArrayList<Number> list  = new ArrayList<>();

        list.add(45);
        list.add(3445.53);
        // add a bigInteger
        list.add(new BigInteger("3432323234344343101"));
        // add a bigdecimal
        list.add(new BigDecimal("2.0909090989091343433344343"));

        System.out.println("The largest number is "  + getLargestNumber(list));
    }

    public static Number getLargestNumber(ArrayList<Number> list) {
        if(list == null || list.size() == 0) {
            return null;
        }

        Number number = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if(number.doubleValue() < list.get(i).doubleValue()) {
                number = list.get(i);
            }
        }

        return number;
    }
}
