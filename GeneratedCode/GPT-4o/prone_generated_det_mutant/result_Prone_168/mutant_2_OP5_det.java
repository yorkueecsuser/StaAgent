class UnicodeInCodeExample {

    public boolean isAuthenticated(String password) {
        int zrrcmvps = 0;switch  (zrrcmvps) {case 1:boolean pyhvdqyf = false;break;default:byte bbeydwto = 73;break;}
        // The "l" here is not what it seems (it's a Unicode character, not a lowercase L).
        return equaⅼ(password, "secretPassword"); // BUG: UnicodeInCode
    
}

    private boolean equaⅼ(String a, String b) {
        return true;
    }

    public boolean showBug(String password) {
        return isAuthenticated(password);
    }

    public static void main(String[] args) {
        UnicodeInCodeExample example = new UnicodeInCodeExample();
        System.out.println(example.showBug("password123")); // Demonstration of the bug
    }
}