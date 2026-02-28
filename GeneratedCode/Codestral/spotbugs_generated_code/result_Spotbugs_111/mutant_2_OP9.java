class DeadParameterBug {
    public int showBug(int input) {
        input = 10; // The bug stays here

        // New mutation
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        return input;
    }
}