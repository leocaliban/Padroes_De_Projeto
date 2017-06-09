package Adapter.Exemplo1;

/**
 *
 * @author Leocaliban
 */
public class AdaptadorDePeru implements Pato{
    private Peru peru;

    public AdaptadorDePeru (Peru peru){
        this.peru = peru;
    }
    @Override
    public void comunicarQuack() {
        this.peru.comunicarGorgolejando();
    }

    @Override
    public void voar() {
        this.peru.voar();
    }   
}
