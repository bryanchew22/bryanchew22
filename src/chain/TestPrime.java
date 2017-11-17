package chain;

public class TestPrime {
    
    public static boolean isPrime(int n){
        return isPrime(n, n-1);
    }
    
    public static boolean isPrime(int n, int divisor){
        
        if(divisor==1){
            return true;
        }
        
        if(n==1){
            return false;
        }else if (n%divisor==0){
            return false;
        }
        
        return isPrime(n, divisor-1);
    }
    
    public static void main(String[] args){
        System.out.println("Prime numbers from 1 to 100: ");
        
        for (int i=1 ; i<=100 ; ++i){
            if (isPrime(i))
                System.out.print(i + " ");
        }
        
        System.out.println();
        
    }
}
