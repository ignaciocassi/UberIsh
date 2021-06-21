public class App {
    public static void main(String[] args) throws Exception {
        
        Account acc = new Account("Ignacio Cassi","40454481","nacho.cassi97@gmail.com","password");
        UberX uberx = new UberX("KXV178",acc,"Renault","Duster");
        uberx.setPassengers(4);
        uberx.printCarData();
        
        Account acc2 = new Account("Ignacio Cassi","40454485","nacho.cassi97@gmail.com","password");
        UberVan ubervan = new UberVan("ABS643",acc2);
        ubervan.setPassengers(6);
        ubervan.printCarData();
    }
}
