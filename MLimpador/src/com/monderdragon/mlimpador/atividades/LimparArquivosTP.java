package com.monderdragon.mlimpador.atividades;

import java.io.File;

public class LimparArquivosTP {
	public void LimparArquivosTP(File dir){
	    
	    if (dir.isDirectory()) {
	      String[] children = dir.list();
	      for (int i = 0; i < children.length; i++) {
	    	  LimparArquivosTP(new File(dir, children[i]));
	    	  System.out.println("[MLimpador]" + "Limpado!");
	      }
	    }
	    dir.delete();
}
}
