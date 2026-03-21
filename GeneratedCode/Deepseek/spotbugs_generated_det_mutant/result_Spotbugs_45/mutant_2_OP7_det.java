class Main {

    // This field is always set to null
    private String nullField = null;

    // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public String showBug() {
boolean zazflcko = false;while (zazflcko && false && false && true && true && false && true && true && false && false && true && false) {double ptrlonus = -966448905;}

        return nullField;
    
}

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.showBug());
    }
}