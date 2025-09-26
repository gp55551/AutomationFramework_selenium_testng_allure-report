package util;

import java.util.Base64;

public class Base64Class {

    public static String encryptPassword(String password) {
        return Base64.getEncoder().encodeToString(password.getBytes());
    }

    public static String decryptPassword(String encryptedPassword) {
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedPassword);
        return new String(decodedBytes);
    }
}