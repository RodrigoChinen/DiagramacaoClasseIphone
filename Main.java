import aparelho.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone aparelho = new Iphone();
        System.out.println("                                     ");
        aparelho.ligar();
        aparelho.atender();
        aparelho.iniciarCorrerioVoz();
        System.out.println("                                     ");
        aparelho.pausar();
        aparelho.tocar();
        aparelho.selecionarMusica();
        System.out.println("                                     ");
        aparelho.adicionarNovaAba();
        aparelho.atualizarPagina();
        aparelho.exibirPagina();
    }
}