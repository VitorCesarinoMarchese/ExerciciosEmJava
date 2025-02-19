import java.util.Scanner;

public class Input {
    public static void input(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Insira um numero inteiro: ");
        String num = myObj.nextLine();
        System.out.println("Insira um numero com duas casas decimais: ");
        String doub = myObj.nextLine();
        System.out.println("Digite " + "'true'" + " ou " + "'false'");
        String bool = myObj.nextLine();
        try {
            int n = Integer.parseInt(num);
            double d = Double.parseDouble(doub);
            boolean b = Boolean.parseBoolean(bool);
            System.out.println("Inteiro: " + n + " " + "Real: " + d + " " + "Boolean: " + b);
        }catch (Exception e){
            System.out.println("Você digitou algo errado tente novamente");
        }
    }
}
