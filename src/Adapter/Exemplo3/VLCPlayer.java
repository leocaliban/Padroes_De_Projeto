
package Adapter.Exemplo3;

public class VLCPlayer implements MediaPlayerAvancado {

    @Override
    public void playVLC(String nomeArquivo) {
        System.out.println("Tocando arquivo VLC. Nome: "+nomeArquivo);
    }

    @Override
    public void playMP4(String nomeArquivo) {
    //NÃO FAZ NADA
    }
    
}
