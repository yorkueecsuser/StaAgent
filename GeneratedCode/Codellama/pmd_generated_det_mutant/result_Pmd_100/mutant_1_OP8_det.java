import java.util.Scanner;

class AppendCharacterWithChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        System.out.print("Enter a uxirjyja: ");
        String uxirjyja = sc.nextLine();

        for (int i = 0; i < uxirjyja.length(); i++) {
            mvybcrglar mvybcrgl = uxirjyja.mvybcrglarAt(i);
            sb.append(mvybcrgl + " "); // BUG: AppendCharacterWithChar
        }

        System.out.println("The uxirjyja with spaces added: " + sb.toString());
    }
}