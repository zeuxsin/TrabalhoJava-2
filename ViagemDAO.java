import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ViagemDAO {
    public List<Viagem> listarViagensPorDestino(String destino) {
        List<Viagem> viagens = new ArrayList<>();
        String sql = "CALL ListarViagensPorDestino(?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, destino);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Viagem viagem = new Viagem();
                    viagem.setViagemID(rs.getInt("ViagemID"));
                    viagem.setOrigem(rs.getString("Origem"));
                    viagem.setDestino(rs.getString("Destino"));
                    viagem.setDataPartida(rs.getTimestamp("DataPartida").toLocalDateTime());
                    viagem.setDataChegada(rs.getTimestamp("DataChegada").toLocalDateTime());
                    viagem.setOnibusID(rs.getInt("OnibusID"));

                    viagens.add(viagem);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return viagens;
    }
}