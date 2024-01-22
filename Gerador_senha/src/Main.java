public class Main {
    public static void main(String[] args) {
        System.out.println("Quantos characteres? Somente números! ");
        Gerador senha = new Gerador();
        senha.Gerar();
        System.out.println(senha.getHost());

    }
}