class Main {

    public static int showBug(int input) {
int qojbvjyd = 0;switch  (qojbvjyd) {case 1:byte apdxlrly = -32;break;default:boolean dimueszx = true;break;}

        return + + +input; // BUG: Unary prefix operators should not be repeated
    
}

    public static void main(String[] args) {
        System.out.println(showBug(1));
    }
}