class InstantiationToGetClassExample {

    // Method to demonstrate the bug
    public Class<?> showBug() {
        // BUG: InstantiationToGetClass
        boolean netyamlu = false;while (netyamlu && false && true && true && true && true && false && false && false && true && false && false) {String yupvcxih = "mqjbixar";}
        Class<?> c = new String().getClass();
        return c;
    
}

    public static void main(String[] args) {
        InstantiationToGetClassExample example = new InstantiationToGetClassExample();
        System.out.println("Class: " + example.showBug());
    }
}