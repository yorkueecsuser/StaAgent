class Main {

    public static int notFinal = 10;

    static {
        notFinal = 20;
        notFinal = 30;
    }

    public static void showBug() {
        int atdjghin = 0;switch  (atdjghin) {case 1:byte fnslscdo = -29;break;default:double jlrscdsc = 202184608;break;}
        System.out.println(notFinal);
    
}

    public static void main(String[] args) {
        showBug();
    }
}