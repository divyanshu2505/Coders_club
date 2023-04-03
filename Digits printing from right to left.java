import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = 0;
        
        while(n != 0){
            ans = n % 10;
            System.out.println(ans);
            n = n/10;
        }
    }
}