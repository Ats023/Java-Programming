import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        //create string[] array from input string
        Scanner sc = new Scanner(System.in);
        String inputstr1 = sc.nextLine(); //enter characters/strings
        String[] strArr = inputstr1.split(" ");

        //create int[] array from input string
        String inputstr2 = sc.nextLine(); //enter integers
        int[] intArr = Arrays.stream(inputstr2.split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(intArr));
    }
}
