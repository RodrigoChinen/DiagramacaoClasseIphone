package aparelho;

import aparelho.internet.NavegadorInternetInterface;
import aparelho.musica.ReprodutorMusicalInterface;
import aparelho.ligacao.AparelhoTelefonicoInterface;

public class Iphone implements AparelhoTelefonicoInterface , ReprodutorMusicalInterface, NavegadorInternetInterface{

    @Override
    public void ligar() {
        System.out.println("Realizando chamada");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public void tocar() {
        System.out.println("Tocando musica");
    }


    public void pausar() {
        System.out.println("Pausando musica");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando musica");
    }
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar Página");
    }
}