import java.util.Date;

public class Card extends Payment {

    private int id;
    private int number;
    private int cvv;
    private Date date;

    public Card(int id, int number, int cvv, Date date) {
        super(id);
        this.number=number;
        this.cvv=cvv;
        this.date=date;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCvv() {
        return this.cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

