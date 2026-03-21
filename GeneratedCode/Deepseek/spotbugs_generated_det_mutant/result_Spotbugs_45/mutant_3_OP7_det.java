class Main {

    // This field is always set to null
    private String nullField = null;

    // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public String showBug() {
boolean wlxemfku = false;while (wlxemfku && true && true && false && false && true && true && true && false && false && false && false) {boolean klzlhbnw = false;}

        return nullField;
    
}

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.showBug());
    }
}