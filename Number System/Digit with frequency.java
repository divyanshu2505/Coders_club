// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        int digit = 0;
        int max = 0;
        while(temp != 0){
            int tld = temp % 10; //tld -> temp's last digit..
            int ans = freq(n,tld);
            if(max < ans){
                max = ans;
                digit = tld;
            }
            temp = temp / 10;
        }
        System.out.println("the frequency of "+ digit + " is " + max);
    }
     
    public static int freq(int a,int curr){
        int local = a;
        int count = 0;
        while(local != 0){
            int lld = local % 10; //lld -> local's last digit..
            if(lld == curr){
                count++;
            }
            local = local / 10;
        }
        return count;
    }
}

