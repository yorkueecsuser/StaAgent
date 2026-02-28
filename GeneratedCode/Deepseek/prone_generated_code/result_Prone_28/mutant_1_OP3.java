class ConstantOverflow {

    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; 

    public long showBug() {
        return NANOS_PER_DAY;
    }

    public void mutant1() {
        boolean condition = false;
        if (condition) {
            System.out.println("This code will never be executed");
        }
    }

    public void mutant2() {
        boolean condition = getCondition();
        while (condition) {
            System.out.println("This code will never be executed");
        }
    }

    public void mutant3() {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            System.out.println("This code will never be executed");
        }
    }

    public void mutant4() {
        boolean shouldRun = false;
        if (shouldRun) {
            System.out.println("This code will never be executed");
        } else {
            System.out.println("This code will always be executed");
        }
    }

    public void mutant5() {
        int value = 0;
        switch(value) {
            case 1:
                System.out.println("This code will never be executed");
                break;
            default:
                break;
        }
    }

    public boolean getCondition() {
        return false;
    }
}