package br.com.javatagua.sa1.app3;//pacote


import javax.swing.JOptionPane;

import br.com.javatagua.sa1.bo.AssentoBO;

//Um pacote é um conjunto de classes.

public class Principal {//Classe

	public static void main(String[] args) {//Método principal
		// TODO Auto-generated method stub
		//Pega a resposta em string (texto)
        String resp = JOptionPane.showInputDialog("Digite a qtde de aviões:");
        //Converte a resposta para inteiro
        int qtdeAvioes = Integer.parseInt(resp);
        
        //Criar o objeto
        AssentoBO abo = new AssentoBO();
        
        JOptionPane.showMessageDialog(null,"Qtde Geral de Assentos: "+abo.calcularAssentos(qtdeAvioes));
        
        
        
	}

}
