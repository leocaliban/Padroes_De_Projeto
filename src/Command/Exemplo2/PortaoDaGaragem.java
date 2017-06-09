package Command.Exemplo2;

/**
 * Objeto Port�o, � o receptor das a��es do command
 * @author Leocaliban
 */
public class PortaoDaGaragem {
    
    /**
     * faz subir o port�o
     */
    public void subir(){
        System.out.println("SUBINDO PORT�O");
    }
    
    /**
     * faz baixar o port�o
     */
    public void baixar(){
        System.out.println("BAINXANDO PORT�O");
    }
    
    /**
     * faz parar a a��o do port�o
     */
    public void parar(){
        System.out.println("PARADO");
    }
    
    /**
     * acende a luz do port�o
     */
    public void acenderLuz(){
        System.out.println("LUZ ACESA");
    }
    
    /**
     * apaga a luz do port�o
     */
    public void apagarLuz(){
        System.out.println("LUZ APAGADA");
    }
}
