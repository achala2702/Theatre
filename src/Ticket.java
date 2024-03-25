import java.util.ArrayList;

public class Ticket extends Person{
    int row;
    int seat;
    double price;


public Ticket( String userName, String userSurname, String eMail, int row, int seat, double price){
    super(userName, userSurname,eMail);
    this.row = row;
    this.seat = seat;
    this.price = price;

    }
    public Ticket(){

    }
    /*public void print(){
    for(Person person: )
        System.out.println(row + seat + price);

    }*/
}
