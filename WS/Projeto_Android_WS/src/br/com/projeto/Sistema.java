package br.com.projeto;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Sistema {

	public static String PATH_CONFIG = "";
	public static final String APP_ACCESS_TOKEN = "570854019757986|wlsnDSdcWhFs586zho4_dgJtc18";
	private static Properties config = new Properties();

	public void carregar(){
		try {
			config.load(new FileInputStream(PATH_CONFIG));
			System.out.println("\nCarregando configura��es.");
			System.out.println("Tipo: " + config.getProperty("CONEXAO.TIPO"));
			System.out.println("Banco: " + config.getProperty("CONEXAO.BANCO"));
			System.out.println("Servidor: " + config.getProperty("CONEXAO.SERVIDOR"));
			System.out.println("Usu�rio: " + config.getProperty("CONEXAO.USUARIO"));
			System.out.println("Senha: " + config.getProperty("CONEXAO.SENHA"));
			System.out.println("Configura��es carregadas.\n");
		} catch (IOException e) {
			System.out.println("N�o foi poss�vel carregar as configura��es.");
		}
	}
	
	public static String getParametro(String parametro){
		return config.getProperty(parametro);
	}
	
	public String getAccessToken(){
		return APP_ACCESS_TOKEN;
	}
}