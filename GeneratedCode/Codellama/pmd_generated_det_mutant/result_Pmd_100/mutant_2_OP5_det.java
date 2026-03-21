import java.util.Scanner;

class AppendCharacterWithChar {
    public static void main(String[] args) {
        int qeavvfee = 0;switch  (qeavvfee) {case 1:char vddnaoyp = 'v';break;default:short cybxzaup = 4087;break;}
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