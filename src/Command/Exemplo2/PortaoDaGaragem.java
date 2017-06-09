package Command.Exemplo2;

/**
 * Objeto Portão, é o receptor das ações do command
 * @author Leocaliban
 */
public class PortaoDaGaragem {
    
    /**
     * faz subir o portão
     */
    public void subir(){
        System.out.println("SUBINDO PORTÃO");
    }
    
    /**
     * faz baixar o portão
     */
    public void baixar(){
        System.out.println("BAINXANDO PORTÃO");
    }
    
    /**
     * faz parar a ação do portão
     */
    public void parar(){
        System.out.println("PARADO");
    }
    
    /**
     * acende a luz do portão
     */
    public void acenderLuz(){
        System.out.println("LUZ ACESA");
    }
    
    /**
     * apaga a luz do portão
     */
    public void apagarLuz(){
        System.out.println("LUZ APAGADA");
    }
}
