package com.monderdragon.mlimpador.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Dados
{
	
  public static File Log = new File("C:/Users/"+ System.getProperty("user.name") +"/AppData/Roaming/MLimparlog.properties");
  
  public Dados() { verifica(); }

  public static void verifica()
  {
    if (!Log.exists()) {
      try {
        Log.createNewFile();
        FileWriter escrever = new FileWriter(Log);
        StringBuilder linhase = new StringBuilder();
        linhase.append("LimparWindows=true\n");
        linhase.append("LimparJava=true\n");
        linhase.append("LimparSkype=Limpar\n");
        linhase.append("Skype=NomeDeLogin\n");
        linhase.append("LimparLol=false\n");
        linhase.append("LimparMinecraft=false\n");
        String elinha = linhase.toString();
        escrever.write(elinha);
        escrever.close();
      }
      catch (IOException e) {
        e.printStackTrace();
      }
    }
    else {
    }
  }
  
  public static HashMap<String, String> getProperties() {
    FileReader fr = null;
    try {
      fr = new FileReader(Log);
    }
    catch (FileNotFoundException e1) {
      e1.printStackTrace();
    }
    BufferedReader br = new BufferedReader(fr);
    StringBuilder contem = new StringBuilder();
    String htm = "";
    try {
      while ((htm = br.readLine()) != null)
      {
        contem.append(htm);
        contem.append("\n");
      }
    }
    catch (IOException e) {
      e.printStackTrace();
    }
    try {
      fr.close();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
    try {
      br.close();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
    HashMap<String, String> props = new HashMap<String, String>();
    for (String str : contem.toString().split("\n")) {
      String key = str.split("=")[0];
      String value = str.split("=")[1];
      props.put(key, value);
    }
    return props;
  }

  public static File getCwd() {
    return new File("").getAbsoluteFile();
  }
}
