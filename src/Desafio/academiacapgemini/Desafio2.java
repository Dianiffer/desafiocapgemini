package Desafio.academiacapgemini;

import java.util.Scanner;

public class Desafio2 {
	
/*	
	# Questão 02

	Débora se inscreveu em uma rede social para se manter em contato com seus amigos. 
	A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. 
	O site considera uma senha forte quando ela satisfaz os seguintes critérios:
	
	Possui no mínimo 6 caracteres.
	Contém no mínimo 1 digito.
	Contém no mínimo 1 letra em minúsculo.
	Contém no mínimo 1 letra em maiúsculo.
	Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
	
	*/
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva a sua senha: ");
		
	}
	
	
	public String verificarTudo(String senha) {
		
		if(verificaQuantidadeDeDigitos(senha)) {
			return String.format("Senha contem o minimo de caracter informado que é de %d", senha.length());
		}else {
			return String.format("A senha possui %d, está incorreto, o minimo necessario é de 6 digitos acrescente mais %d", senha.length(), 6 - senha.length());
		}
		
		if(verificarSeExisteUmNumero(senha)){
			return "Quantidade de numero(s) ok.";
		}else {
			return "Por favor é necessario acrescentar um numero inteiro na sua senha.";
		};
		
		if(verificaSeExisteLetraMaiuscula(senha)) {
			return "A senha possui uma letra maiuscula";
		}else {
			return "É necessario adicionar uma letra maiuscula em sua senha";
		};
		
		
		if(verificaSeExisteLetraMinuscula(senha)) {
			return "Senha ok, possui letras minusculas";
		}else {
			return "É necessario adicionar uma letra minuscula a sua senha";
		};
		
		if(verificaSeExisteCaracterEspecial(senha)) {
			return "Senha ok caracter especial encontrado";
		}else {
			return "É necessario um caracter especial";
		};
		
	}
	

	
	public boolean verificaQuantidadeDeDigitos(String senha) {
		if(senha.length() < 6) {
			return false;
		}else {
			return true;
		}
	}
	
	
	public boolean verificarSeExisteUmNumero(String senha) {
		String clearString = senha.replaceAll("[a-zA-Z]", "");
		
		if(clearString.length() <= 0) {
			return false;
		}
		return true;
	}
	
	
	
	public boolean verificaSeExisteLetraMaiuscula(String senha) {
		String minuscula = senha.replaceAll("[^a-z$]", "");
		if(minuscula.length() <= 0) {
			return false;
		}
		return true;
		
	}
	
	public boolean verificaSeExisteLetraMinuscula(String senha) {
		String maiuscula = senha.replaceAll("[^A-Z$]", "");
		if(maiuscula.length() <= 0) {
			return false;
		}
		return true;
	}
	
	
	public boolean verificaSeExisteCaracterEspecial(String senha) {
		 senha = senha.replaceAll("[a-zA-z0-9]*", "");
		 if(senha.length() <= 0) {
			 return false;
		 }
		 return true;
	}
	
	
}
