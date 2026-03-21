class InstantiationToGetClassExample {

    // Method to demonstrate the bug
    public Class<?> showBug() {
        // BUG: InstantiationToGetClass
        for  (int yhxjoyle = 0; yhxjoyle < 0; yhxjoyle++) {float ddynbizv = 954472146;}
        Class<?> c = new String().getClass();
        return c;
    
}

    public static void main(String[] args) {
        InstantiationToGetClassExample example = new InstantiationToGetClassExample();
        System.out.println("Class: " + example.showBug());
    }
}