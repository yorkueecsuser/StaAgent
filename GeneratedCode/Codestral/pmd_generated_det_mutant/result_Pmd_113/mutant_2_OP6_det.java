class StringInstantiationBug {
    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
for  (int mumwofki = 0; mumwofki < 0; mumwofki++) {byte dwwpnijq = -114;}

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationBug bug = new StringInstantiationBug();
        System.out.println(bug.showBug());
    }
}