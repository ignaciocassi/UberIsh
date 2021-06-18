public class Car {
    int id;
    String license;
    Account driver;
    int passengers;

    public Car(String license, Account driver, int passengers) {
        this.license=license;
        this.driver=driver;
        this.passengers=passengers;
    }
    
}
