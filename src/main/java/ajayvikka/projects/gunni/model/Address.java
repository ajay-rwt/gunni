package ajayvikka.projects.gunni.model;

public class Address {

    private String apartmentNumber;
    private String buildingName;
    private String street;
    private String city;
    private String state;
    private String country;
    private String zipCode;

    public Address() { }

    public Address(
            String apartmentNumber,
            String buildingName,
            String street,
            String city,
            String state,
            String country,
            String zipCode
    ) {
        this.apartmentNumber = apartmentNumber;
        this.buildingName = buildingName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

}
