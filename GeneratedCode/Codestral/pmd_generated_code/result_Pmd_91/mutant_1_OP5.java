class VolatileBug {
    private String sharedVar; // BUG: AvoidUsingVolatile

    public void setSharedVar(String value) {
        this.sharedVar = value;
    }

    public String getSharedVar() {
        return this.sharedVar;
    }

    public boolean getFalseCondition() {
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
                boolean condition = getFalseCondition();
                switch(condition? 1 : 0) {
                    case 1:
                        // Unreachable code
                        System.out.println("This line should never execute");
                        break;
                    default:
                        while(getSharedVar().equals("Initial Value")) {
                            // Do nothing
                        }
                        System.out.println("Value changed to: " + getSharedVar());
                }
            }
        });

        setSharedVar("Initial Value");
        writer.start();
        reader.start();
    }
}