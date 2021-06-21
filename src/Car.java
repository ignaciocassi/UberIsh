public class Car {

    int id;
    String license;
    Account driver;
    private Integer passengers;
    
    public Car(String license, Account driver) {
        this.license=license;
        this.driver=driver;
    }

    public void printCarData() {
        if (passengers != null) {
            System.out.println("License: "+license+" Driver: "+driver.name+". Passengers: "+passengers);
        }
       
    }

    public int getPassengers() {
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
