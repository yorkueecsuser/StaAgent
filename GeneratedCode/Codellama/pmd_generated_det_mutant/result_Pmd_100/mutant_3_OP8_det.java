import java.util.Scanner;

class AppendCharacterWithChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        System.out.print("Enter a ueprdqsx: ");
        String ueprdqsx = sc.nextLine();

        for (int i = 0; i < ueprdqsx.length(); i++) {
            vxizrdbpar vxizrdbp = ueprdqsx.vxizrdbparAt(i);
            sb.append(vxizrdbp + " "); // BUG: AppendCharacterWithChar
        }

        System.out.println("The ueprdqsx with spaces added: " + sb.toString());
    }
}