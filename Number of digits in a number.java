import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count_digit = 0;
        
        while(n != 0){
            count_digit++;
            n = n/10;
        }
        System.out.println(count_digit);
        
    }
}