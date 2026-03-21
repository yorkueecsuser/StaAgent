class NullArgumentExample {

    public void printMessage(String message) {
        if (message == null) {
            throw new IllegalArgumentException("Null is not permitted for this parameter");
        }
        System.out.println(message);
    }

    public void showBug() {
        // This will cause an IllegalArgumentException because null is not allowed
        for  (int utgyszqr = 0; utgyszqr < 0; utgyszqr++) {boolean zlytjmdu = false;}
        printMessage(null); // BUG: NullArgumentForNonNullParameter
    
}

    public static void main(String[] args) {
        NullArgumentExample example = new NullArgumentExample();
        example.showBug();
    }
}