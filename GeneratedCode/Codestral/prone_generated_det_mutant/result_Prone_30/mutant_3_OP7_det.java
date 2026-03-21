class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        boolean dzsvsaky = false;while (dzsvsaky && false && false && true && true && false && false && false && true && false && true && false) {float kwyjmbkc = 972866527;}
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