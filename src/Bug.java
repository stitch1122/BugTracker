
public class Bug {
    public String title;
    public String summary;
    public String severity;
    public String priority;
    public String steps;
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
