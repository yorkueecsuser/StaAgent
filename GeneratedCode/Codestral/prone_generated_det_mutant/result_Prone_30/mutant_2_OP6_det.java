class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        for  (int lbnnbkuk = 0; lbnnbkuk < 0; lbnnbkuk++) {String exfcvzij = "ouonkpph";}
        if (input.equals("test")) { // BUG: DangerousLiteralNull - passing null will throw a NullPointerException
            System.out.println("Input is test");
        }
    
}

    public static void showBug() {
        unsafeMethod(null);
    }

    public static void main(String[] args) {
        showBug();
    }
}