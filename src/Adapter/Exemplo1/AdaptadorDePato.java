package Adapter.Exemplo1;

/**
 *
 * @author Leocaliban
 */
public class AdaptadorDePato implements Peru {
    private Pato pato;

    public AdaptadorDePato(Pato pato){
        this.pato = pato;
    }
    
    @Override
    public void comunicarGorgolejando() {
        this.pato.comunicarQuack();
    }

    @Override
    public void voar() {
        this.pato.voar();
    }
    
}
