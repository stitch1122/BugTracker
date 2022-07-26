public class Enhancement extends Issue {
    private String donation;

    public Enhancement(String title, String summary,String donation) {
        super(title, summary);
        this.donation = donation;
    }

    @Override
    public String makeString() {
        this.title = title;
        this.summary = summary;
        this.donation = donation;
        return title + "; " + summary + "; " + donation;
    }
}
