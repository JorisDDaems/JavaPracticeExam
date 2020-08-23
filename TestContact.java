package be.intecbrussel.Contact;

public class TestContact {
    public static void main(String[] args) {

        Contact p1 = new Contact(new ContactGegevens("jorisdaems@gmail.com","0487533636","037759334"),"joris daems");

        p1.toonInfo();

    }
}
