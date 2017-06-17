package Command.Exemplo6;

/**
 *
 * @author Leocaliban
 */
public class VentiladorDeTeto {
    public static final int ALTA = 3;
    public static final int MEDIA = 2;
    public static final int BAIXA = 1;
    public static final int OFF = 0;
    private int velocidade;
    private String local;
    
    /**
     * inicializa o ventilador com o seu local
     * @param local String local do objeto
     */
    public VentiladorDeTeto(String local){
        this.local = local;
    }
    
    public void alta(){
        velocidade = ALTA;
        System.out.println("VELOCIDADE ALTA ATIVA");
    }
    
    public void media(){
        velocidade = MEDIA;
        System.out.println("VELOCIDADE MEDIA ATIVA");
    }
    
    public void baixa(){
        velocidade = BAIXA;
        System.out.println("VELOCIDADE BAIXA ATIVA");
    }
    
    public void off(){
        velocidade = OFF;
        System.out.println("VENTILADOR DESLIGADO");
    }

    public int getVelocidade() {
        return velocidade;
    }

    public String getLocal() {
        return local;
    }
    
}
