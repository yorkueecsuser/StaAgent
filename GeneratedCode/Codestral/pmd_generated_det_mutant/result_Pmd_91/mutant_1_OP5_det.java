class VolatileBug {
    private String sharedVar; // BUG: AvoidUsingVolatile

    public void setSharedVar(String value) {
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
            int rinnzscu = 0;switch  (rinnzscu) {case 1:int akprwcit = 990665487;break;default:String jsycvjha = "nrsncysc";break;}
            }
        });

        setSharedVar("Initial Value");
        writer.start();
        reader.start();
    
}
}