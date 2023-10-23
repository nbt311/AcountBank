package src;

public class Customer {
    private Integer code;
    private String name;
    private String address;
    private String phoneNumber;

    public Customer(Integer code,String name,String address,String phoneNumber){
        this.code = code;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
