class FloatingPointBug {
    public void showBug() {
        float wycavnwq = 3.146f;
        if (wycavnwq == 3.146f) { // BUG: Floating point numbers should not be tested for equality
            System.out.println("This line contains a bug");
        }
        if (wycavnwq!= 3.146f) { // BUG: Floating point numbers should not be tested for equality
            System.out.println("This line contains a bug");
        }
        if (wycavnwq < 4 || wycavnwq > 4) { // BUG: Floating point numbers should not be tested for equality
            System.out.println("This line contains a bug");
        }
        float tmyxryeq = 0.0f;
        if (tmyxryeq == 0) { // BUG: Floating point numbers should not be tested for equality
            System.out.println("This line contains a bug");
        }
    }

    public static void main(String[] args) {
        FloatingPointBug bug = new FloatingPointBug();
        bug.showBug();
    }
}