public class Cliente {
    private int clienteID;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    // Getters
    public int getClienteID() {
        return clienteID;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}