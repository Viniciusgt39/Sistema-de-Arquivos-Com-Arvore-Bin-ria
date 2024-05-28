public class Maincopy {
    public static void main(String[] args) {
        // Cria um novo sistema de arquivos
        ArvoreArquivos sistemaDeArquivos = new ArvoreArquivos();
        
        // Adiciona arquivos e diretórios ao sistema
        sistemaDeArquivos.adicionarArquivo("Documentos", true);
        sistemaDeArquivos.adicionarArquivo("Fotos", true);
        sistemaDeArquivos.adicionarArquivo("musica.mp3", false);
        sistemaDeArquivos.adicionarArquivo("video.mp4", false);
        
        // Lista arquivos e diretórios em ordem
        System.out.println("\nArquivos em ordem:");
        sistemaDeArquivos.listarArquivosEmOrdem();

        // Remove um arquivo do sistema
        System.out.println("\nRemovendo arquivo 'musica.mp3':");
        sistemaDeArquivos.removerArquivo("musica.mp3");

        // Lista arquivos e diretórios em ordem após remoção
        System.out.println("\nArquivos em ordem após remoção:");
        sistemaDeArquivos.listarArquivosEmOrdem();

        // Busca arquivos no sistema
        System.out.println("\nBuscar arquivo 'Documentos': " + sistemaDeArquivos.buscarArquivo("Documentos"));
        System.out.println("Buscar arquivo 'musica.mp3': " + sistemaDeArquivos.buscarArquivo("musica.mp3"));
    }
}
