// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
            int n = 5;
            int spc = n-1;
            int str = 1;
            
           
            
            for(int row=1;row<=n;row++){
                //print spaces..
                for(int i=1;i<=spc;i++){
                    System.out.print(" ");
                }
                
                //print star
                for(int i=1;i<=str;i++){
                    System.out.print("*");
                }
                System.out.println();
                spc--;
                str++;
            }
            
    }
}