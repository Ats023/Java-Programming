import java.util.*;
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in); //user input
        while(sc.hasNextInt()) {
            al.add(sc.nextInt());
        }
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("Using Iterator to display sorted array: ");
        Iterator<Integer> it = al.iterator(); //look at this
        while(it.hasNext()) {
            System.out.print(it.next()+" ");
        }
    }
}
