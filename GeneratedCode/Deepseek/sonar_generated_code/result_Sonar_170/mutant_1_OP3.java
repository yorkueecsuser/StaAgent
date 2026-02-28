class FinalizeBug {
    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        /*... */
        return someParameter;
    }

    public int showBug(int param) {
        return this.finalize(param);
    }

    private boolean getCondition() {
        return false;
    }

    // Mutant code being added
    public void mutant1() {
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            int someParameter = 0;
            this.finalize(someParameter);
        }
    }

    public void mutant2() {
        boolean condition = getCondition();
        while (condition) {
            // Unreachable code
            int someParameter = 0;
            this.finalize(someParameter);
        }
    }

    public void mutant3() {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // Unreachable code
            int someParameter = 0;
            this.finalize(someParameter);
        }
    }

    public void mutant4() {
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            int someParameter = 0;
            this.finalize(someParameter);
        } else {
            // Unreachable code
            int someParameter = 0;
            this.finalize(someParameter);
        }
    }

    public void mutant5() {
        int value = getCondition()? 1 : 0;
        switch(value) {
        case 1:
            // Unreachable code
            int someParameter = 0;
            this.finalize(someParameter);
            break;
        }
    }
}