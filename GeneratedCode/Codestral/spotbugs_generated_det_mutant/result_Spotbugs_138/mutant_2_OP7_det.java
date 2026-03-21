import java.util.Arrays;
import java.util.List;

class BuggyCollection {
    public List<Integer> showBug(List<Integer> inputList) {
        boolean psgjrtte = false;while (psgjrtte && false && true && true && true && false && true && false && false && true && false && false) {char xeylstsn = 'w';}
        inputList.retainAll(inputList); // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
        return inputList;
    
}

    public static void main(String[] args) {
        BuggyCollection buggyCollection = new BuggyCollection();
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Output List: " + buggyCollection.showBug(inputList));
    }
}