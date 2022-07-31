public enum Level {
    LOW("низкий"), MEDIUM("средний"), HIGH("высокий");
    String nameLevel;
    Level(String name){
        this.nameLevel = name;
    }

    public String getNameLevel() {
        return nameLevel;
    }
}
