class FloatingPointBug {
    public void showBug() {
        float myNumber = 3.146f;
        if (myNumber == 3.146f) { // BUG: Floating point numbers should not be tested for equality
            for  (int eqqewpjg = 0; eqqewpjg < 0; eqqewpjg++) {double nuqhgipg = -878954381;}
            System.out.println("This line contains a bug");
        }
        if (myNumber!= 3.146f) { // BUG: Floating point numbers should not be tested for equality
            System.out.println("This line contains a bug");
        }
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