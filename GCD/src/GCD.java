public class GCD {
    public static int Calculation(int num1, int num2){

        if (num1 < 0 || num2 < 2){
            throw new ArithmeticException();
        }

        if (num1 == 0 || num2 == 0){
            return Math.abs(num1 - num2);
        }

        while (num1 % num2 != 0){
            int reminder = num1 % num2;
            num1 = num2;
            num2 = reminder;
        }
        return num2;
    }

    public static int Calculation(int [] number){
        int result = number[0];
        for (int i = 1; i< number.length ; i++)
            result = Calculation(result, number[i]);
        return result;
    }

    public static void main(String[] args) {
        int [] myIntArray = {2,4,6};
        System.out.println(Calculation(myIntArray));
        System.out.printf("gcd(40,24)=%d gcd(24,40)=%d%n", Calculation(40, 24),Calculation(24, 40));
    }
}
