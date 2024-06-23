
class Recursion{
    static int Factorial(int n){
           return (n==0 || n==1)?1:n*Factorial(n-1);
    }

    static int SumofAllNumbers(int n){
        return (n<0)?0: n + SumofAllNumbers(n-1);
    }
    

    public static void FibonacciSeries(int a, int b,int n){
        if(n==0){
            return;
        } 
        int c = a+b;
        System.out.println(c);
        FibonacciSeries(b,c,n-1);
    }

    public static void PrintNumbers(int n){
      if(n==0){
        return;
      }else{
          PrintNumbers(n-1);
          System.out.println(n);
      }
     
    }
    public static void main(String[] args){
        System.out.println(Factorial(5));
        System.out.println(SumofAllNumbers(3));
        PrintNumbers(10);
        FibonacciSeries(0,1,7);


       
    }

}