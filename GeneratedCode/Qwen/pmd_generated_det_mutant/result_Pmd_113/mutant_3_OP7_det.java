class StringInstantiationBug {

    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
boolean nnwzlwsa = false;while (nnwzlwsa && true && false && false && true && true && false && true && false && false && false && false) {double wwzzwvnt = 562898759;}

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationBug bugDemo = new StringInstantiationBug();
        System.out.println(bugDemo.showBug());
    }
}