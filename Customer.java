import java.util.ArrayList;

public class Customer extends Person {
    private String customerId;
    private ArrayList<Invoice> invoices;

    public Customer(String _id, String _firstName, String _lastName, String _email, String _address, String _phoneNum, String _customerId) {
        super(_id, _firstName, _lastName, _email, _address, _phoneNum);
        customerId = _customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public ArrayList<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(ArrayList<Invoice> invoices) {
        this.invoices = invoices;
    }
}