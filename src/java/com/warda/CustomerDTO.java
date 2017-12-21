package com.warda;

public class CustomerDTO {

private Integer customerId;
    private String name;
    private String addressline1;
    private String addressline2;
    private String city;
    private String state;
    private String phone;
    private String fax;
    private String email;
    private Integer creditLimit;
    /**
     * @return the customerId
     */
    public Integer getCustomerId() {
        return customerId;
    }
    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the addressline1
     */
    public String getAddressline1() {
        return addressline1;
    }
    /**
     * @param addressline1 the addressline1 to set
     */
    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }
    /**
     * @return the addressline2
     */
    public String getAddressline2() {
        return addressline2;
    }
    /**
     * @param addressline2 the addressline2 to set
     */
    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2;
    }
    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }
    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }
    /**
     * @return the state
     */
    public String getState() {
        return state;
    }
    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }
    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }
    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
     * @return the fax
     */
    public String getFax() {
        return fax;
    }
    /**
     * @param fax the fax to set
     */
    public void setFax(String fax) {
        this.fax = fax;
    }
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * @return the creditLimit
     */
    public Integer getCreditLimit() {
        return creditLimit;
    }
    /**
     * @param creditLimit the creditLimit to set
     */
    public void setCreditLimit(Integer creditLimit) {
        this.creditLimit = creditLimit;
    }
    @Override
    public String toString() {
        return name + ", " + addressline1 + "\n" + addressline2
                + ", " + city;
    }
    
    

    
}
