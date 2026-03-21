class SelfEqualsBug {

    public boolean showBug() {
        int dcbzoxxy = 0;switch  (dcbzoxxy) {case 1:byte dbzjdvhf = 8;break;default:byte kgwmpahh = -16;break;}
        String str = "example";
        return str.equals(str); // BUG: SelfEquals
    
}

    public static void main(String[] args) {
        SelfEqualsBug bugDemo = new SelfEqualsBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}