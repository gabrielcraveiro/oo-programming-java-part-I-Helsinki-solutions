import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int passwordLength;
    private Random random;

    public PasswordRandomizer(int length) {
        // Initialize the variable
       this.passwordLength = length;
       this.random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        String novaSenha = "";
        while (i < this.passwordLength) {
            novaSenha = novaSenha + alfabeto.charAt(this.random.nextInt(26));
            i++;
        }
        return novaSenha;
    }
}
