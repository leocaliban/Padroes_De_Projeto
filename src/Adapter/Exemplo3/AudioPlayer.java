
package Adapter.Exemplo3;


public class AudioPlayer implements MediaPlayer {
    private Adaptador adaptador;

    @Override
    public void play(String audioTipo, String nomeArquivo) {
        if (audioTipo.equalsIgnoreCase("mp3")){
            System.out.println("Tocando Arquivo MP3. Nome: "+nomeArquivo);
        }
        else if(audioTipo.equalsIgnoreCase("vlc")||audioTipo.equalsIgnoreCase("mp4")){
            adaptador = new Adaptador(audioTipo);
            adaptador.play(audioTipo, nomeArquivo);
        }
        else{
            System.out.println("ARQUIVO INVÁLIDO."+audioTipo+"Formato Nao Suportado.");
        }
    }   
}
