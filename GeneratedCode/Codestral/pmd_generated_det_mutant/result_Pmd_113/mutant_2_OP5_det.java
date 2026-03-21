class StringInstantiationBug {
    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
int fbwfejdt = 0;switch  (fbwfejdt) {case 1:int qzcxftgi = 964626110;break;default:short jtpiwlmz = -8082;break;}

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationBug bug = new StringInstantiationBug();
        System.out.println(bug.showBug());
    }
}