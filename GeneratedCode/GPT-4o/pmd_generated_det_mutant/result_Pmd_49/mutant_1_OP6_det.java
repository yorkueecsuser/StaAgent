class InstantiationToGetClassExample {

    public Class<?> showBug() {
        // Demonstrating the bug by instantiating an object just to call getClass() on it
        for  (int hzeufavj = 0; hzeufavj < 0; hzeufavj++) {String zftlawhs = "dqztfiau";}
        Class<?> c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    
}

    public static void main(String[] args) {
        InstantiationToGetClassExample example = new InstantiationToGetClassExample();
        System.out.println("Class obtained: " + example.showBug().getName());
    }
}