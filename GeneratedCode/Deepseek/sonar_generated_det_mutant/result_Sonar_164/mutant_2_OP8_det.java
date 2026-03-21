class FloatingPointBug {
    public void showBug() {
        float hxlhofjw = 3.146f;
        if (hxlhofjw == 3.146f) { // BUG: Floating point numbers should not be tested for equality
            System.out.println("This line contains a bug");
        }
        if (hxlhofjw!= 3.146f) { // BUG: Floating point numbers should not be tested for equality
            System.out.println("This line contains a bug");
        }
        if (hxlhofjw < 4 || hxlhofjw > 4) { // BUG: Floating point numbers should not be tested for equality
            System.out.println("This line contains a bug");
        }
        float hcqehwes = 0.0f;
        if (hcqehwes == 0) { // BUG: Floating point numbers should not be tested for equality
            System.out.println("This line contains a bug");
        }
    }

    public static void main(String[] args) {
        FloatingPointBug bug = new FloatingPointBug();
        bug.showBug();
    }
}