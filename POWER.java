// 2 power 3 --> 2*2*2 =8 

public class POWER {
    public static void main(String[]args){

        int num = 2 ;
        int power = 3;

        System.out.println(num+ " ^ " +power+" : "+ power(num , power));
    }

    public static int power(int n , int p){

        if(p==0){
            return 1;
        }

        return  n * power(n,p-1);

    }
    
}
