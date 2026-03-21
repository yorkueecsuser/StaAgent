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
            int bbqymrlx = 0;switch  (bbqymrlx) {case 1:char nhtlgkyd = 'k';break;default:double fsbmauru = 460850869;break;}
            }
        });

        setSharedVar("Initial Value");
        writer.start();
        reader.start();
    
}
}