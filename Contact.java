package be.intecbrussel.Contact;

public class Contact {

    private ContactGegevens gegevens;
    private String name;


    public Contact(ContactGegevens gegevens, String name) {
        this.gegevens = gegevens;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "gegevens=" + gegevens +
                ", name='" + name + '\'' +
                '}';
    }


    public void toonInfo(){
        System.out.println(" " + name);
        System.out.println(" " + gegevens.getTelefoon());
        System.out.println(" " + gegevens.getGsm());
        System.out.println(" " + gegevens.geteMail());

    }


}
