import java.util.*;

public class DataStore {

    public static List<Condition> getConditions() {

        List<Condition> conditions = new ArrayList<>();

        conditions.add(new Condition(
                "Gastritis",
                Arrays.asList("stomach pain", "nausea", "bloating")
        ));

        conditions.add(new Condition(
                "Acidity",
                Arrays.asList("heartburn", "chest pain", "bloating")
        ));

        conditions.add(new Condition(
                "Food Poisoning",
                Arrays.asList("vomiting", "diarrhea", "fever")
        ));

        conditions.add(new Condition(
                "Indigestion",
                Arrays.asList("bloating", "nausea", "fullness")
        ));

        return conditions;
    }
}
