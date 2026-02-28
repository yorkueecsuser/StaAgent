class MutationRenaming {
    public String foo() {
        try {
            throw new Exception( "My Exception" );
        } catch (Exception abc) {
            throw abc;
        } finally {
            return "A. O. K."; // Mutation: Renaming
        }
    }

    public String showMutation() {
        return foo();
    }
}