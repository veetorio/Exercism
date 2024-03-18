package exercism04;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String senha = "4539 3195 0343 6468";
        String senha2 = "8273 1232 7352 0569";
        System.out.println("[8,5,6,9,6,1,9,5,0,3,8,3,3,4,3,7]");
        System.out.println(validation(senha));
    }

    private static Boolean validation(String args){

        if(args.length() <= 1 || args.isBlank()) return  false;
        args = args.replaceAll(" ","");
        args = args.replaceAll("(.)","$1.");
        System.out.println(args);


        List<String> primary = new ArrayList<String>(List.of(args.split("\\.")));

        List<Integer> secundary = primary
                .stream()
                .map(Integer::parseInt)
                .toList();

        List<Integer> terciary = secundary
                .stream()
                .map(item -> {
                    int index = secundary.indexOf(item);
                    return index % 2 == 0? item * 2 > 9 ? item * 2 - 9 : item * 2 : item ;
                })
                .toList();

        Integer sum = terciary
                .stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);

        return sum % 10 == 0;
    }
}
