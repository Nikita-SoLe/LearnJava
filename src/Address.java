public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String houseNum;
    private int apartmentNumber;

    Address() {
        this.country = "None";
        this.region = "None";
        this.city = "None";
        this.street = "None";
        this.houseNum = "0";
        this.apartmentNumber = 0;
    }
    Address(String country, String region, String city, String street, String houseNum, int apartmentNumber) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.houseNum = houseNum;
        this.apartmentNumber = apartmentNumber;
    }
    public static Address getVoidAddress() {
        return new Address();
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setHouseNum(String num) {
        this.houseNum = num;
    }
    public void setApartmentNumber(int num) {
        this.apartmentNumber = num;
    }
    public String printAddress() {
        return String.format(
                "\tСтрана: %s\n" +
                "\tРегион: %s\n" +
                "\tГород: %s\n" +
                "\tУлица: %s\n" +
                "\tДом: № %s\n" +
                "\tКвартира: № %s\n",
                this.country, this.region, this.city, this.street, this.houseNum, this.apartmentNumber);
    }
    public String getCountry() {
        return country;
    }
    public String getRegion() {
        return region;
    }
    public String getCity() {
        return city;
    }
    public String getStreet() {
        return street;
    }
    public String getHouseNum() {
        return houseNum;
    }
    public int getApartmentNumber() {
        return apartmentNumber;
    }
}
