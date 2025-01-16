package aparelhos.reprodutorMusical;

public class Ipod implements ReprodutorMusical{
    public void reproduzir() {
        System.out.println("Tocando musica selecionada");
    }

    public void pausar() {
        System.out.println("Musica pausada");

    }

    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada "+ musica);

    }
}
