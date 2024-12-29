import java.util.*;
class Box {
    int length, breadth, height;
    Box (int length, int breadth, int height) {
        this.length = length; 
        this.breadth = breadth;
        this.height = height;
    }
    void calcVolume() {
        int vol = length*breadth*height;
        System.out.println("The Volume of the box is: "+vol);
    }
    public static void main(String args[]) {
        int arr[] = new int[3];
        int i=0;
        Scanner sc = new Scanner(System.in);
        while(i<3) {
            arr[i++] = sc.nextInt();
        }
        sc.close();
        Box bx = new Box(arr[0],arr[1],arr[2]);
        bx.calcVolume();
    }
}