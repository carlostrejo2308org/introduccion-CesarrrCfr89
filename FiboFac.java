package semestre3;
import java.util.Scanner;

public class FiboFac {
    public static int Fibonacci(int n){
        int res;
        if ((n==0)||(n==1))
            res=n;
        else
            res=(Fibonacci(n-1)+Fibonacci(n-2));
        return (res);
    }
    public static int Factorial(int n){
        int acumulado = 1;
        for(int i=n; i>=1; i--){
            acumulado *=i;
        }
        return acumulado;
    }
    public static void main(String[] args) {   
        int n;
        System.out.println("Ingresa un número: ");
        Scanner ss=new Scanner(System.in);
        n= ss.nextInt();
        System.out.println("El resultado del fibonacci es: "+FiboFac.Fibonacci(n));
        System.out.println("El resultado del factorial es: "+FiboFac.Factorial(n));
    }
}
