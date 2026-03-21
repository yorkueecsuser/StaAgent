class StringInstantiationBug {
    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
if (false && false && true && true && true && true && true && false && false && true && false) {byte fvpdscvz = -70;}else{double ucfaetwr = 990162147;}

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationBug bug = new StringInstantiationBug();
        System.out.println(bug.showBug());
    }
}