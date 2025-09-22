import java.util.ArrayList;
import java.util.Date;

public class Invoice {
    private String invoiceId;
    private Date invoiceDate;
    private double rawPrice;
    private double taxes;
    private double licenseFee;
    private double finalPrice;
    private String customerSign;

    private Customer customer;
    private Saleperson saleperson;
    private ArrayList<Vehicle> vehicles;
    
    public Invoice(String invoiceId, Date invoiceDate, double rawPrice, double taxes,
            double licenseFee, double finalPrice, String customerSign) {
        this.invoiceId = invoiceId;
        this.invoiceDate = invoiceDate;
        this.rawPrice = rawPrice;
        this.taxes = taxes;
        this.licenseFee = licenseFee;
        this.finalPrice = finalPrice;
        this.customerSign = customerSign;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public double getRawPrice() {
        return rawPrice;
    }

    public void setRawPrice(double rawPrice) {
        this.rawPrice = rawPrice;
    }

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public double getLicenseFee() {
        return licenseFee;
    }

    public void setLicenseFee(double licenseFee) {
        this.licenseFee = licenseFee;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getCustomerSign() {
        return customerSign;
    }

    public void setCustomerSign(String customerSign) {
        this.customerSign = customerSign;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Saleperson getSaleperson() {
        return saleperson;
    }

    public void setSaleperson(Saleperson saleperson) {
        this.saleperson = saleperson;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
    
}