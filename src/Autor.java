import java.util.Date;

public class Autor {
    int id;
    String nomeAutor;
    Date dataNascimento;

    public Autor(String nome) {
        this.nomeAutor = nome;
    }

    public int getId() {
        return id;
    }

    public String getNomeAutor(){
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }


    @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", nome='" + nomeAutor + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}





