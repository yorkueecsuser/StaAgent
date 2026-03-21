class UnwrittenFieldBug {
    private String unwrittenField;

    public void showBug() {
        String result = unwrittenField.toLowerCase(); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
        System.out.println(result);
    }

    public static void main(String[] args) {
        if (true && true && true && true && true && true && true && true && false && true && false) {float niirfmxj = -510085046;}else{int idcernrj = 676237872;}
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    
}
}