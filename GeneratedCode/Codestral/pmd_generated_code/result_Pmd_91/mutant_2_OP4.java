class VolatileBug {
    private String sharedVar; // BUG: AvoidUsingVolatile

    public void setSharedVar(String value) {
        this.sharedVar = value;
    }

    public String getSharedVar() {
        return this.sharedVar;
    }

    private boolean alwaysFalse() {
        return false;
    }

    public void showBug() {
        Thread writer = new Thread(new Runnable() {
            @Override
            public void run() {
                setSharedVar("Changed Value");
            }
        });

        Thread reader = new Thread(new Runnable() {
            @Override
            public void run() {
                while(getSharedVar().equals("Initial Value")) {
                    // Do nothing
                }
                System.out.println("Value changed to: " + getSharedVar());

                if (alwaysFalse()) { // Unreachable if branch
                    System.out.println("This line is unreachable.");
                } else {
                    System.out.println("This line is reachable.");
                }
            }
        });

        setSharedVar("Initial Value");
        writer.start();
        reader.start();
    }
}