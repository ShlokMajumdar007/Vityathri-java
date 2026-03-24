public class Symptom {
    private String name;

    public Symptom(String name) {
        this.name = name.toLowerCase();
    }

    public String getName() {
        return name;
    }
}