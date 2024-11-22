public class factorial {

    public static void main(String[] args) {
        int number = 4;

        int result = findFacto(number);

        System.out.println("Factorial of a number is: "+result);
    }

    public static int findFacto(int number){

        if(number == 1){

            return 1;
        }

        else{

            return number*findFacto(number-1);
        }
    }
    
}
