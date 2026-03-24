import java.util.*;

public class Analyzer {

    public void analyze(List<String> userSymptoms) {

        List<Condition> conditions = DataStore.getConditions();
        Condition bestMatch = null;
        int maxScore = 0;

        for (Condition condition : conditions) {
            int score = 0;

            for (String symptom : userSymptoms) {
                if (condition.getSymptoms().contains(symptom)) {
                    score++;
                }
            }

            if (score > maxScore) {
                maxScore = score;
                bestMatch = condition;
            }
        }

        if (bestMatch != null) {
            String severity = calculateSeverity(maxScore);

            System.out.println("\n--- Result ---");
            System.out.println("Condition: " + bestMatch.getName());
            System.out.println("Severity: " + severity);
        } else {
            System.out.println("No matching condition found.");
        }
    }

    private String calculateSeverity(int score) {
        if (score <= 1) return "Low";
        else if (score == 2) return "Medium";
        else return "High";
    }
}
