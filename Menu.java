import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ViagemDAO viagemDAO = new ViagemDAO();
        PagamentoDAO pagamentoDAO = new PagamentoDAO();

        while (true) {
            System.out.println("\n=== Sistema de Vendas de Passagens ===");
            System.out.println("1. Listar Viagens por Destino");
            System.out.println("2. Calcular Total Arrecadado por Viagem");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o destino: ");
                    scanner.nextLine(); // Limpar buffer
                    String destino = scanner.nextLine();

                    List<Viagem> viagens = viagemDAO.listarViagensPorDestino(destino);
                    if (viagens.isEmpty()) {
                        System.out.println("Nenhuma viagem encontrada para o destino: " + destino);
                    } else {
                        System.out.println("Viagens encontradas:");
                        for (Viagem v : viagens) {
                            System.out.printf("ID: %d | Origem: %s | Destino: %s | Partida: %s | Chegada: %s%n",
                                    v.getViagemID(), v.getOrigem(), v.getDestino(),
                                    v.getDataPartida(), v.getDataChegada());
                        }
                    }
                    break;

                case 2:
                    System.out.print("Digite o ID da Viagem: ");
                    int viagemID = scanner.nextInt();

                    double total = pagamentoDAO.totalArrecadadoPorViagem(viagemID);
                    System.out.printf("Total arrecadado para a viagem %d: R$ %.2f%n", viagemID, total);
                    break;

                case 3:
                    System.out.println("Encerrando o sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}