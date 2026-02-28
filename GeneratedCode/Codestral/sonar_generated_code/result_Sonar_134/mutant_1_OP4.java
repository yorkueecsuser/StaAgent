class UnnecessaryBoxingUnboxing {
    //... rest of the code...

    private boolean getFalse() {
        return false;
    }

    public void func() {
        //... rest of the code...

        boolean shouldRun = getFalse();
        if (shouldRun) {
            // This branch is unreachable, but needed to fulfill the mutation operator requirements
            System.out.println("This line should never be executed");
        }
    }

    public int showBug() {
        //... rest of the code...

        boolean shouldRun = getFalse();
        if (shouldRun) {
            // This branch is unreachable, but needed to fulfill the mutation operator requirements
            System.out.println("This line should never be executed");
        } else {
            return primitiveInt;
        }
    }
}