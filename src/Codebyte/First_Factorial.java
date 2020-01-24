package Codebyte;

import java.util.Scanner;

public class First_Factorial {

    public static int FirstFactorial(int num) {
        int erg = num;
        while(num > 1){
        num--;
            erg = erg*num;

        }
        return erg;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstFactorial(s.nextInt()));
    }
}
