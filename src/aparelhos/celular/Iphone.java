package aparelhos.celular;

import aparelhos.aparelhoTelefonico.AparelhoTelefonico;
import aparelhos.navegadorInternet.NavegadorInternet;
import aparelhos.reprodutorMusical.ReprodutorMusical;

import java.util.Scanner;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {



    //telefone --------------------------------------------------------
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + " Pelo celular" );
    }

    public void atender() {
        System.out.println("Atendendo ligação pelo celular");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado pelo celular");
    }


    //navegador ------------------------------------------------------------

    //public void abrirNavegador() {

    //}

    public void exibirPagina(String url) {
        System.out.println("Exibindo página da Url selecionada: " + url+ " pelo navegador do celular");
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada pelo navegador do celular");

    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina pelo navegador do celular");

    }

    //musica ------------------------------------------------------------------
    public void reproduzir() {
        System.out.println("Tocando musica selecionada pelo aplicativo do celular");
    }

    public void pausar() {
        System.out.println("Musica pausada pelo aplicativo do celular");

    }

    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: "+ musica + " pelo aplicativo do celular");


    }

}

