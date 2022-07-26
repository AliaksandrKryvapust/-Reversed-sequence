
import java.util.Arrays;
import java.util.stream.IntStream;

public class Source {
    public static void main(String[] args) {
    int n = 5;
        System.out.println(Arrays.equals(reverse(n), new int[]{5, 4, 3, 2, 1}));
    }
    public static int[] reverse(int n){
        return IntStream.iterate(n, i -> --i).limit(n).toArray();
    }
}
