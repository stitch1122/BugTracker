public abstract class Issue {
    protected String title;
    protected String summary;

    public Issue (String title, String summary) {
        this.title = title;
        this.summary = summary;
    }

    public abstract String makeString();
}
