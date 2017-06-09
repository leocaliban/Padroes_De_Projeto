
package Adapter.Exemplo3;

public class MP4Player implements MediaPlayerAvancado {

    @Override
    public void playVLC(String nomeArquivo) {
        //NÃO FAZ NADA
    }

    @Override
    public void playMP4(String nomeArquivo) {
        System.out.println("Tocando arquivo MP4. Nome: "+nomeArquivo);
    }
}
