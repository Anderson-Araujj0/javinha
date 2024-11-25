package com.vehicleapp;

import java.util.ArrayList;
import java.util.List;

public class VehicleManager {
    private List<Vehicle> vehicles;

    public VehicleManager() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void listVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
        } else {
            for (int i = 0; i < vehicles.size(); i++) {
                System.out.println(i + ". " + vehicles.get(i));
            }
        }
    }

    public boolean removeVehicle(int index) {
        if (index >= 0 && index < vehicles.size()) {
            vehicles.remove(index);
            return true;
        }
        return false;
    }
}
