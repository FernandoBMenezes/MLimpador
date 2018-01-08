package com.monderdragon.mlimpador;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.net.URL;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.monderdragon.mlimpador.atividades.LimparArquivosTP;
import com.monderdragon.mlimpador.executado.Som;
import com.monderdragon.mlimpador.file.Dados;

public class Tela extends JFrame{
	private static final long serialVersionUID = 1L;
	
	URL Lurl = this.getClass().getResource("/Imagens_Sons/Limpado.wav");
	URL Limpado = Lurl;
	URL Turl = this.getClass().getResource("/Imagens_Sons/TrocaPagina.wav");
	URL TrocaPagina = Turl;
	
	public Color CorP = new Color(21, 154, 153);
	public Color CorPA = new Color(30, 190, 190);
	public Color PdCor = new Color(255, 255, 255);
	public Color PfCor = new Color(230, 230, 230);
	public Color BtCor = new Color(208, 75, 75);
	public Color BtaCor = new Color(208, 60, 60);
	   //Telas
	   JPanel TelaDLimpar = new JPanel();
	   JPanel TelaDConfigurar = new JPanel();
	   JPanel TelaF = new JPanel();
	   JButton Limparbt = new JButton("Limpar");
	   JButton Atualizarbt = new JButton("Atualizar");
	   JButton Limpezabt = new JButton("Limpeza");
	   JButton Configurarbt = new JButton("Configurar");
	   //TelaBarra
	   JLabel TelaBar = new JLabel();
	   JButton Fecharbt = new JButton("X");
	   JButton Minimizarbt = new JButton("_");
	   //Progresso
	   JProgressBar Progresso = new JProgressBar();
	   //Windows
	   JLabel WindowsTx = new JLabel("Limpar A/T Do Windows!");
	   Checkbox Windowsc = new Checkbox();
	   //Java
	   JLabel JavaTx = new JLabel("Limpar A/T Do Java!");
	   Checkbox Javac = new Checkbox();
	   //Skype
	   JLabel SkypeTx = new JLabel("Limpar A/R Do Skype!");
	   JLabel SkypeTxNome = new JLabel("Nome:");
	   JTextField SkypeNome = new JTextField("(Nome De Login/Entrar)");
	   Checkbox Skype = new Checkbox();
	   //Lol
	   JLabel LolTx = new JLabel("Limpar A/T Do LoL!");
	   Checkbox Lol = new Checkbox();
	   //Minecraft
	   JLabel MinecraftTx = new JLabel("Limpar A/T Do Minecraft!");
	   Checkbox Minecraft = new Checkbox();
	   public Tela() {
		   this.setSize(new Dimension(600, 400));
		   this.setLocationRelativeTo(null);
		   this.setLayout(null);
		   this.setTitle("MLimpador");
		   this.setResizable(false);
		   this.setDefaultCloseOperation(3);
		   this.getContentPane().setBackground(PfCor);
		   
		   //Icone
		   this.setIconImage(Toolkit.getDefaultToolkit().getImage("/Imagens_Sons/MLicone.png"));
		   //TelaF
		   TelaF.setBounds(0, 0, 600, 400);
		   TelaF.setBackground(PfCor);
		   TelaF.setLayout(null);
		   //TelaDLimpar
		   TelaDLimpar.setBounds(15, 50, 570, 335);
		   TelaDLimpar.setBackground(PdCor);
		   TelaDLimpar.setLayout(null);
		   //TelaDConfigurar
		   TelaDConfigurar.setBounds(15, 50, 570, 435);
		   TelaDConfigurar.setBackground(PdCor);
		   TelaDConfigurar.setLayout(null);
		   //Fecharbt
		   Fecharbt.setBounds(565, 0, 35, 35);
		   Fecharbt.setBackground(BtCor);
		   Fecharbt.setFocusable(false);
		   Fecharbt.setForeground(Color.WHITE);
		   Fecharbt.setBorder(null);
		   //Minimizar
		   Minimizarbt.setBounds(530, 0, 35, 35);
		   Minimizarbt.setBackground(BtCor);
		   Minimizarbt.setFocusable(false);
		   Minimizarbt.setForeground(Color.WHITE);
		   Minimizarbt.setBorder(null);
		   //TelaBar
	       ImageIcon IBar = new ImageIcon(getClass().getResource("/Imagens_Sons/MLimpador.png"));
		   TelaBar.setBounds(0, 0, 600, 35);
		   TelaBar.setBackground(Color.BLUE);
		   TelaBar.setLayout(null);
		   TelaBar.setIcon(IBar);
		   //Limparbt
		   Limparbt.setBounds(25, 215, 520, 95);
		   Limparbt.setBorder(null);
		   Limparbt.setBackground(CorP);
		   Limparbt.setFocusable(false);
           Limparbt.setForeground(Color.WHITE);
           Limparbt.setFont(new Font("MV Boli", 1, 21));
		   //Atualizarbt
		   Atualizarbt.setBounds(25, 315, 520, 95);
		   Atualizarbt.setBorder(null);
		   Atualizarbt.setBackground(CorP);
		   Atualizarbt.setFocusable(false);
           Atualizarbt.setForeground(Color.WHITE);
           Atualizarbt.setFont(new Font("MV Boli", 1, 21));
		   //Limpezabt
		   Limpezabt.setBounds(25, 65, 270, 80);
		   Limpezabt.setBorder(null);
		   Limpezabt.setBackground(CorP);
		   Limpezabt.setFocusable(false);
           Limpezabt.setForeground(Color.WHITE);
           Limpezabt.setFont(new Font("MV Boli", 1, 21));
		   //Configurarbt
		   Configurarbt.setBounds(300, 65, 270, 80);
		   Configurarbt.setBorder(null);
		   Configurarbt.setBackground(CorP);
		   Configurarbt.setFocusable(false);
           Configurarbt.setForeground(Color.WHITE);
           Configurarbt.setFont(new Font("MV Boli", 1, 22));
           //Progresso
           Progresso.setBounds(25, 175, 520, 30);
           Progresso.setBackground(PfCor);
           Progresso.setForeground(CorP);
           Progresso.setBorder(null);
           Progresso.setBorderPainted(false);
           //Windows
           WindowsTx.setBounds(50, 135, 250, 45);
           WindowsTx.setFont(new Font("MV Boli", 0, 16));
           Windowsc.setBounds(30, 150, 15, 15);
           Windowsc.setState(true);
           //Java
           JavaTx.setBounds(50, 155, 250, 45);
           JavaTx.setFont(new Font("MV Boli", 0, 16));
           Javac.setBounds(30, 170, 15, 15);
           Javac.setState(true);
           //Skype
           SkypeTx.setBounds(50, 175, 200, 45);
           SkypeTx.setFont(new Font("MV Boli", 0, 16));
           SkypeTxNome.setBounds(250, 175, 50, 45);
           SkypeTxNome.setFont(new Font("MV Boli", 0, 16));
           SkypeNome.setBounds(300, 175, 245, 35);
           SkypeNome.setFont(new Font("MV Boli", 0, 16));
           Skype.setBounds(30, 190, 15, 15);
           //Lol
           LolTx.setBounds(50, 195, 250, 45);
           LolTx.setFont(new Font("MV Boli", 0, 16));
           Lol.setBounds(30, 210, 15, 15);
           //Minecraft
           MinecraftTx.setBounds(50, 215, 250, 45);
           MinecraftTx.setFont(new Font("MV Boli", 0, 16));
           Minecraft.setBounds(30, 230, 15, 15);

		   this.add(Fecharbt);
		   this.add(Minimizarbt);
		   this.add(TelaBar);
		   this.add(Limpezabt);
		   this.add(Configurarbt);
		   this.add(TelaDLimpar);
		   this.add(TelaDConfigurar);
		   this.add(TelaF);
		   TelaDConfigurar.add(Atualizarbt);
		   TelaDConfigurar.add(WindowsTx);
		   TelaDConfigurar.add(Windowsc);
		   TelaDConfigurar.add(JavaTx);
		   TelaDConfigurar.add(Javac);
		   TelaDConfigurar.add(SkypeTx);
		   TelaDConfigurar.add(Skype);
		   TelaDConfigurar.add(SkypeTxNome);
		   TelaDConfigurar.add(SkypeNome);
		   TelaDConfigurar.add(LolTx);
		   TelaDConfigurar.add(Lol);
		   TelaDConfigurar.add(MinecraftTx);
		   TelaDConfigurar.add(Minecraft);
		   TelaDConfigurar.setVisible(false);
		   TelaDLimpar.add(Limparbt);
		   TelaDLimpar.add(Progresso);
		   
		   this.setUndecorated(true);
		   this.setVisible(true);
		   System.out.println("\nCliente: " + System.getProperty("user.name"));
           System.out.println("[  Feito por Monderdragon  ]");
           System.out.println("[Skype: Fernando.barbosa553]\n");
		   Botao();
		   Dados.verifica();
	    }
	   public void Botao(){
		   //Fechar
		   Fecharbt.addChangeListener(new ChangeListener() {
	            @Override
	            public void stateChanged(ChangeEvent evt) {
	                if (Fecharbt.getModel().isPressed()) {
	                	Fecharbt.setBackground(BtCor);
	    				System.exit(0);
	                }
	                
	            }
	        });
			  Fecharbt.addMouseListener(new java.awt.event.MouseAdapter() {
				    public void mouseEntered(java.awt.event.MouseEvent evt) {
				    	Fecharbt.setBackground(BtaCor);
	                	Fecharbt.setForeground(Color.WHITE);
	                	
				    }
				    public void mouseExited(java.awt.event.MouseEvent evt) {
				    	Fecharbt.setBackground(BtCor);
	                	Fecharbt.setForeground(Color.WHITE);
				    }
				});
		   //Minimizar
		  Minimizarbt.addChangeListener(new ChangeListener() {
	            @Override
	            public void stateChanged(ChangeEvent evt) {
	                if (Minimizarbt.getModel().isPressed()) {
	                	Minimizarbt.setBackground(Color.BLACK);
	                	Minimizarbt.getModel().setPressed(false);
	    				setState(JFrame.ICONIFIED);
	                	}
	                }
	        });
		  Minimizarbt.addMouseListener(new java.awt.event.MouseAdapter() {
			    public void mouseEntered(java.awt.event.MouseEvent evt) {
			    	Minimizarbt.setBackground(BtaCor);
              	Minimizarbt.setForeground(Color.WHITE);
			    }
			    public void mouseExited(java.awt.event.MouseEvent evt) {
			    	Minimizarbt.setBackground(BtCor);
              	Minimizarbt.setForeground(Color.WHITE);
			    }
			});
		   //Limpar
		  Limparbt.addChangeListener(new ChangeListener() {
	            @Override
	            public void stateChanged(ChangeEvent evt) {
	                if (Limparbt.getModel().isPressed()) {
	                	Limparbt.setBackground(CorP);
	                	
	                	LimparArquivosTP lpc = new LimparArquivosTP();
	                	// [WINDOWS PREFETCH] C:\Windows\Prefetch
	                    if(Windowsc.getState() == true){
					    lpc.LimparArquivosTP(new File("C:/Windows/Prefetch"));
		                System.out.println("Removido arquivos temporarios windows temp");
	                    Progresso.setValue(Progresso.getValue() + 20);
	                    }
	                    // [Java] C:\Users\Cliente\AppData\LocalLow\Sun\Java\Deployment\cache
		                if(Javac.getState() == true){
	                    lpc.LimparArquivosTP(new File("C:/Users/" + (System.getProperty("user.name")) + "/AppData/LocalLow/Sun/Java/Deployment/cache"));
	                    System.out.println("Removido arquivos temporarios java");
	                    Progresso.setValue(Progresso.getValue() + 20);
		                }
	                    // [SKYPE] C:\Users\Cliente\AppData\Roaming\Skype\fernando.barbosa553\media_messaging\media_cache
	                    if(Skype.getState() == true){
	                    lpc.LimparArquivosTP(new File("C:/Users/" + (System.getProperty("user.name")) + "/AppData/Roaming/Skype/" + SkypeNome.getText() + "/media_messaging/media_cache"));
	                    System.out.println("Removido arquivos recebidos skype");
	                    Progresso.setValue(Progresso.getValue() + 20);
	                    }
	                    // [WINDOWS TEMP] C:\Users\Cliente\AppData\Local\Temp
	                    if(Windowsc.getState() == true){
	                    lpc.LimparArquivosTP(new File("C:/Users/" + (System.getProperty("user.name")) + "/AppData/Local/Temp"));
	                    System.out.println("Removido arquivos temporarios windows temp");
	                    Progresso.setValue(Progresso.getValue() + 20);
	                    }
	                    // [LoL] C:\Riot Games\League of Legends\Logs
	                    if(Lol.getState() == true){
	                    lpc.LimparArquivosTP(new File("C:/Riot Games/League of Legends/Logs"));
	                    System.out.println("Removido arquivos temporarios lol");
	                    Progresso.setValue(Progresso.getValue() + 20);
	                    }
	                    // [Minecraft] C:\Users\Cliente\AppData\Roaming\.minecraft\logs
	                    if(Minecraft.getState() == true){
	                    lpc.LimparArquivosTP(new File("C:/Users/" + (System.getProperty("user.name")) + "/AppData/Roaming/.minecraft/logs"));
	                    lpc.LimparArquivosTP(new File("C:/Users/" + (System.getProperty("user.name")) + "/AppData/Roaming/.minecraft/launcherLog.txt"));
	                    System.out.println("Removido arquivos temporarios minecraft");
	                    Progresso.setValue(Progresso.getValue() + 20);
	                    }
	                    
	                    Progresso.setValue(100);
	                	Som.TocarSom(Limpado);
	                	//Som.SaberSobreSom(Limpado);
	                	System.out.println("[MLimpador] Limpado!");
	                	Limparbt.getModel().setPressed(false);
	                }
	            }
	        });
		  Limparbt.addMouseListener(new java.awt.event.MouseAdapter() {
			    public void mouseEntered(java.awt.event.MouseEvent evt) {
			    	Limparbt.setBackground(CorPA);
         	Limparbt.setForeground(Color.WHITE);
			    }
			    public void mouseExited(java.awt.event.MouseEvent evt) {
			    	Limparbt.setBackground(CorP);
         	Limparbt.setForeground(Color.WHITE);
            Progresso.setValue(0);
			    }
			});
		   //Limpezabt
		  Limpezabt.addChangeListener(new ChangeListener() {
	            @Override
	            public void stateChanged(ChangeEvent evt) {
	                if (Limpezabt.getModel().isPressed()) {
	                	Limpezabt.setBackground(CorP);
	         		    setSize(new Dimension(600, 400));
	                	Som.TocarSom(TrocaPagina);
	                	TelaDLimpar.setVisible(true);
	                	TelaDConfigurar.setVisible(false);
	                	Limpezabt.getModel().setPressed(false);
	                }
	            }
	        });
		  Limpezabt.addMouseListener(new java.awt.event.MouseAdapter() {
			    public void mouseEntered(java.awt.event.MouseEvent evt) {
			    	Limpezabt.setBackground(CorPA);
			    	Limpezabt.setForeground(Color.WHITE);
			    }
			    public void mouseExited(java.awt.event.MouseEvent evt) {
			    	Limpezabt.setBackground(CorP);
			    	Limpezabt.setForeground(Color.WHITE);
			    }
			});
		   //Configurarbt
		  Configurarbt.addChangeListener(new ChangeListener() {
	            @Override
	            public void stateChanged(ChangeEvent evt) {
	                if (Configurarbt.getModel().isPressed()) {
	                	Configurarbt.setBackground(CorP);
	         		    setSize(new Dimension(600, 500));
	                	Som.TocarSom(TrocaPagina);
	                	TelaDConfigurar.setVisible(true);
	                	TelaDLimpar.setVisible(false);
	                	Configurarbt.getModel().setPressed(false);
	                	System.out.println("Windows " + Windowsc.getState());
	                	System.out.println("Java " + Javac.getState());
	                	System.out.println("Skype " + Skype.getState());
	                	System.out.println("LoL " + Lol.getState());
	                	System.out.println("Minecraft " + Minecraft.getState());
	                }
	            }
	        });
		  Configurarbt.addMouseListener(new java.awt.event.MouseAdapter() {
			    public void mouseEntered(java.awt.event.MouseEvent evt) {
			    	Configurarbt.setBackground(CorPA);
			    	Configurarbt.setForeground(Color.WHITE);
			    }
			    public void mouseExited(java.awt.event.MouseEvent evt) {
			    	Configurarbt.setBackground(CorP);
			    	Configurarbt.setForeground(Color.WHITE);
			    }
			});
		   //Atualizarbt
		  Atualizarbt.addChangeListener(new ChangeListener() {
	            @Override
	            public void stateChanged(ChangeEvent evt) {
	                if (Atualizarbt.getModel().isPressed()) {
	                	Atualizarbt.setBackground(CorP);
	                	Som.TocarSom(Limpado);
	                	Atualizarbt.getModel().setPressed(false);
	                }
	            }
	        });
		  Atualizarbt.addMouseListener(new java.awt.event.MouseAdapter() {
			    public void mouseEntered(java.awt.event.MouseEvent evt) {
			    	Atualizarbt.setBackground(CorPA);
			    	Atualizarbt.setForeground(Color.WHITE);
			    }
			    public void mouseExited(java.awt.event.MouseEvent evt) {
			    	Atualizarbt.setBackground(CorP);
			    	Atualizarbt.setForeground(Color.WHITE);
			    }
			});
	   }
	public static void main(String[] args){ 
		    new Tela();
	}
}