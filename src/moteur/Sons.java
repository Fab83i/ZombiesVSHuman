package moteur;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Sons extends Thread implements Runnable{
	
	
	//Cette classe permet d'ajouter un son plus propre que les .mid elle est utilisé pour tout ce qui n'est pas déplacement.
	
	
	@SuppressWarnings("deprecation")
	public void run() {

		JouerLeSon("images/smb_saut.wav");

	}
	public void musicDebutWav() {
		JouerLeSon("images/pacman_beginning.wav");
	}
	
	public void musicMortWav() {
		JouerLeSon("images/pacman_death.wav");
	}
	
	public void musicVictWav() {
		JouerLeSon("images/smb3_1-up.wav");
	}
	

	
	
	public static void JouerLeSon(String sonFile) { // permet de jouer la musique 
		SourceDataLine soundLine = null;
		int BUFFER_SIZE = 64 * 1024; // 64 KB


		try {
			File soundFile = new File(sonFile);
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
			AudioFormat audioFormat = audioInputStream.getFormat();
			DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
			soundLine = (SourceDataLine) AudioSystem.getLine(info);
			soundLine.open(audioFormat);
			soundLine.start();
			int nBytesRead = 0;
			byte[] sampledData = new byte[BUFFER_SIZE];
			while (nBytesRead != -1) {
				nBytesRead = audioInputStream.read(sampledData, 0,
						sampledData.length);
				if (nBytesRead >= 0) {
					soundLine.write(sampledData, 0, nBytesRead);
				}
			}
		} catch (UnsupportedAudioFileException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (LineUnavailableException ex) {
			ex.printStackTrace();
		} finally {
			soundLine.drain();
			soundLine.close();
		}
	}
}


