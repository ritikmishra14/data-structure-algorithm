package dsakunalkushwaha.functions;

public class Overloading {
    public static void main(String[] args) {
    fun(20);
    fun("ritik");
    }
    static void fun(int a){
        System.out.println("integer value function");
    }
    static void fun(String name){
        System.out.println("string value function");
    }
}
