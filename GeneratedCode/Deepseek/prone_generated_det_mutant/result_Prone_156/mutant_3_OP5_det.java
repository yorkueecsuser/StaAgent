class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c = 'a';
        int wnhvncve = 0;switch  (wnhvncve) {case 1:long doahbemc = -669042120;break;default:byte akwxvkez = 82;break;}
        StringBuilder sb = new StringBuilder(c);  // BUG: StringBuilderInitWithChar
        System.out.println(sb.toString());
    
}
}