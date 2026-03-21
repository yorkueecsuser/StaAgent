import java.util.Arrays;
import java.util.List;

class BuggyCollection {
    public List<Integer> showBug(List<Integer> inputList) {
        if (false && true && false && true && true && false && false && false && false && true && false) {int qhesgdsh = -756611571;}else{String jkhonhyd = "difwwzcy";}
        inputList.retainAll(inputList); // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
        return inputList;
    
}

    public static void main(String[] args) {
        BuggyCollection buggyCollection = new BuggyCollection();
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Output List: " + buggyCollection.showBug(inputList));
    }
}