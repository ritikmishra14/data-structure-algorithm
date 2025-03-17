package dsakunalkushwaha.functions;

public class Main {
    public void add(int num1 , int num2){
        System.out.println(num1 + num2);
    }
    public static void greeting(){
        System.out.println("hello world");
    }

    public static String greet(String string){
        return "Good Morning "+ string;
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.add(10,20);
   greeting();
  String msg = greet("ritik");
        System.out.println(msg);
        main.add(50 , 50);
    }
}
