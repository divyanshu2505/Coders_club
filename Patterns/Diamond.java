// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        // int spc = 0;
        // int str = n;
        
        // for(int row=1;row<=n;row++){
        //     //print spaces..
        //     for(int i=1;i<=spc;i++){
        //         System.out.print(" ");
        //     }
        //     //print stars..
        //     for(int i=1;i<=str;i++){
        //         System.out.print("*");
        //     }
        //     spc++;
        //     str--;
        //     System.out.println();
        // }


        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i > j){
        //             System.out.print(" ");
        //         }else{
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i+j < 6){
        //             System.out.print(" ");
        //         }else{
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }

        int spc = 2;
        int str = 1;
        
        for(int row=1;row<=n;row++){
            //print spaces..
            for(int i=1;i<=spc;i++){
                System.out.print(" ");
            }
            
            //print stars..
            for(int j=1;j<=str;j++){
                System.out.print("*");
            }
            if(row < (n+1)/2){
                spc--;
                str += 2;
                // System.out.print(str);
            }else {
                spc++;
                str -= 2;
                // System.out.print(str);
            }
            System.out.println();
        }
        
    }
}
