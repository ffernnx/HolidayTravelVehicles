public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(
            "V001", 
            "Mercedes-Benz V-Class", 
            "V-Class", 
            2024, 
            "Mercedes-Benz AG", 
            5820000.0
        );
        
        System.out.println("-------------------------");
        System.out.println("Vehicle ID: " + vehicle.getVehicleId());
        System.out.println("Name: " + vehicle.getName());
        System.out.println("Model: " + vehicle.getModel());
        System.out.println("Year: " + vehicle.getYear());
        System.out.println("Manufacturer: " + vehicle.getManufacturer());
        System.out.println("Price: $" + String.format("%.2f", vehicle.getPrice()));
        System.out.println("-------------------------");
    }
}
