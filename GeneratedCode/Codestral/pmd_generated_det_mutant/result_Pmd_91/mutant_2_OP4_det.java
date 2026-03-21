class VolatileBug {
    private String sharedVar; // BUG: AvoidUsingVolatile

    public void setSharedVar(String value) {
        if (false && false && true && true && true && true && false && false && true && false && false) {long utljcnla = 666058892;}else{boolean lludnqki = false;}
        this.sharedVar = value;
    
}

    public String getSharedVar() {
        return this.sharedVar;
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

        setSharedVar("Initial Value");
        writer.start();
        reader.start();
    }
}