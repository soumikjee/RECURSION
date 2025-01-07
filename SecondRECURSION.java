public class SecondRECURSION {

    public static void main(String[]args){

        int a = 10;

        m1(a);
    }

    public static void m1(int a){

        if(a==0){
            return;  
        }
        m1(a-1);
        System.out.println(a);
    }
    
}
