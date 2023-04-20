// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int base1 = scn.nextInt();
        int base2 = scn.nextInt();
        
        int Ntod = no_to_dec(n,base1); // Number to decimal
        int Dtorb = dec_to_rb(Ntod,base2);//decimal to required base
        System.out.println(Dtorb);
    }
    
    public static int no_to_dec(int num,int b1){
        int pow = (int)(Math.pow(b1,0));
        int ans = 0;
        while(num != 0){
            int ld = num % 10;
            ld = ld * pow;
            ans = ans + ld;
            pow = pow * b1;
            num = num / 10;
        }
        return ans;
    }
    public static int dec_to_rb(int number,int b2){
        int power = (int)(Math.pow(10,0));
        int answer = 0;
        while(number != 0){
            int rem = number % b2;
            rem = rem * power;
            answer = answer + rem;
            power = power * 10;
            number = number / b2;
        }
        return answer;
    }
}

