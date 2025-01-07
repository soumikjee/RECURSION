public class FirstRECURSION{
    public static void main(String[]args){

        int a = 10;

        m1(a);
    }

    public static void m1(int n){

        if(n==0){
            return;
        }

        System.out.println(n);

        m1(n - 1);

    }
}