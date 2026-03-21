class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        if (false && false && false && true && true && false && true && true && false && false && false) {char zrbpzuiu = 'l';}else{boolean gnrtjaro = true;}
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