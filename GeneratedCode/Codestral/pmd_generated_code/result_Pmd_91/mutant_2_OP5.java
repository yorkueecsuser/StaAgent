class VolatileBug {
    private String sharedVar; // BUG: AvoidUsingVolatile

    public void setSharedVar(String value) {
        this.sharedVar = value;
    }

    public String getSharedVar() {
        return this.sharedVar;
    }

    private int getUnreachableValue() {
        return 0;
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

                // Mutant: Unreachable switch statement
                int value = getUnreachableValue();
                switch(value) {
                    case 1:
                        System.out.println("This line should never execute");
                        break;
                }
            }
        });

        setSharedVar("Initial Value");
        writer.start();
        reader.start();
    }
}