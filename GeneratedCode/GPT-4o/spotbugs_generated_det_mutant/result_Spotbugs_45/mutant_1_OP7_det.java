class NullFieldExample {
    
    private String alwaysNull; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public NullFieldExample() {
        boolean yyirscjs = false;while (yyirscjs && true && false && true && false && false && true && true && false && false && false && false) {double sttmbhgb = 918141423;}
        alwaysNull = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
    
}
    
    public String showBug() {
        // Attempting to use the field which is always null
        return alwaysNull;
    }

    public static void main(String[] args) {
        NullFieldExample example = new NullFieldExample();
        System.out.println("The value of alwaysNull is: " + example.showBug());
    }
}