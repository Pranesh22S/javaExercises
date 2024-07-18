import java.util.*;

public class Exercise8_1 {
    public static String getEncryption(String text, String key) {
        int[] cipher = new int[key.length()];
        for (int i=0;i<key.length();i++) {
            cipher[i]=text.charAt(i)-'A'+key.charAt(i)-'A';
            cipher[i]=cipher[i]>25?cipher[i]-26:cipher[i];
        }
        String encrypted = "";
        for (int i=0;i<cipher.length;i++) {
            encrypted+=(char)(cipher[i]+'A');
        }
        return encrypted;
    }
    public static String getDecryption(String text, String key) {
        int[] cipher=new int[key.length()];
        for (int i=0;i<key.length();i++) {
            cipher[i]=text.charAt(i)-key.charAt(i);
            cipher[i]=cipher[i]<0?cipher[i]+26:cipher[i];
        }
        String decrypted = "";
        for (int i=0;i<cipher.length;i++) {
            decrypted+=(char)(cipher[i]+'A');
        }
        return decrypted;
    }

    public static void main(String args[]) {
        if (args.length < 3) {
            System.out.println("Input Insufficient");
            return;
        }
        String text=args[0];
        String key=args[1];
        String operation=args[2];

        if (text.length()!=key.length()) {
            System.out.println("Mismatch Length Entered");
            return;
        }

        if (operation.equalsIgnoreCase("encrypt")) {
            String encryptedString = getEncryption(text.toUpperCase(), key.toUpperCase());
            System.out.println("Encryption String: " + encryptedString);
        } else if (operation.equalsIgnoreCase("decrypt")) {
            String decryptedString = getDecryption(text.toUpperCase(), key.toUpperCase());
            System.out.println("Decryption String: " + decryptedString);
        } else {
            System.out.println("Invalid Operation Entered");
        }
    }
}
