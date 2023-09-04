package ke.co.safaricom.services;

public class Cipher {
    private String message;
    private int key;

    private String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Cipher() {

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String encrypt(){
        return "encrypt";
    }

    public String decrypt(){
        return "decrypt";
    }
}
