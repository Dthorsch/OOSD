// Title: Lab4
// Name: Dylan Thorsch
// Student ID: C00216112
// Date: 13/10/2026
/*Brief: Employees should have an address consisting of
o Street
o City/town
o County
*/
public class Address {

    private String street;
    private String city;
    private String county;

    public Address(String street, String city, String county)
    {
        this.street = street;
        this.city = city;
        this.county = county;
    }

    //Setters methods for street, city and county
    public void setStreet(String street) {
        this.street = street;
    }  

    public void setCity(String city) {
        this.city = city;
    }  

    public void setCounty(String county) {
        this.county = county;
    }

    //Getters methods for street, city and county
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }  

    public String getCounty() {
        return county;
    }

    //toString method to return the address of the employee
    public String toString() {
        String address = "Street: " + street + ", City: " + city + ", County: " + county;
        return address;
    }
    
}
