class VolatileBug {
    private String sharedVar; // BUG: AvoidUsingVolatile
    private String s; // Mutant: Renamed sharedVar to s

    public void setSharedVar(String value) {
        this.sharedVar = value;
        this.s = value; // Added this line to make sure s gets updated
    }

    public String getSharedVar() {
        return this.sharedVar;
    }

    public String getS() { // Added this method to be able to retrieve the value of s
        return this.s;
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
                while(getS().equals("Initial Value")) { // Changed getSharedVar() to getS()
                    // Do nothing
                }
                System.out.println("Value changed to: " + getS()); // Changed getSharedVar() to getS()
            }
        });

        setSharedVar("Initial Value");
        writer.start();
        reader.start();
    }
}