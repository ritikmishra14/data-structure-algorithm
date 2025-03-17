package dsakunalkushwaha.functions;

public class Shadowing {
   static String  available = "available";
   static int val = 100;
    public static void main(String[] args) {
        System.out.println(available);
        System.out.println(val);
        String available = "available inside";
        int val = 200;
        System.out.println(available);
        System.out.println(val);
        // scope of higher variable is hidden.
        // this concept is called shadowing.
        fun();// will print value of instance variable only as this takes values of class fields.

    }
    static void fun(){
        System.out.println(available);
        System.out.println(val);
    }
}
