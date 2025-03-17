package dsakunalkushwaha.functions;

public class Swap {

    static void swapFunction(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static String changeName(String name){
        name = "Rahul rana";
        return name;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//        int temp = a;
//        a = b;
//        b = temp;

         swapFunction(a , b);
        System.out.println(a + " " + b);

        //swapFunction(100 , 200);

        String name = "ritik";
        changeName(name);
        System.out.println(name);
    }
}
