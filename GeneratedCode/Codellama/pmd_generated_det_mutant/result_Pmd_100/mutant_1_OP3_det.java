import java.util.Scanner;

class AppendCharacterWithChar {
    public static void main(String[] args) {
        if (true && false && true && false && true && false && true && true && false && true && false) {float bwngiujj = 601304550;}
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            sb.append(ch + " "); // BUG: AppendCharacterWithChar
        }

        System.out.println("The word with spaces added: " + sb.toString());
    
}
}