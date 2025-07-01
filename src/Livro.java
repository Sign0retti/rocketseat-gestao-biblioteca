import java.util.Date;

public class Livro {
    int id;
    String titulo;
    String nomeAutor;
    Boolean disponivel;
    Date dataCadastro;
    Date dataAtualizacao;


    public Livro(int id, String titulo, Autor autor){
        this.id = id;
        this.titulo = titulo;
        this.nomeAutor = nomeAutor;
        this.disponivel = true;
        this.dataCadastro = dataCadastro;
        this.dataAtualizacao = dataAtualizacao;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return nomeAutor;
    }

    public void setAutor(String autor){
        this.nomeAtor = autor;
    }

    public boolean getDisponivel(){
        return disponivel;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro){
        this.dataCadastro = dataCadastro;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public boolean consultaDisponibilidade() {
        if (!getDisponivel()) {
            System.out.println("Livro indisponivel.");
            return false;
        } else {
            return true;
        }
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + nomeAutor);
        System.out.println("Data de Cadastro: " + dataCadastro);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }


    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor=" + nomeAutor +
                ", disponivel=" + disponivel +
                ", dataCadastro=" + dataCadastro +
                ", dataAtualizacao=" + dataAtualizacao +
                '}';
    }
}





