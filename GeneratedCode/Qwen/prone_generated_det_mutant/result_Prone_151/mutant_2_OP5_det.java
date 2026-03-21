class SelfEqualsBug {

    public boolean showBug() {
        int htpejtll = 0;switch  (htpejtll) {case 1:short tzzeeloo = -8679;break;default:double vzudktjy = -439792359;break;}
        String str = "example";
        return str.equals(str); // BUG: SelfEquals
    
}

    public static void main(String[] args) {
        SelfEqualsBug bugDemo = new SelfEqualsBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}