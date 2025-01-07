// 5! = 5!*4!*3!*2!*1!
// 3! = 3! 2! 1! 

public class FACTORIAL {
    public static void main(String[]args){

        int f = 5 ;

        int print =factor(f);

        System.out.println(print);
    }

    public static int factor(int f){
        if(f==1){
            return 1;
        }
        return f * factor(f-1);
    }
    
}