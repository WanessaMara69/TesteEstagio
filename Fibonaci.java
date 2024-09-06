import java.util.Scanner;

public class Fibonaci {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número, veremos se ele faz parte da sequência Fibonacci:");
        int num = sc.nextInt();

        if(isFibonacci(num)){
            System.out.println(num + " Pertence á sequência Fibonacci");
        }else{
            System.out.println(num + " Não pertence á sequência Fibonacci");
        }
    }
    public static boolean isFibonacci(int num){
        if(num < 0){
            return false;
        }

        //Gera sequência
        int a = 0, b = 1;

        if(num == a || num == b){
            return true;
        }

        //gera o loop da sequência
        while(b < num){
            int temp = a;
            a = b;
            b = temp + b;

            if(b == num){
                return true;
            }
        }
        return false;
    }

}
