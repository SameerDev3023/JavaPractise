
class Recursion{
    static int Factorial(int n){
           return (n==0 || n==1)?1:n*Factorial(n-1);
    }

    static int SumofAllNumbers(int n){
        return (n<0)?0: n + SumofAllNumbers(n-1);
    }
    
    public static void main(String[] args){
        System.out.println(Factorial(5));
        System.out.println(SumofAllNumbers(3));
       
    }

}