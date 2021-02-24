/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.io.File;
import java.io.IOException;
import java.nio.channels.UnsupportedAddressTypeException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Joshua
 */
public class Conector {
    public void Play(String sonido){
       
        try{
            AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(new File(sonido).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        }
        catch(UnsupportedAudioFileException| IOException  | LineUnavailableException ex){
            System.out.println("Error al reproducir el sonido.");
        }
    }
}
