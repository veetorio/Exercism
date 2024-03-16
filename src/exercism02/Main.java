package exercism02;

public class Main {
    public static void main(String... args){
        String hello = "hello world";
        System.out.println(reversed(hello));


    }



    private static String reversed(String array){
        var reversedArray = "";
        for(int i = array.length(); 0 < i; i--){
            reversedArray += array.charAt(i-1);
        }

        return reversedArray;
    }
}
