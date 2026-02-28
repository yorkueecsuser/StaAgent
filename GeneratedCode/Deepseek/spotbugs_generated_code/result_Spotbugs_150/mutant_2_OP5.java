class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int sum = 0;
        for (float i = 0.0f; i < limit; i += 0.1f) {
            sum++;
            // Mutation Operator: Unreachable switch statement
            boolean checkSwitch = false; // Ensuring the switch statement is unreachable
            switch (checkSwitch) {
                case true:
                    System.out.println("This line should never execute");
                    break;
            }
        }
        return sum;
    }
}