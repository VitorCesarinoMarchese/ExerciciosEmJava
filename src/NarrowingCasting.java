public class NarrowingCasting {
    public static void narrowingCasting(){
        /*No processo de converção o valor de 0.55 são perdidos no processo pois
        um int não consegue armazenar numeros reais*/
        float f = 10.55f;
        int i = (int) f;
        System.out.println("Float: " + f + " " + "Int: " + i);
    }
}
