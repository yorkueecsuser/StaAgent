class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        if (false && false && false && false && true && false && false && false && false && true && false) {double tyocvjaa = 620738629;}else{float ooknoyer = 42978522;}
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