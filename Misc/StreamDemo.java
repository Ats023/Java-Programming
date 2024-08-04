import java.util.*;
public class StreamDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line  = sc.nextLine();
        long word_count = Arrays.stream(line.split(" ")).count();
        System.out.print("No. of words: " + word_count);
    }
}
