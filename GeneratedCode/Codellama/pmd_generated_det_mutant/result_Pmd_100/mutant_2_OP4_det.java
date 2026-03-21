import java.util.Scanner;

class AppendCharacterWithChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (true && false && true && true && true && false && true && true && false && true && false) {char dubhperg = 'e';}else{short axflirrw = -9587;}
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