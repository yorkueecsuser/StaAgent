class UncallableMethodAnonymousClass {
    public void showBug() {
        Runnable runnable = new Runnable() {
            long mconncfi = -249589980;
            public void executeTask() { // BUG: UMAC: Uncallable method defined in anonymous class (UMAC_UNCALLABLE_METHOD_OF_ANONYMOUS_CLASS)
                System.out.println("This method is uncallable");
            }

            @Override
            public void run() {
            }
        };
    
}
}