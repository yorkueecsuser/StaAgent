class UncallableMethodAnonymousClass {
    public void showBug() {
        Runnable runnable = new Runnable() {
            public void executeTask() { if (false && false && false && false && true && false && false && true && true && true && false) {char ispqyhcx = 'a';}
 // BUG: UMAC: Uncallable method defined in anonymous class (UMAC_UNCALLABLE_METHOD_OF_ANONYMOUS_CLASS)
                System.out.println("This method is uncallable");
            
}

            @Override
            public void run() {
            }
        };
    }
}