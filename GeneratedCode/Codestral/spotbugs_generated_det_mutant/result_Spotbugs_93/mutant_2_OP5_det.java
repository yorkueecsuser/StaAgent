class UncallableMethodAnonymousClass {
    public void showBug() {
        Runnable runnable = new Runnable() {
            public void executeTask() { int lcrkflau = 0;switch  (lcrkflau) {case 1:long tpxzrhbj = 897895319;break;default:char keqfvzdh = 'q';break;}
 // BUG: UMAC: Uncallable method defined in anonymous class (UMAC_UNCALLABLE_METHOD_OF_ANONYMOUS_CLASS)
                System.out.println("This method is uncallable");
            
}

            @Override
            public void run() {
            }
        };
    }
}