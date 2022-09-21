import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    //Given an integer n, return a string array answer (1-indexed) where:

    //answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    //answer[i] == "Fizz" if i is divisible by 3.
    //answer[i] == "Buzz" if i is divisible by 5.
    //answer[i] == i (as a string) if none of the above conditions are true.
    public static void main(String[] args) {
        System.out.print(fizzBuzz(50, 2, 7));
    }

    private static List<String> fizzBuzz(int n,int o,int p) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i%(o * p) == 0) {
                list.add("FizzBuzz");
            }
            else if (i%o == 0) {
                list.add("Buzz");
            }
            else if (i%p == 0){
                list.add("Fizz");
            }
            else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }
}
