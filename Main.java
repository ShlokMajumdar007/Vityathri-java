import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Gastro Health Assistant ===");
        System.out.println("Enter symptoms separated by comma:");
        
        String input = sc.nextLine();
        String[] symptomsArray = input.toLowerCase().split(",");

        List<String> symptoms = new ArrayList<>();
        for (String s : symptomsArray) {
            symptoms.add(s.trim());
        }

        Analyzer analyzer = new Analyzer();
        analyzer.analyze(symptoms);

        sc.close();
    }
}