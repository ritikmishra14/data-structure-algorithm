package dsakunalkushwaha.functions;

public class Scope {
    // block scope , function scope and loop scope, global scope.

    public static void main(String[] args) {

        {
           // a = 100; scope is outside the block for access only, cannot be initialized.

        }
       // a==1000; scope is inside the block only.
    }
    static void print(){
       // System.out.println(a);// will not give us the scope.
    }
}
