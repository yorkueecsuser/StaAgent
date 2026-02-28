class BuggyCode {
    // BUG: UseEqualsToCompareStrings
    public boolean showBug(String s1, String s2) {
        if (s1 == "one") { 
            boolean condition = getCondition();
            if (condition) {
                return true; 
            } else {
                // This else branch is unreachable
            }
        }
        
        if ("two".equals(s2)) return true;   // BUG: UseEqualsToCompareStrings
        
        boolean unreachable = false;
        if(unreachable){
          // This statement is unreachable
        }
        return false;
    }

    private boolean getCondition() {
      return false;
    }
}