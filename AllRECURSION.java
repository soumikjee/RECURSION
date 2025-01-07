public class AllRECURSION {

    public static void main(String[]args){

        int a = 5;

        all(a);
    }

    public static void all(int a){

        if(a==0){
            return;
        } 
        System.out.print(a+" "); // 5 4 3 2 1
        all(a-1);
        System.out.print(a+" "); // 1 2 3 4 5
    }
    
}
