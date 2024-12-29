public class ModifyDemo {
    public static void main(String[] args) {
        String demo = "Under the lovely blue sky, by the blue lake";
        //replace all matching substrings
        int i;
        String res = "";
        do {
            System.out.println(res);
            i = demo.indexOf("blue");
            if(i!=-1) {
                res = demo.substring(0,i);
                res+="clear ";
                res+=demo.substring(i + "clear".length());
                demo = res;
            }
        } while(i!=-1);
        //changing string case
        String ori = "Demo text for Case Toggling";
        System.out.println("toUppercase: " + ori.toUpperCase());
        System.out.println("toLowerCase: " + ori.toLowerCase());
        //joining strings
        System.out.println("Joining strings... " + String.join(" | ", "name", "roll", "dept"));

    }
}
