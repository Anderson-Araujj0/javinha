package com.vehicleapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VehicleManager vehicleManager = new VehicleManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Gerenciamento de Veículos ===");

        while (running) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar veículo");
            System.out.println("2. Listar veículos");
            System.out.println("3. Remover veículo");
            System.out.println("4. Sair");
            System.out.print("Opção: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (choice) {
                case 1:
                    System.out.print("Digite o modelo do veículo: ");
                    String model = scanner.nextLine();

                    System.out.print("Digite a marca do veículo: ");
                    String brand = scanner.nextLine();

                    System.out.print("Digite o ano do veículo: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha

                    vehicleManager.addVehicle(new Vehicle(model, brand, year));
                    System.out.println("Veículo adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("\nLista de Veículos:");
                    vehicleManager.listVehicles();
                    break;

                case 3:
                    System.out.print("Digite o índice do veículo para remover: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha
                    if (vehicleManager.removeVehicle(index)) {
                        System.out.println("Veículo removido com sucesso!");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 4:
                    running = false;
                    System.out.println("Encerrando aplicação...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
