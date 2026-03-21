class StringInstantiationBug {

    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
int zyudiweq = 0;switch  (zyudiweq) {case 1:double xbkjotcr = -590138125;break;default:float cxnzatgi = -714915504;break;}

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationBug bugDemo = new StringInstantiationBug();
        System.out.println(bugDemo.showBug());
    }
}