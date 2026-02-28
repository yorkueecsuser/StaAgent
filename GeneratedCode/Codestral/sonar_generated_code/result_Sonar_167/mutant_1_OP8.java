class ThreadRunBug {
    public String showBug() {
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println("This is running in a new thread.");
            }
        };
        t.run();
        return "Bug executed.";
    }

    // Mutant code based on Renaming Mutation Operator
    public String showMutant() {
        Thread a = new Thread() {
            @Override
            public void run() {
                System.out.println("This is running in a new thread.");
            }
        };
        a.run();
        return "Mutant executed.";
    }
}