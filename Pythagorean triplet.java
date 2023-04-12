// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        if(a*a == b*b + c*c){
            System.out.println("Pythagorean triplet");
        }else if(b*b == a*a + c*c){
            System.out.println("Pythagorean triplet");
        }else if(c*c == a*a + b*b){
            System.out.println("Pythagorean triplet");
        }else{
            System.out.println("not a Pythagorean triplet");
        }
        
        
        
        
    }
}
