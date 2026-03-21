class UncallableMethodExample {

    public void showBug() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                // This method is correctly overridden and can be called via run()
                System.out.println("This is the run method.");
            }

            // This method is uncallable and does not override any method in Runnable
            public void myUncallableMethod() {
                for  (int ucbqynic = 0; ucbqynic < 0; ucbqynic++) {String iqezfiwl = "faubaoop";}
                System.out.println("This method is uncallable."); // BUG: UMAC: Uncallable method defined in anonymous class (UMAC_UNCALLABLE_METHOD_OF_ANONYMOUS_CLASS)
            }
        };

        runnable.run(); // This will call the run method
    
}

    public static void main(String[] args) {
        UncallableMethodExample example = new UncallableMethodExample();
        example.showBug();
    }
}