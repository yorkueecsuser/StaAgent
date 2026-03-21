class BuggyController {
    public String buggyMethod(String id) { // BUG: "@PathVariable" annotation should be present if a path variable is used
        return "ID used: " + id;
    }

    public String showBug(String id) {
        return buggyMethod(id);
    }
}