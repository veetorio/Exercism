package exercism03;

import java.util.ArrayList;

import java.util.List;

public class Main {
    public static void main(String... args) {
        String combinationColor = "Red Black Blue";
        System.out.println(RepresationNumber(combinationColor));
    }

    private static String RepresationColor(String args) {
        String[] Array = new String[]{"Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White"};
        String array1 = args.substring(0, 2);
        String array2 = args.substring(2, args.length());

        String newCombination = "";

        for (int i = 0; i < array1.length(); i++) {
            int color = Integer.parseInt(String.valueOf(args.charAt(i)));
            newCombination += Array[color] + " ";
        }
        newCombination += Array[array2.length()];

        return newCombination;
    }


    private static String RepresationNumber(String args) {
        List<String> Array = new ArrayList<String>(List.of("Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White"));

        List<String> list = new ArrayList<>(List.of(args.split("\\s+")));
        List list1 = list.subList(0,2);
        List list2 = list.subList(2,3);
        String Combination = "";
        for (int i = 0; i < list1.size() ; i++) {
            Combination += Array.indexOf(list1.get(i));
        }
        int index = Array.indexOf(list2.get(0));
        for (int i = 0; i < index; i++) {
            Combination += 0;
        }
  
        return Combination + "ohms";
    }


}
