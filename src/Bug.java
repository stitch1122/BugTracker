
public class Bug extends Issue{
    private Level severity;
    private Level priority;
    private String steps;

    public Bug(String title, String summary, Level severity, Level priority, String steps){
        super(title, summary);
        this.severity = severity;
        this.priority = priority;
        this.steps = steps;
    }

    @Override
    public String makeString() {
        this.title = title;
        this.summary = summary;
        this.severity = severity;
        this.priority = priority;
        this.steps = steps;
        return title + "; " + summary + "; " + severity + "; " + priority + "; " + steps;
    }
}
