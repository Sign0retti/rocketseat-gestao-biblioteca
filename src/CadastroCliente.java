import java.util.Date;

public class CadastroCliente {
    String nomeUsuario;
    String id;
    String email;
    Date dataNascimento;

    public String getNome() {
        return nomeUsuario;
    }

    public void setNome(String nome) {
        this.nomeUsuario = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
