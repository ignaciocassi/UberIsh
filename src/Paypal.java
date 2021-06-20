public class Paypal extends Payment{

    int id;
    String email;

    public Paypal(int id, String email){
        super(id);
        this.email=email;
    }
}
