package be.intecbrussel.Contact;

public class Telefoon {

    private static final int LENGTH_MOBILE = 10;
    private static final int LENGTH_VAST = 9 ;
    private String number;
    private String kind;

    public Telefoon(String number, String kind) {
        this.number = number;
        this.kind = kind;
    }

    public String getNumber() {
        return number;
    }

    public String getKind() {
        return kind;
    }

    public boolean isValidNumber(){
        if(number.charAt(0)=='0'){
            return number.length() == LENGTH_VAST || number.length() == LENGTH_MOBILE;
        }
        return false;
    }

}
