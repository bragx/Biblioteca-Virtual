package data;

public class LoginLeitor {
            private int id;
            private String email;
            private String usuario;
            private String senha;
            private String status;

    public LoginLeitor() {
    }

    public LoginLeitor(int id, String email, String usuario, String senha, String status) {
        this.id = id;
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String nome) {
        this.usuario = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}