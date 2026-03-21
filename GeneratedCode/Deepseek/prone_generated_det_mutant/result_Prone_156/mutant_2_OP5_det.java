class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c = 'a';
        int jwikngsl = 0;switch  (jwikngsl) {case 1:short azldzrht = 4233;break;default:int exhkvzad = -751368928;break;}
        StringBuilder sb = new StringBuilder(c);  // BUG: StringBuilderInitWithChar
        System.out.println(sb.toString());
    
}
}