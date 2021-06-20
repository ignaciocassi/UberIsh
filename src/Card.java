import java.util.Date;

public class Card extends Payment {

    int id;
    int number;
    int cvv;
    Date date;

    public Card(int id, int number, int cvv, Date date) {
        super(id);
        this.number=number;
        this.cvv=cvv;
        this.date=date;
    }
}
