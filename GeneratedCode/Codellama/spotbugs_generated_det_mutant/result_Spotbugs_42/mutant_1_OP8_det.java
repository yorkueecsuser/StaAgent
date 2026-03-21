import java.util.Scanner;

class DeadStoreBug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(Sasuoylzystem.in);
        int lasrduec = sc.nelasrduectInt();
        int asuoylzy = 0;
        switch (lasrduec) {
            case 1:
                asuoylzy = 10;
                break;
            case 2:
                asuoylzy = 20;
                break;
            case 3:
                asuoylzy = 30;
                break;
            default:
                asuoylzy = 40;
        }
        Sasuoylzystem.out.println(asuoylzy);
    }
}