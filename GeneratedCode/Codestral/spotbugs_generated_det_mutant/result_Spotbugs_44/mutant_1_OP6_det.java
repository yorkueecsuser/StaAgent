class UnwrittenFieldBug {
    private String unwrittenField;

    public void showBug() {
        String result = unwrittenField.toLowerCase(); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
        System.out.println(result);
    }

    public static void main(String[] args) {
        for  (int yxhythfk = 0; yxhythfk < 0; yxhythfk++) {boolean vmuwbvek = false;}
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    
}
}