public class Arquivo implements Comparable<Arquivo> {
    private String nome;
    private boolean isDiretorio;

    public Arquivo(String nome, boolean isDiretorio) {
        this.nome = nome;
        this.isDiretorio = isDiretorio;
    }

    public String getNome() {
        return nome;
    }

    public boolean isDiretorio() {
        return isDiretorio;
    }

    @Override
    public int compareTo(Arquivo outro) {
        // Compara arquivos pelo nome
        return this.nome.compareTo(outro.getNome());
    }

    @Override
    public String toString() {
        // Retorna a representação em String do arquivo/diretório
        return (isDiretorio ? "[D] " : "[F] ") + nome;
    }
}
