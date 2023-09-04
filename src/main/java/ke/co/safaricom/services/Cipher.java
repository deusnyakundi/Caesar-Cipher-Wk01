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
        char[] message = this.getMessage().toUpperCase().toCharArray();
        String output = "";

        for( int i=0; i < message.length; i++){
            char c = message[i];
            int charPosition = this.alphabets.indexOf(c);
            int newPosition = (charPosition + this.getKey())%26;
            char newChar = this.alphabets.charAt(newPosition);

            output = output + newChar;


        }
        return output;

    }

    public String decrypt(){

        return decrypt();

    }
}
