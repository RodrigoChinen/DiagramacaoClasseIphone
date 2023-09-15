package aparelho;

import aparelho.internet.NavegadorInternetInterface;
import aparelho.musica.ReprodutorMusicalInterface;
import aparelho.ligacao.AparelhoTelefonicoInterface;

public class Iphone implements AparelhoTelefonicoInterface , ReprodutorMusicalInterface, NavegadorInternetInterface{

    @Override
    public void ligar() {
        System.out.println("Efetuando Ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Ligação");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Acessar Correio de Voz");
    }

    public void tocar() {
        System.out.println("Reproduzindo Música");
    }


    public void pausar() {
        System.out.println("Música Pausada");
    }

    public void selecionarMusica() {
        System.out.println("Selecione Música");
    }
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar a Página");
    }
}