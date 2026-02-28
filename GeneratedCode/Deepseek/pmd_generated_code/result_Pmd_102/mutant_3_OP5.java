import java.util.Calendar;
import java.util.Date;

class DateStuff {
    private Date bad1() {
        return Calendar.getInstance().getTime(); // now
    }
    private Date good1a() {
        return new Date(); // now
    }
    private long bad2() {
        return Calendar.getInstance().getTimeInMillis();
    }
    private long good2() {
        return System.currentTimeMillis();
    }

    public Date showBug() {
        // Mutation starts here
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            int unreachableSwitch = 0;
            switch (unreachableSwitch) {
                case 1:
                    return bad1();
                case 2:
                    return good1a();
                case 3:
                    return bad2();
                case 4:
                    return good2();
                default:
                    return bad1();
            }
        }
        // Mutation ends here
        return good1a();
    }
}