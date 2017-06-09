
package Adapter.Exemplo1;

/**
 *
 * @author Leocaliban
 */
public class Main {
    static void testePato(Pato pato){
        pato.comunicarQuack();
        pato.voar();
    }
    static void testePeru(Peru peru){
        peru.comunicarGorgolejando();
        peru.voar();
    }

    public static void main(String[] args) {
        
        PatoSelvagem pato = new PatoSelvagem();
        PeruSelvagem peru = new PeruSelvagem();
        Pato adaptadorDePeru = new AdaptadorDePeru(peru);
        
        
        System.out.println("TESTANDO O PERU...");
        peru.comunicarGorgolejando();
        peru.voar();
        
        System.out.println("TESTANDO UM PATO...");
        testePato(pato);
        
        System.out.println("TESTANDO O ADAPTADOR DE PERU");
        testePato(adaptadorDePeru);
        
        Peru adaptadorPato = new AdaptadorDePato(pato);
        System.out.println("TESTANDO UM PERU...");
        testePeru(peru);
        
        System.out.println("TESTANDO O ADAPTADOR DE PATO");
        testePeru(adaptadorPato);
        
    }
    
}
