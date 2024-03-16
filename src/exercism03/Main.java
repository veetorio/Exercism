package exercism03;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String... args){
        String combinationColor = "221";
        System.out.println(RepresationColor(combinationColor));
    }

    private static String RepresationColor(String args){
        String[] Array = new String[]{"Black","Brown","Red","Orange","Yellow","Green","Blue","Violet","Grey","White"};
        String array1 = args.substring(0,2);
        String array2 = args.substring(2,args.length());

        String newCombination = "";

        for (int i = 0; i < array1.length() ; i++) {
            int color = Integer.parseInt(String.valueOf(args.charAt(i)));
            newCombination += Array[color] + " ";
        }
        newCombination += Array[array2.length()];

        return newCombination;
    }
}
