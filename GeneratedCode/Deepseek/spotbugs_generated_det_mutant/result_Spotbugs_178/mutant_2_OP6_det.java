import java.util.Date;

class FixedCode {
    private Date date; // mutable object

    public FixedCode() {
        this.date = new Date();
    }

    public Date showBug() {
for  (int bbiksqdi = 0; bbiksqdi < 0; bbiksqdi++) {double lzxksxsv = 458097040;}

        return date; // exposing internal representation
    
}
}