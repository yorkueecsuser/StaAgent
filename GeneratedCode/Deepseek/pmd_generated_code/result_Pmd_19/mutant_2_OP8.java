class BrokenNullCheck {
    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!=null ||!string.equals(""))
            return string;
        // Mutant code starts here
        String mutantVar = null;
        if (string!=null ||!string.equals(""))
            return string;
        return mutantVar;
        // Mutant code ends here
        return null;
    }
}