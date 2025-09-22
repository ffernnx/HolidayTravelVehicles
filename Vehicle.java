import java.util.ArrayList;

public class Vehicle {
    private String vehicleId;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double price;

    private ArrayList<TalkDeal> TalkDeals;
    private Invoice invoice;
    
    public Vehicle(String vehicleId, String name, String model, int year, String manufacturer, double price) {
        this.vehicleId = vehicleId;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<TalkDeal> getTalkDeals() {
        return TalkDeals;
    }

    public void setTalkDeal(ArrayList<TalkDeal> TalkDeals) {
        this.TalkDeals = TalkDeals;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    
}