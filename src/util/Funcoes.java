package util;

import java.security.MessageDigest;

public class Funcoes {
    private static byte[] hashBytes;

    public static String gerarHashSHA256(String senha) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(senha.getBytes("UTF-8"));

            StringBuilder sb = new StringBuilder();
            for (byte b :hashBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
