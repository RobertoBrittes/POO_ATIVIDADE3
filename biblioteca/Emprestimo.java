package biblioteca;

public class Emprestimo {
    private Livro livro;
    private Pessoa pessoa; // Pode ser tanto um Estudante quanto um Professor!
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(Livro livro, Pessoa pessoa, String dataEmprestimo, String dataDevolucao) {
        this.livro = livro;
        this.pessoa = pessoa;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Emprestimo() {}

    public Livro getLivro() { return livro;}
    public void setLivro(Livro livro) { this.livro = livro;}
    
    public String getDataEmprestimo() { return dataEmprestimo;}
    public void setDataEmprestimo(String dataEmprestimo) { this.dataEmprestimo = dataEmprestimo;}

    public String getDataDevolucao() { return dataDevolucao;}
    public void setDataDevolucao(String dataDevolucao) { this.dataDevolucao = dataDevolucao;}

    public Pessoa getPessoa() { return pessoa;}
    public void setPessoa(Pessoa pessoa) { this.pessoa = pessoa;}
}
