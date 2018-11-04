package mymusicapp;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

public class MyMusicApp
{
 public static void main(String[] args) 
 {
 
 Player player = new Player();
 Pattern pattern = new Pattern("A6 B6 C6 D6 E7 F7 @2 I[GUITAR] A8 B8 C8 D8 E9 F9 A8 B8 C8 D8 E7 F7 @3 I[MARIMBA] A6 B6 C6 D6 E5 F5")
    .setVoice(0) //PARA INSTRUMENTOS DE PERCUS�O COMO BATERIA E DERIVADOS COLOQUE 9 NO setVoice.
                 // OS DEMAIS S�O INTRUMENTOS GERAIS COMO PIANO, GUITARRA SAX E ETC.
    //.setInstrument(1) // CADA NUMERO � UM INSTRUMENTO, ISSO ESTA AQUI https://www.cs.utexas.edu/ftp/novak/cs315/jfugue-chapter2.pdf
    .setTempo(120); // O TEMPO � O BPM.
 player.play(pattern);
 System.exit(0);
 }
} 
