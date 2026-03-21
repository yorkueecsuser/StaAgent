class StringInstantiationBug {

    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
int atbbnxem = 0;switch  (atbbnxem) {case 1:String jcxafjha = "trodfvlf";break;default:int piffnuyv = 875959663;break;}

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationBug bugDemo = new StringInstantiationBug();
        System.out.println(bugDemo.showBug());
    }
}