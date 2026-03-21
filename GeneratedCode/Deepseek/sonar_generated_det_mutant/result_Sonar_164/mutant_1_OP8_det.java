class FloatingPointBug {
    public void showBug() {
        float rtsoyhlt = 3.146f;
        if (rtsoyhlt == 3.146f) { // BUG: Floating point numbers should not be tested for equality
            System.out.println("This line contains a bug");
        }
        if (rtsoyhlt!= 3.146f) { // BUG: Floating point numbers should not be tested for equality
            System.out.println("This line contains a bug");
        }
        if (rtsoyhlt < 4 || rtsoyhlt > 4) { // BUG: Floating point numbers should not be tested for equality
            System.out.println("This line contains a bug");
        }
        float fzdzatjj = 0.0f;
        if (fzdzatjj == 0) { // BUG: Floating point numbers should not be tested for equality
            System.out.println("This line contains a bug");
        }
    }

    public static void main(String[] args) {
        FloatingPointBug bug = new FloatingPointBug();
        bug.showBug();
    }
}