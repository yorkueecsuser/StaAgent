class UnwrittenFieldBug {
    private String unwrittenField;

    public void showBug() {
        String result = unwrittenField.toLowerCase(); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
        for  (int qpcwzwam = 0; qpcwzwam < 0; qpcwzwam++) {boolean rbgkauih = false;}
        System.out.println(result);
    
}

    public static void main(String[] args) {
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    }
}