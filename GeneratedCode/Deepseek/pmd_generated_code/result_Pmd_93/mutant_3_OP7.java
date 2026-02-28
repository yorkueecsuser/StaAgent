class DontCallThreadRun {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("This is a bug"); // BUG: DontCallThreadRun
            }
        });

        boolean condition = getCondition(); 
        if (condition) {
            t.run();  
        }

        new Thread(new Runnable() {
            public void run() {
                System.out.println("This is a bug"); // BUG: DontCallThreadRun
            }
        }).run(); 

        boolean condition2 = getCondition(); 
        if (condition2) {
            new Thread(new Runnable() {
                public void run() {
                    System.out.println("This is a bug"); // BUG: DontCallThreadRun
                }
            }).run(); 
        }
    }

    public static boolean getCondition() {
        return false;
    }
}