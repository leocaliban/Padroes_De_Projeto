package Adapter.Exemplo1;

/**
 *PeruSelvagem é um tipo de peru
 * logo é implementado pela interface Peru
 * o PeruSelvagem tem duas funções por ser um tipo de Peru
 * e que são distindas de novos Perus que possam vir a ser criados
 * 
 * @author Leocaliban
 */
public class PeruSelvagem implements Peru {

    @Override
    public void comunicarGorgolejando() {
        System.out.println("GLU GLU GLU GLU!!!");
    }

    @Override
    public void voar() {
        System.out.println("VOANDO... (Alcance Do Vôo: 3m)");
    }  
}
