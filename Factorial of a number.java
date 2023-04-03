import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = 1;
        
        // approach with i++
        // for(int i=1;i<=n;i++){
        //     ans = ans * i;
        // }
        // System.out.println(ans);
        
        //approach with i--
        for(int i=n;i>=1;i--){
            ans = ans * i;
        }
        System.out.println(ans);
    }
}
