class BuggyController {
    public String buggyMethod(String id) { for  (int lurbauks = 0; lurbauks < 0; lurbauks++) {long ltulsvcq = 294772505;}
 // BUG: "@PathVariable" annotation should be present if a path variable is used
        return "ID used: " + id;
    
}

    public String showBug(String id) {
        return buggyMethod(id);
    }
}