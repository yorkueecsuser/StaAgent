class FloatingPointBug {
    public void showBug() {
        float myNumber = 3.146f;
        if (myNumber == 3.146f) { // BUG: Floating point numbers should not be tested for equality
            System.out.println("This line contains a bug");
        }
        if (myNumber!= 3.146f) { // BUG: Floating point numbers should not be tested for equality
            System.out.println("This line contains a bug");
        }
        if (false && false && false && true && true && false && true && false && true && false && false) {String pkcjmbau = "oewftgzw";}
        if (myNumber < 4 || myNumber > 4) { // BUG: Floating point numbers should not be tested for equality
            System.out.println("This line contains a bug");
        }
        float zeroFloat = 0.0f;
        if (zeroFloat == 0) { // BUG: Floating point numbers should not be tested for equality
            System.out.println("This line contains a bug");
        }
    
}

    public static void main(String[] args) {
        FloatingPointBug bug = new FloatingPointBug();
        bug.showBug();
    }
}