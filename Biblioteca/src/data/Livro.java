package data;

public class Livro 
{
            private String nome;
            private String genero;
            private String anoLancamento;
            private String autor;

    public Livro() {
    }

    public Livro(String nome, String genero, String anoLancamento, String autor) {
        this.nome = nome;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
