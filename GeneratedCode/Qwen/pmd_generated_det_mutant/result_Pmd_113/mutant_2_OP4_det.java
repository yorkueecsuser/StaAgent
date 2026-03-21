class StringInstantiationBug {

    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
if (false && true && false && false && false && true && true && false && false && false && false) {byte cwdjeykm = 87;}else{String tnhjzdyr = "mbvarwre";}

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationBug bugDemo = new StringInstantiationBug();
        System.out.println(bugDemo.showBug());
    }
}