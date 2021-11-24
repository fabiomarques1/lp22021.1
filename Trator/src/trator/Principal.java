package trator;

public class Principal {

    public static void main(String[] args) {
        
        Retroescavadeira re1 = new Retroescavadeira("CAT");
        
        System.out.println(re1.abaixarBraco());
        
        System.out.println(re1);
        
        re1.andar();
        
        System.out.println(re1);
        
        
        System.out.println(re1.levantarBraco());
        
        System.out.println(re1);
        
    }
}
