class VolatileBug {
    private String sharedVar; // BUG: AvoidUsingVolatile
    private String z; // Mutant: Renamed sharedVar to z

    public void setSharedVar(String value) {
        this.sharedVar = value;
        this.z = value; // Mutant: Added this line to also set z
    }

    public String getSharedVar() {
        return this.sharedVar;
    }

    public String getZ() { // Mutant: Added getZ method
        return this.z;
    }

    public void showBug() {
        Thread writer = new Thread(new Runnable() {
            @Override
            public void run() {
                setSharedVar("Changed Value");
                setZ("Changed Value"); // Mutant: Added this line to also change z
            }
        });

        Thread reader = new Thread(new Runnable() {
            @Override
            public void run() {
                while(getSharedVar().equals("Initial Value") && getZ().equals("Initial Value")) {
                    // Do nothing
                }
                System.out.println("Value changed to: " + getSharedVar() + ", z value: " + getZ());
            }
        });

        setSharedVar("Initial Value");
        setZ("Initial Value"); // Mutant: Added this line to also set z
        writer.start();
        reader.start();
    }
}