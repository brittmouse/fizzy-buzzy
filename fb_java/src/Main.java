import java.util.ArrayList;
public class Main {
    public static ArrayList<String> fizzbuzz() {
        ArrayList<String> output = new ArrayList<String>();
        for (int i = 1; i <= 100; i++) {
            String result = "";
            if (i % 3 == 0) result = result.concat("Fizz");
            if (i % 5 == 0) result = result.concat("Buzz");
            if (result.isEmpty()) result = String.valueOf(i);
            output.add(result);
        }
        return output;
    }

    public static void printArray(ArrayList<String> array) {
        for (String s : array) {
            System.out.print(s + " ");
        }
    }

    public static void main(String[] args) {
        printArray(fizzbuzz());
    }
}
