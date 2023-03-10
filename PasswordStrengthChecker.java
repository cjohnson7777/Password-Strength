import java.util.Scanner;

public class PasswordStrengthChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
		    
	
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Please enter a password to check its strength:");
		        String password = scanner.nextLine();
		        
		        int length = password.length();
		        boolean hasUppercase = !password.equals(password.toLowerCase());
		        boolean hasLowercase = !password.equals(password.toUpperCase());
		        boolean hasDigits = password.matches(".*\\d.*");
		        boolean hasSpecialChars = !password.matches("[A-Za-z0-9]*");
		        
		        int strength = 0;
		        
		        if (length >= 8 && hasUppercase && hasLowercase && hasDigits && hasSpecialChars) {
		            strength = 5;
		        } else if (length >= 8 && hasUppercase && hasLowercase && hasDigits) {
		            strength = 4;
		        } else if (length >= 8 && hasUppercase && hasLowercase) {
		            strength = 3;
		        } else if (length >= 8 && (hasUppercase || hasLowercase || hasDigits)) {
		            strength = 2;
		        } else if (length >= 8) {
		            strength = 1;
		        }
		        
		        System.out.println("The strength of your password is: " + strength);
		    }
		}


	}
