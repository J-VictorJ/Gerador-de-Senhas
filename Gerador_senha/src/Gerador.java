import java.util.Scanner;
public class Gerador {
    public String[] caracteres = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
            "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
            "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "+", "="};

    String host;

    Scanner input = new Scanner(System.in);
    int caractere = input.nextInt();
    public String Gerar() {
        int input = caractere;
        StringBuilder senha = new StringBuilder();
        for (int i = 0; i <= input - 1; i++) {
            senha.append(caracteres[(int) (Math.random() * caracteres.length)]);
        }
        host = senha.toString();
        return host;
    }
    public String getHost(){
        return host;
    }
}