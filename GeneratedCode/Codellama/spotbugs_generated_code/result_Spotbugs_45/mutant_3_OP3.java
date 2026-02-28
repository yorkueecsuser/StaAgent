import java.util.ArrayList;

class UWF_NULL_FIELD {
    private String field;

    public void setField(String value) {
        field = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
    }

    public String getField() {
        return field;
    }

    public static void main(String[] args) {
        UWF_NULL_FIELD uwf = new UWF_NULL_FIELD();
        uwf.setField("Hello World");
        System.out.println(uwf.getField());
    }
}

/*------------------------------------------------------------------------------------------
    Mutation Operator: Unreachable if statement
    
    Description: Inserting unreachable if branch into a randomly selected basic block in the program. 
    The condition of the inserted branch is always false to make it unreachable.
    
    Original Code:
        public void setField(String value) {
            field = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
        }
        
    Mutated Code:
        public void setField(String value) {
            if (false) {
                field = null;
            }
        }
------------------------------------------------------------------------------------------*/