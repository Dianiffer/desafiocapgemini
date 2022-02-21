package Desafio.academiacapgemini;

public class ClasseParaTestar {
	
	
	
	public static void main(String[] args) {
		
		String teste = "aBcde345!@";
		
		String minuscula = teste.replaceAll("[^a-z$]", "");
		
		String maiuscula = teste.replaceAll("[^A-Z$]", "");
		
		teste = teste.replaceAll("[a-zA-z0-9]*", "");
		
		
		System.out.println(teste);
		
	}
	
}


