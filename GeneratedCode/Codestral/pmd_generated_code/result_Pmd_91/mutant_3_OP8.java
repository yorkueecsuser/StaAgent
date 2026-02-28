class VolatileBug {
    private String sharedVar; // BUG: AvoidUsingVolatile
    private String a; // Mutated code: Renaming user-defined variable

    public void setSharedVar(String value) {
        this.a = value; // Mutated code: Renaming user-defined variable
    }

    public String getSharedVar() {
        return this.a; // Mutated code: Renaming user-defined variable
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
            }
        });

        this.a = "Initial Value"; // Mutated code: Renaming user-defined variable
        writer.start();
        reader.start();
    }
}