public class StringCreateDemo {
    public static void main(String[] args) {
        //pass character array to String constructor
        char[] chars = {'a','b','c','d','e'};
        String s1 = new String(chars);
        //specify subrange
        String s2 = new String(chars,1,4);

        //Java's char type uses 16 bits to represent unicode character set, but also allows initialization using byte array since 8-bit ASCII characters are common.
        //string literals
        String s3 = "literal";
        
        //string concatenation with other data types
        System.out.printf("String Inititalization examples:\ns1: %s\ns2: %s\ns4: %s\n",s1,s2,s3);
        System.out.println("four" + 2 + 2); //prints four22
        System.out.println("four" + (2 + 2)); //prints four4
    }
}
