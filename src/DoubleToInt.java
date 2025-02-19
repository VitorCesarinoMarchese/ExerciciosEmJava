public class DoubleToInt {
    public static void doubleToInt(){
        double d = 10.55;
        int i = (int) d;
        // ouve perda do valor 0.55 pois o tipo inteiro não suporta numeros racionais
        System.out.println("Double: " + d + " " + "Int: " + i);
    }
}
