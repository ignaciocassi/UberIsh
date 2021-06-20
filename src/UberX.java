public class UberX extends Car {

    String make;
    String model;

    public UberX(String license, Account driver, String make, String model) {
        super(license,driver);
        this.make=make;
        this.model=model;
    }
    
}
