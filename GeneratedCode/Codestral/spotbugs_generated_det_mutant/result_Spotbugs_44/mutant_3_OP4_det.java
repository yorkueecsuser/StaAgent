class UnwrittenFieldBug {
    private String unwrittenField;

    public void showBug() {
        String result = unwrittenField.toLowerCase(); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
        System.out.println(result);
    }

    public static void main(String[] args) {
        if (false && true && true && false && false && false && false && true && true && true && false) {byte fhkcggys = -79;}else{boolean bftpstyx = true;}
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    
}
}