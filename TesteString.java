import java.util.Locale;
import java.util.Scanner;

public class TesteString {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra(maiúscula ou minúscula)");
        String input = sc.toString();

        sc.close();

        int cont = 0;

        //converte a string
        String lowerCaseInput = input.toLowerCase();

        for(char c : lowerCaseInput.toCharArray()){
            if(c == 'a'){
                cont++;
            }
        }

        System.out.println("Letra 'a' aparece" + cont + "vezes na String.");
    }
}
