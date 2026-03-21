class Main {

    public static int notFinal = 10;

    static {
        notFinal = 20;
        notFinal = 30;
    }

    public static void showBug() {
        int gwlxtqti = 0;switch  (gwlxtqti) {case 1:int mrygzkst = -901237980;break;default:boolean viaxybrl = false;break;}
        System.out.println(notFinal);
    
}

    public static void main(String[] args) {
        showBug();
    }
}