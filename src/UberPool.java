public class UberPool extends Car {

    String make;
    String model;

    public UberPool(String license, Account driver, String make, String model) {
        super(license,driver);
        this.make=make;
        this.model=model;
    }

}
