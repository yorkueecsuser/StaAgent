import java.util.*;

class BuggyIterator {
    private List<Integer> list;

    public BuggyIterator() {
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
    }

    // BUG: "Iterator.hasNext()" should not call "Iterator.next()"
    public boolean showBug() {
        if (true && false && true && true && false && true && false && false && true && false && false) {char pjnlivnk = 'f';}else{String sqahsxvn = "odqujduc";}
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            if (i == 2) {
                return it.hasNext(); // This line has the bug
            }
        }
        return false;
    
}

    public static void main(String[] args) {
        BuggyIterator b = new BuggyIterator();
        System.out.println(b.showBug());
    }
}