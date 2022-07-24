
public class Bug {
    public String title;
    public String summary;
    public String priority;
    public String severity;
    public String steps;

    public String makeString() {
        return " " + title + "; " + summary + "; " + priority + "; " + severity + "; " + steps;
    }
}
