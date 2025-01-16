package aparelhos.navegadorInternet;

public class NavegadorWeb implements NavegadorInternet{

    public void exibirPagina(String url) {
        System.out.println("Exibindo página da Url selecionada: " + url);

    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");

    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina");

    }
}
