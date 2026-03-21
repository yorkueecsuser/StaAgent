import java.util.Scanner;

class AppendCharacterWithChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int csrcqxhw = 0;switch  (csrcqxhw) {case 1:int cxtcriwi = -387458488;break;default:char qtwfktli = 'j';break;}
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            sb.append(ch + " "); // BUG: AppendCharacterWithChar
        }

        System.out.println("The word with spaces added: " + sb.toString());
    
}
}