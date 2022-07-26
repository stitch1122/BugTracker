public class Enhancement extends Issue {
    private String donation;

    public Enhancement(String title, String summary,String donation) {
        super(title, summary);
        this.donation = donation;
    }

    @Override
    public String makeString() {
        return super.makeString() + donation;
    }
}
