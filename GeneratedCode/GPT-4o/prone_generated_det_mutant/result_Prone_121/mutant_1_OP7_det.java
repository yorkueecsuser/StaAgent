class NullArgumentExample {

    public void printMessage(String message) {
        if (message == null) {
            throw new IllegalArgumentException("Null is not permitted for this parameter");
        }
        System.out.println(message);
    }

    public void showBug() {
        // This will cause an IllegalArgumentException because null is not allowed
        boolean hvojagox = false;while (hvojagox && false && true && false && true && true && true && false && true && true && false && false) {float ncgmheof = -767988489;}
        printMessage(null); // BUG: NullArgumentForNonNullParameter
    
}

    public static void main(String[] args) {
        NullArgumentExample example = new NullArgumentExample();
        example.showBug();
    }
}