
package Adapter.Exemplo3;


public class Adaptador implements MediaPlayer {
    private MediaPlayerAvancado mpa;

    public Adaptador(String tipoAudio){
        if(tipoAudio.equalsIgnoreCase("vlc")){
            mpa = new VLCPlayer();
        }
        else if(tipoAudio.equalsIgnoreCase("mp4")){
            mpa = new MP4Player();
        }
    }
    @Override
    public void play(String audioTipo, String nomeArquivo) {
        if (audioTipo.equalsIgnoreCase("vlc")){
            mpa.playVLC(nomeArquivo);  
        }
        else if (audioTipo.equalsIgnoreCase("mp4")){
            mpa.playMP4(nomeArquivo);
        } 
    }
    
}
