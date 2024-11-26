import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PagamentoDAO {
    public double totalArrecadadoPorViagem(int viagemID) {
        double total = 0.0;
        String sql = "SELECT TotalArrecadado(?) AS Total";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, viagemID);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    total = rs.getDouble("Total");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return total;
    }
}