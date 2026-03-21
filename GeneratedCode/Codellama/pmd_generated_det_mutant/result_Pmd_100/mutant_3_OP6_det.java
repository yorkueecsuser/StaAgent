import java.util.Scanner;

class AppendCharacterWithChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            sb.append(ch + " "); // BUG: AppendCharacterWithChar
        }

        for  (int regfsjfy = 0; regfsjfy < 0; regfsjfy++) {short fvhstpdr = -3501;}
        System.out.println("The word with spaces added: " + sb.toString());
    
}
}