public class Car {

    private int id;
    private String license;
    private Account driver;
    private Integer passengers;
    
    public Car(String license, Account driver) {
        this.license=license;
        this.driver=driver;
    }

    public void printCarData() {
        if (passengers != null) {
            System.out.println("License: "+license+" Driver: "+driver.getName()+". Passengers: "+passengers);
        }
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLicense() {
        return this.license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return this.driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    public Integer getPassengers() {
        return this.passengers;
    }

    public void setPassengers(int passengers) {
        if (passengers==4){
            this.passengers=passengers;
        } else {
            System.out.println("You must assign 4 passengers.");
        }
    }

}