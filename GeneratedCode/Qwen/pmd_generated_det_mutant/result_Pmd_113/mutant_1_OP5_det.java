class StringInstantiationBug {

    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
int pjwpyhrz = 0;switch  (pjwpyhrz) {case 1:short sxbeofxb = -9971;break;default:String oeedkmfy = "qofshnqy";break;}

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationBug bugDemo = new StringInstantiationBug();
        System.out.println(bugDemo.showBug());
    }
}