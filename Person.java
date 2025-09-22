public class Person {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phone_num;

    public Person(String _id, String _firstName, String _lastName, String _email, String _address, String _phoneNum) {
        id = _id;
        firstName = _firstName;
        lastName = _lastName;
        email = _email;
        address = _address;
        phone_num = _phoneNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

}