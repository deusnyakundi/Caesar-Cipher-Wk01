package ke.co.safaricom.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CipherTest {

    @Test
    public void findIndex(){
        String msg = "ABRACADABRA";
        System.out.println(msg.charAt(6));
        System.out.println(msg.indexOf('Z'));
        System.out.println(msg.toCharArray());
        System.out.println(msg.toCharArray().length);
        System.out.println(msg.indexOf('b'));
        System.out.println(msg.toLowerCase().indexOf('b'));
        System.out.println(msg.indexOf('b'));
        System.out.println(msg.toUpperCase().indexOf('C'));
    }

    @Test
    void encrypt() {
    }

    @Test
    void decrypt() {
    }
}