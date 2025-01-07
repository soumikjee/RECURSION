public class PRIME {
    public static void main(String[] args) {

        int n = 7;

        if(isprime(n, 2)){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number !");
        } 
    }

    // Recursive method to check if a number is prime
   
    static public boolean isprime(int n,int i){
        if(i >= n/2){
            return true;
        } 
        if(n%i==0){
            return false;
        } 
        return isprime(n,i+1);
    }
}
