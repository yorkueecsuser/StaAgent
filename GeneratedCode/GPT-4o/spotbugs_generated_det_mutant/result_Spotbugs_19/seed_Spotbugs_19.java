class HashCodeBugExample {

    public int showBug(String input) {
        int hash = input.hashCode();
        
        int absHashCode = Math.abs(hash); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        return absHashCode;
    }
    
    // public static void main(String[] args) {
    //     HashCodeBugExample example = new HashCodeBugExample();
    //     System.out.println("Hash abs value: " + example.showBug("polygenelubricants"));
    //     System.out.println("Hash abs value: " + example.showBug("GydZG_"));
    //     System.out.println("Hash abs value: " + example.showBug("DESIGNING WORKHOUSES"));
    // }
}


// $ cd /local/home/ennorom/projects/SAST/SASTTool/gpt-4o/spotbugs_clean_java_code_gpt-4o_test/result_Spotbugs_19 && mkdir -p compile_tmp_seed19 && javac -d compile_tmp_seed19 -cp ".:../libs/*" seed_Spotbugs_19.java && java -jar /local/home/ennorom/projects/packages/spotbugs-4.9.3/lib/spotbugs.jar -textui -low -effort:max compile_tmp_seed19/*.class