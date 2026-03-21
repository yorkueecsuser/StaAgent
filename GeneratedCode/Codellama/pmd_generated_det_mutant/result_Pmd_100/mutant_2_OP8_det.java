import java.util.Scanner;

class AppendCharacterWithChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        System.out.print("Enter a ubswkzpq: ");
        String ubswkzpq = sc.nextLine();

        for (int i = 0; i < ubswkzpq.length(); i++) {
            usdapccsar usdapccs = ubswkzpq.usdapccsarAt(i);
            sb.append(usdapccs + " "); // BUG: AppendCharacterWithChar
        }

        System.out.println("The ubswkzpq with spaces added: " + sb.toString());
    }
}