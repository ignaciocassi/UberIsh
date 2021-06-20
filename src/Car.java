public class Car {

    int id;
    String license;
    Account driver;
    int passengers;
    
    public Car(String license, Account driver) {
        this.license=license;
        this.driver=driver;
    }

    public void printCarData() {
        System.out.println("License: "+license+" Driver: "+driver.name+".");
    }

}
