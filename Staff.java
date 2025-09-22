import java.util.Date;

public class Staff extends Person {
    private String staffId;
    private Date hireDate;

    public Staff(String _id, String _firstName, String _lastName, String _email, String _address, String _phoneNum, String _staffId, Date _hireDate) {
        super(_id, _firstName, _lastName, _email, _address, _phoneNum);
        staffId = _staffId;
        hireDate = _hireDate;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    
}