//Demonstration of ArrayList (java.util.Collection)
import java.util.*; 
public class ArrayListDemo {
    ArrayList<Integer> al = new ArrayList<Integer>(); //second time integer bolar dorkar nei tbh
    ArrayListDemo(String line) {
        Scanner sc = new Scanner(line);
        while(sc.hasNext()) {
            al.add(Integer.parseInt(sc.next()));
        }
        sc.close();
    }
    int getSize() {
        return al.size();
    }
    Integer[] getArray() {
        Integer[] arr = new Integer[al.size()];
        arr = al.toArray(arr); 
        return arr;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        ArrayListDemo obj = new ArrayListDemo(line);
        Integer arr[] = obj.getArray();
        int n = obj.getSize();
        System.out.println("Array obtained!");
        for(int i=0; i<n; i++) {
            System.out.println(arr[i]);
        }
    }
}
