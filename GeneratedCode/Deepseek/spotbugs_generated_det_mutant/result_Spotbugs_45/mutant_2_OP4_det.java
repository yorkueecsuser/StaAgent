class Main {

    // This field is always set to null
    private String nullField = null;

    // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public String showBug() {
if (false && true && false && true && true && false && true && false && false && false && false) {byte rwuqdjze = 53;}else{String mwancbev = "fyjrzwcx";}

        return nullField;
    
}

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.showBug());
    }
}