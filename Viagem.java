import java.time.LocalDateTime;

public class Viagem {
    private int viagemID;
    private String origem;
    private String destino;
    private LocalDateTime dataPartida;
    private LocalDateTime dataChegada;
    private int onibusID;

    // Getters e Setters
    public int getViagemID() { return viagemID; }
    public void setViagemID(int viagemID) { this.viagemID = viagemID; }

    public String getOrigem() { return origem; }
    public void setOrigem(String origem) { this.origem = origem; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public LocalDateTime getDataPartida() { return dataPartida; }
    public void setDataPartida(LocalDateTime dataPartida) { this.dataPartida = dataPartida; }

    public LocalDateTime getDataChegada() { return dataChegada; }
    public void setDataChegada(LocalDateTime dataChegada) { this.dataChegada = dataChegada; }

    public int getOnibusID() { return onibusID; }
    public void setOnibusID(int onibusID) { this.onibusID = onibusID; }
}