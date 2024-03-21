package exercism04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        String senha = "4539 3195 0343 6467";
        String senha2 = "8273 1232 7352 0569";
        System.out.println(validation(senha2));
    }

    private static Boolean validation(String args){

        if(args.length() <= 1 || args.isBlank()) return  false;
        args = args.replaceAll(" ","");
        args = args.replaceAll("(.)","$1.");



        List<String> primary = new ArrayList<String>(List.of(args.split("\\.")));

        List<Integer> secundary = primary
                .stream()
                .map(Integer::parseInt)
                .toList();

        long[] terciary = IntStream
                .range(0,secundary.size())
                .mapToLong( (i) -> {
                    var obj = secundary.get(i);
                    int filter1 = i % 2 == 0 ? obj * 2 : obj;
                    int filter2 = filter1 > 9 ? filter1 - 9 : filter1;
                    return filter2;

                })
                .toArray();

        int sum = Math.toIntExact(Arrays.stream(terciary).sum());

        return sum % 10 == 0;
    }
}
