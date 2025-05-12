package com.pluarlsight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors; // For Phase 5

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory; // As per UML

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>(); // Instantiate the ArrayList
    }

    // --- Getters --- //-
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }

    // --- Setters --- //
    public void setName(String name) { this.name = name; }
    public void setAddress(String address) { this.address = address; }
    public void setPhone(String phone) { this.phone = phone; }

    public List<Vehicle> getAllVehicles() {
        return new ArrayList<>(this.inventory); // Return a copy for encapsulation
    }

    public void addVehicle(Vehicle vehicle) {
        this.inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        this.inventory.removeIf(v -> v.getVin() == vehicle.getVin());
    }

    // Search methods - initial stubs (return null as per requirement)
    public List<Vehicle> getVehiclesByPrice(double minPrice, double maxPrice) {
        return this.inventory.stream()
                .filter(v -> v.getPrice() >= minPrice && v.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        // Phase 1: return null;
        return this.inventory.stream()
                .filter(v -> v.getMake().equalsIgnoreCase(make) && v.getModel().equalsIgnoreCase(model))
                .collect(Collectors.toList());
    }

    public List<Vehicle> getVehiclesByYear(int minYear, int maxYear) {
        // Phase 1: return null;
        return this.inventory.stream()
                .filter(v -> v.getYear() >= minYear && v.getYear() <= maxYear)
                .collect(Collectors.toList());
    }

    public List<Vehicle> getVehiclesByColor(String color) {
        // Phase 1: return null;
        return this.inventory.stream()
                .filter(v -> v.getColor().equalsIgnoreCase(color))
                .collect(Collectors.toList());
    }

    public List<Vehicle> getVehiclesByMileage(int minMileage, int maxMileage) {
        // Phase 1: return null;
        return this.inventory.stream()
                .filter(v -> v.getOdometer() >= minMileage && v.getOdometer() <= maxMileage)
                .collect(Collectors.toList());
    }

    public List<Vehicle> getVehiclesByType(String vehicleType) {
        // Phase 1: return null;
        return this.inventory.stream()
                .filter(v -> v.getVehicleType().equalsIgnoreCase(vehicleType))
                .collect(Collectors.toList());
    }
}