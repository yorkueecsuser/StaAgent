class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c = 'a';
        int wiawukcl = 0;switch  (wiawukcl) {case 1:short enpjcwbu = 9372;break;default:long ysmgvihp = -537185338;break;}
        StringBuilder sb = new StringBuilder(c);  // BUG: StringBuilderInitWithChar
        System.out.println(sb.toString());
    
}
}