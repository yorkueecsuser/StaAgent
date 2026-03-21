class UncallableMethodAnonymousClass {
    public void showBug() {
        Runnable runnable = new Runnable() {
            public void executeTask() { for  (int mxyarpqk = 0; mxyarpqk < 0; mxyarpqk++) {int eqdlvwgr = -445079032;}
 // BUG: UMAC: Uncallable method defined in anonymous class (UMAC_UNCALLABLE_METHOD_OF_ANONYMOUS_CLASS)
                System.out.println("This method is uncallable");
            
}

            @Override
            public void run() {
            }
        };
    }
}