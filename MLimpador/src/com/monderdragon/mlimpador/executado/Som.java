package com.monderdragon.mlimpador.executado;

import java.io.File;
import java.net.URL;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Som {
	public static void TocarSom(URL limpado){
		try{
			
			Clip clipe = AudioSystem.getClip();
			long cliped = clipe.getMicrosecondLength() * 10;
			clipe.open(AudioSystem.getAudioInputStream(limpado));
			clipe.start();
			System.out.println("Audio tocado: " + limpado);
			Thread.sleep(clipe.getMicrosecondLength() / cliped);
		}catch(Exception e){
  }
 }
	public static void SaberSobreSom(File Som){
		try{
			Clip clipe = AudioSystem.getClip();
			System.out.println(" Sobre: \n" + "	Nome:" + Som + "\n	Extras: " + clipe.getFormat());
		}catch(Exception e){
  }
 }
}
/*
URL url1 = this.getClass().getResource("res/ah.wav");
audioIn = AudioSystem.getAudioInputStream(url1);
clip1 = AudioSystem.getClip();
clip1.open(audioIn);
*/