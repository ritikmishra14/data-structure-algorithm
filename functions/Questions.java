package dsakunalkushwaha.functions;

public class Questions {
    public static void main(String[] args) {
        System.out.println(isPrime(13));
        System.out.println(checkArmstrong(153));
    }
    // isPrime
    static boolean isPrime(int number){
        for(int i=2; i <= number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    // check armstrong number.
    static boolean checkArmstrong(int number){
        int original = number;
        int result = 0;
        while(number > 0){
            int remainder = number % 10;
            result = result + (int)Math.pow(remainder , 3);
            number /= 10;
        }
        if(original == result){
            return true;
        }
        return false;
    }

}
