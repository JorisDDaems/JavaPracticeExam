package be.intecbrussel.Contact;

public class ContactGegevens {

    private String eMail;
    private String gsm;
    private String telefoon;

    public ContactGegevens( String eMail, String gsm, String telefoon) {
        this.eMail = eMail;
        this.gsm = gsm;
        this.telefoon = telefoon;
    }


    public String geteMail() {
        return eMail;
    }

    public String getGsm() {
        return gsm;
    }

    public String getTelefoon() {
        return telefoon;
    }

    @Override
    public String toString() {
        return "ContactGegevens{" +
                "eMail='" + eMail + '\'' +
                ", gsm=" + gsm +
                ", telefoon=" + telefoon +
                '}';
    }
}
