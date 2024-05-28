public class ArvoreArquivos {
    private Arvore<Arquivo> arvoreArquivos;

    public ArvoreArquivos() {
        this.arvoreArquivos = new Arvore<Arquivo>();
    }

    public void adicionarArquivo(String nome, boolean isDiretorio) {
        // Adiciona um novo arquivo ou diretório à árvore
        Arquivo novoArquivo = new Arquivo(nome, isDiretorio);
        arvoreArquivos.adicionar(novoArquivo);
    }

    public void removerArquivo(String nome) {
        // Remove um arquivo ou diretório da árvore
        Arquivo arquivoARemover = new Arquivo(nome, false); // Assume-se que não há dois arquivos com o mesmo nome
        arvoreArquivos.remover(arquivoARemover);
    }

    public boolean buscarArquivo(String nome) {
        // Busca um arquivo ou diretório na árvore
        Arquivo arquivoABuscar = new Arquivo(nome, false);
        return arvoreArquivos.buscar(arquivoABuscar);
    }

    public void listarArquivosEmOrdem() {
        // Lista arquivos e diretórios em ordem
        arvoreArquivos.emOrdem(arvoreArquivos.getRaiz());
    }
}

