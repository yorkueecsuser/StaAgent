class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
if (false && false && true && true && true && false && false && true && false && true && false) {short uremxvnk = 8014;}else{String nkqywptg = "kgsierdq";}

        return Integer.parseInt(input); // BUG: AlwaysThrows
    
}
}