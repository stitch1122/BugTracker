
public class Bug extends Issue{
    private String severity;
    private String priority;
    private String steps;

    public Bug(String title, String summary, String severity, String priority, String steps){
        super(title, summary);
        this.severity = severity;
        this.priority = priority;
        this.steps = steps;
    }

    @Override
    public String makeString() {
        return super.makeString() + severity + "; " + priority + "; " + steps;
    }
}
