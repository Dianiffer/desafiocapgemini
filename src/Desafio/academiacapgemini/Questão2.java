package Desafio.academiacapgemini;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questão2 {

	public static void main(String[] args) {
		
		

	    

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Nome");
	        String nome = scanner.next();
	        System.out.println("Senha");
	        String senha = scanner.next();



	        System.out.println(validaSenha(senha));
		

	}
	
	public static boolean validaSenha(String senha) {

        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[!@#$%^&*()-+])"
                + "(?=\\S+$).{6}$";

        Pattern p = Pattern.compile(regex);


        if (senha == null) {
            return false;
        }



        Matcher m = p.matcher(senha);

        return m.matches();
    }

}
