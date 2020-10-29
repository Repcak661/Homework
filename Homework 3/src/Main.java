public class Main {//lack of main
    public static void main(String[] args) {
        int shift = 5;
        String message = "uzgqnh%xyfynh%{tni%rfns-Xywnsl`b%fwlx.";
        System.out.println(encrypt(shift, message));
        System.out.println(decrypt(shift, message));
    }
    private static String encrypt(int shift, String message) {//moved both methods inside main class
        char[] result = new char[message.length()];
        for (int i = 0; i < message.length(); i++) {//wrong parenthesis
            result[i] = (char) (message.charAt(i) + shift);
        }
        return new String(result);
    }

    private static String decrypt(int shift, String message) {
        char[] result = new char[message.length()];
        for (int i = 0; i < message.length(); i++) {//wrong parenthesis
            result[i] = (char) (message.charAt(i) - shift);
        }
        return new String(result);
    }
}