import java.util.*;
public class SearchingDemo {
    public static void main(String[] args) {
        String demo = "Demo String for practice";
        //character extraction
        System.out.println("Using charAt(3) function: " + demo.charAt(3));
        
        //Extract multiple characters
        char[] buff = new char[50];
        demo.getChars(0, 11, buff, 0);
        System.out.println("Using getChars(): " + new String(buff));

        //equals() vs ==
        String demo2 = new String("Demo String for practice");
        System.out.println("What equals() returns: " + demo.equals(demo2)); //equals() checks characters inside given String objects
        System.out.println("What == returns: " + (demo == demo2)); //== checks object references to check if they are the same instance

        //String searching
        String searchDemo = "A bee builds a beehive to bee with its family";
        System.out.println("Finding first occurence of substr bee: " + searchDemo.indexOf("bee"));
        System.out.println("Find last occurence of substr bee: " + searchDemo.lastIndexOf("bee"));

        String[] words = {"mellow", "yellow", "fellow", "feel", "yell", "yen"};
        System.out.println("Find words that start with a given substring:");
        List<String> sub1 = new ArrayList<>();
        List<String> sub2 = new ArrayList<>();
        for(String x: words) {
            if(x.startsWith("ye")) sub1.add(x);
            if(x.endsWith("ow")) sub2.add(x);
        }
        System.out.println("Strings strating with 'ye': "+sub1);
        System.out.println("Strings ending with 'ow': "+sub2);
    }
}
