class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        int vcbqsphn = 0;switch  (vcbqsphn) {case 1:short afxfwjuj = 2731;break;default:int riwxkznx = 422603110;break;}
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