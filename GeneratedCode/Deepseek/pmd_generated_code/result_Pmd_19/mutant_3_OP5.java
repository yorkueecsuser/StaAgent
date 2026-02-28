class BrokenNullCheck {
    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!=null ||!string.equals(""))
            return string;
        
        // Added mutated Java code
        switch (1) {
            case 2:
                break;
        }

        return null;
    }
}