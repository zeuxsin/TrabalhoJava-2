public class Onibus {
    private int onibusID;
    private String modelo;
    private String placa;
    private int capacidade;

    // Getters
    public int getOnibusID() {
        return onibusID;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getCapacidade() {
        return capacidade;
    }

    // Setters
    public void setOnibusID(int onibusID) {
        this.onibusID = onibusID;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}