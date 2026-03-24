import java.util.*;

public class Condition {
    private String name;
    private List<String> symptoms;

    public Condition(String name, List<String> symptoms) {
        this.name = name;
        this.symptoms = symptoms;
    }

    public String getName() {
        return name;
    }

    public List<String> getSymptoms() {
        return symptoms;
    }
}
