import java.util.*;

class RedundantNullCheckBug {
    public String showBug(String str) {
        StringBuilder sb = new StringBuilder(str);
        String unusedVariable = "deadstore"; // Dead Store Mutation
        if (sb!= null) { // BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)
            return sb.toString();
        }
        return null;
    }
}