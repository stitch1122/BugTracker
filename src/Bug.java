
public class Bug {
    private String title;
    private String summary;
    private String severity;
    private String priority;
    private String steps;
    public Bug(String title, String summary, String severity, String priority, String steps){
        this.title = title;
        this.summary = summary;
        this.severity = severity;
        this.priority = priority;
        this.steps = steps;
    }
    public String makeString() {
        return " " + title + "; " + summary + "; " + severity + "; " + priority + "; " + steps;
    }
}
