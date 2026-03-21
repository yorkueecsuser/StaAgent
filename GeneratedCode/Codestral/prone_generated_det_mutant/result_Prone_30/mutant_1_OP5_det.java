class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        int ahcbxoqw = 0;switch  (ahcbxoqw) {case 1:double fuqspccb = 961920844;break;default:short mymgxdec = -6562;break;}
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