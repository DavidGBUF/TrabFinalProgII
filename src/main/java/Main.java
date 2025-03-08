import models.Musica;
import musicPlayer.Catalogo;
import musicPlayer.Loader;

//Refatoração Completa

public class Main {
    public static void main(String[] args) {
        String diretorioMusicas = "src/main/resources";
        Catalogo catalogo = Loader.carregarCatalogo(diretorioMusicas);

        // Exibe as músicas carregadas
        for (Musica musica : catalogo.getMusicas()) {
            System.out.println(musica.toString());
        }



    }
}