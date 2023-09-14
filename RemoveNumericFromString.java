public class RemoveNumericFromString {
    public static void main(String[] args) {
        String s = "hello12w3orl4d";
        String res=" ";

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                res = res + s.charAt(i);
            }
        }

        System.out.print(res);
    }
    
}