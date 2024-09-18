import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
public class TransitionTableReader {
    public static void main(String[] args) {
        String filename = "C:\\Users\\georg\\OneDrive\\Desktop\\task3.txt"; // replace with your file name

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            // read the number of states and alphabet
            String[] firstLine = br.readLine().split(" ");
            int numStates = Integer.parseInt(firstLine[0]);
            int numAlphabet = Integer.parseInt(firstLine[1]);

            // create a hash map to store the transitions
            HashMap<String, Integer>[] transitions = new HashMap[numStates];
            for (int i = 0; i < numStates; i++) {
                transitions[i] = new HashMap<>();
            }

            // read the start and end states
            int startState = Integer.parseInt(br.readLine());
            int endState = Integer.parseInt(br.readLine());

            // read the transition table and store it in the hash map
            for (int i = 0; i < numStates; i++) {
                String[] line = br.readLine().split("\t");
                for (int j = 0; j < numAlphabet; j++) {
                    String[] transition = line[j].split(",");
                    transitions[i].put(transition[0], Integer.parseInt(transition[1]));
                }
            }
            // read a string input from the user
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a string: ");
            String input = reader.readLine();

            // simulate the DFA using the input string
            int currentState = startState;
            for (int i = 0; i < input.length(); i++) {
                String symbol = String.valueOf(input.charAt(i));
                if (!transitions[currentState].containsKey(symbol)) {
                    System.out.println("Rejected");
                    return;
                }
                currentState = transitions[currentState].get(symbol);
            }

            // check if the final state is an accept state
            if (currentState == endState) {
                System.out.println("Accepted");
            } else {
                System.out.println("Rejected");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}