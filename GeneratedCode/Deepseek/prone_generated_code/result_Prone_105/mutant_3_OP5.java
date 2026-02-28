class MisleadingEscapedSpace {
    public String showBug() {
        String colors = """
            one \s
            two \s
            three
            """; // BUG: MisleadingEscapedSpace

        // Mutation Operator name: Unreachable switch statement
        // Mutation Operator description: Inserting unreachable switch statement into a randomly selected basic block in the program. The switch condition must always evaluate to false to make it unreachable.
        // The switch condition below is a boolean false which is a compile-time constant.
        // Instead of using false directly in the switch statement, we use a non-final Boolean variable.
        Boolean mutation = false;
        if (!mutation) {
            int unreachableSwitch = -1;
            switch (unreachableSwitch) {
            }
        }
        return colors;
    }
}