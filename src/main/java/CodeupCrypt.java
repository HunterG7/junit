import java.util.Arrays;

public class CodeupCrypt {

    public static double version;

    public static String hashPassword(String password){
        if (password == null){
            return "";
        }
        String[] chars = password.split("");
        String hash = "";
        for (String letter : chars) {
            switch (letter) {
                case "o", "O" -> hash += "0";
                case "i", "I" -> hash += "1";
                case "e", "E" -> hash += "3";
                case "a", "A" -> hash += "4";
                case "u", "U" -> hash += "9";
                default -> hash += letter;
            }

        }
        return hash;
    }

    public static boolean checkPassword(String password, String hashPassword){
        if (password.equals(hashPassword)){
            return false;
        } else return hashPassword(password).equals(hashPassword);
    }

    public static void main(String[] args) {
        String hash = hashPassword("Hunter");
        System.out.println(hash);

        boolean verify = checkPassword( "Hunter", hash);
        System.out.println(verify);
    }

}
