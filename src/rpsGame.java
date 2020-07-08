import java.util.*;

public class rpsGame {

    public String getRandomElement(List<String> rps) {
        Random rand = new Random();
        return rps.get(rand.nextInt(rps.size()));
    }

    public static void main(String[] args) {

        List<String> rps = new ArrayList<>();
        rps.add("Rock");
        rps.add("Paper");
        rps.add("Scissors");


        while (true) {
            rpsGame lol = new rpsGame();
            lol.getRandomElement(rps);
            Scanner scanner = new Scanner(System.in);

            String userInput = scanner.next();
            System.out.println("The computer chose: " + lol.getRandomElement(rps));

            if (userInput.equals("Rock") || userInput.equals("Paper") || userInput.equals("Scissors")) {

                switch (userInput) {
                    case "Rock":
                        System.out.println("Case Rock");
                        if (lol.getRandomElement(rps).equals(userInput)) {
                            System.out.println("Draw!");
                        } else if (lol.getRandomElement(rps).equals("Scissors")) {
                            System.out.println("You won!");
                        } else {
                            System.out.println("You lost!");
                        }
                        break;
                    case "Paper":
                        System.out.println("Case Paper");
                        if (lol.getRandomElement(rps).equals(userInput)) {
                            System.out.println("Draw!");
                        } else if (lol.getRandomElement(rps).equals("Stone")) {
                            System.out.println("You won!");
                        } else {
                            System.out.println("You lost!");
                        }
                        break;
                    case "Scissors":
                        System.out.println("Case Scissors");
                        if (lol.getRandomElement(rps).equals(userInput)) {
                            System.out.println("Draw!");
                        } else if (lol.getRandomElement(rps).equals("Paper")) {
                            System.out.println("You won!");
                        } else {
                            System.out.println("You lost!");
                        }
                        break;
                }
            } else {
                System.out.println("Please enter Rock, Paper or Scissors.");
            }
        }
    }
}
