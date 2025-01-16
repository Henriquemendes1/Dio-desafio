import aparelhos.aparelhoTelefonico.AparelhoTelefonico;
import aparelhos.celular.Iphone;
import aparelhos.navegadorInternet.NavegadorInternet;
import aparelhos.reprodutorMusical.ReprodutorMusical;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Iphone celular = new Iphone();
        ReprodutorMusical reprodutorMusical = celular;
        NavegadorInternet navegadorWeb = celular;
        AparelhoTelefonico telefone = celular;

        System.out.println("Digite a musica a ser reproduzida: ");
        String musica = sc.nextLine();
        reprodutorMusical.selecionarMusica(musica);
        reprodutorMusical.reproduzir();
        reprodutorMusical.pausar();

        System.out.println("Digite o site que deseja exibir: ");
        String url = sc.nextLine();
        navegadorWeb.exibirPagina(url);
        navegadorWeb.atualizarPagina();
        navegadorWeb.adicionarNovaAba();


    }
}