import java.util.ArrayList;
import java.util.Date;

public class Saleperson extends Staff {
    private String saleId;
    private double totalSale;
    private ArrayList<Invoice> invoices;

    public Saleperson(String _id, String _firstName, String _lastName, String _email, String _address, String _phoneNum, String _staffId, Date _hireDate, String _saleId, Double _totalSale) {
        super(_id, _firstName, _lastName, _email, _address, _phoneNum, _staffId, _hireDate);
        saleId = _saleId;
        totalSale = _totalSale;
    }

    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId;
    }

    public double getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(double totalSale) {
        this.totalSale = totalSale;
    }

    public ArrayList<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(ArrayList<Invoice> invoices) {
        this.invoices = invoices;
    }
    
}