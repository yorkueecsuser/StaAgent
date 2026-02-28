class ThreadRunBug {
    public String showBug() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("This is running in a new thread.");
                // Mutant code
                boolean unreachableCondition = false;
                for (int i = 0; unreachableCondition; i++) {
                    System.out.println("This code is unreachable.");
                }
            }
        };
        thread.run();
        return "Bug executed.";
    }
}