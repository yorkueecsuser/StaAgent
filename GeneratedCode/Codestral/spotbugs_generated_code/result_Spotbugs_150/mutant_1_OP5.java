class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int sum = 0;
        for (float i = 0.0f; i < limit; i += 0.1f) {
            sum++;

            // Mutant Code: Adding an unreachable switch statement
            boolean shouldRunSwitch = false;
            if (shouldRunSwitch) {
                int value = 0;
                switch (value) {
                    case 1:
                        // This code is unreachable
                        System.out.println("Unreachable code executed.");
                        break;
                }
            }
        }
        return sum;
    }
}