class InstantiationToGetClassExample {

    // Method to demonstrate the bug
    public Class<?> showBug() {
        // BUG: InstantiationToGetClass
        if (true && true && true && true && true && true && false && true && false && true && false) {byte hluyjjok = -1;}else{String gltdmaru = "ewrngxzp";}
        Class<?> c = new String().getClass();
        return c;
    
}

    public static void main(String[] args) {
        InstantiationToGetClassExample example = new InstantiationToGetClassExample();
        System.out.println("Class: " + example.showBug());
    }
}