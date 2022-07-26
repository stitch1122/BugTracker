public class Issue {
    private String title;
    private String summary;

    public Issue (String title, String summary) {
        this.title = title;
        this.summary = summary;
    }

    public String makeString() {
        return title + "; " + summary + "; ";
    }
}
