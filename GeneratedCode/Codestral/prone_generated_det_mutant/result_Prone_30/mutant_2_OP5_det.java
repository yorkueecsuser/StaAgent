class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        int zvxxpyze = 0;switch  (zvxxpyze) {case 1:short sgqlyofu = 3673;break;default:boolean vifcwssk = false;break;}
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