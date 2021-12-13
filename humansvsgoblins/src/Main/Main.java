import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean playAgain = true;

        Scanner nameInput = new Scanner(System.in);
        System.out.println("What is your name?");
        String setName = nameInput.nextLine().trim();

        Human h1 = new Human(setName);

        while (playAgain) {
            Land outerLand = new Land(6, 6);

            ArrayList<String> gobNames = new ArrayList<>();

            gobNames.add("Gop");
            gobNames.add("Dragan");
            gobNames.add("Ole Scratch");
            gobNames.add("Draco");
            gobNames.add("Dobbins");
            gobNames.add("Sunder");
            gobNames.add("Bumble");
            gobNames.add("Nok");

            if (h1.inventory.contains("Great Sword of Death")){
                h1.setAttack(10);
            }

            if (h1.inventory.contains("Shield of Unyielding Vigor")){
                h1.setDefense(11);
            }

            if (h1.inventory.contains("Lucky Horse Shoe")){
                h1.setLuck(4);
            }

            int randNum = RandomNum.generator(0, (gobNames.size() - 1));

            Goblin g1 = new Goblin(gobNames.get(randNum));

            g1.setLevel(h1.getLevel() + 1);

            System.out.println(g1);
            System.out.println(h1);

            int gob1 = 5;
            int gob2 = RandomNum.generator(0, 5);
            int hum1 = 0;
            int hum2 = RandomNum.generator(0, 5);

            System.out.println(g1.getName() + " begins on 'x': " + (gob1 + 1) + " 'y': " + (gob2 + 1) + ".");
            System.out.println(h1.getName() + " begins on 'x': " + (hum1 + 1) + " 'y': " + (hum2 + 1) + ".");

            outerLand.setPlayer(hum1, hum2);
            outerLand.setDead(gob1, gob2);
            outerLand.printBoard();

            while ((!Objects.equals(gob1, hum1)) || (!Objects.equals(gob2, hum2))) {
                Land land = new Land(6, 6);
                Land combat = new Land(6, 6);

                if(h1.getHealth() < 900){

                    h1.setHealth((int) (h1.getHealth() + (900 * .20)));

                    if(h1.getHealth() >= 900){
                        System.out.println(h1.getName() + " is now at full health.");
                    }else{
                        System.out.println(h1.getName() + " regains " + ((int) (900 * .20)) + " health, and now has "
                                + h1.getHealth() + " health.");
                    }
                }

                if(h1.getHealth() > 900){
                    h1.setHealth(900);
                }

                Scanner getInput = new Scanner(System.in);
                System.out.println("If there is a goblin next to your position you may press (f) to initiate combat.");
                System.out.println("Otherwise, will you go North (w), East (a), South (s), or West (d)? ");
                String playerInput = getInput.nextLine();

                if (!Objects.equals(gob1, hum1)) {
                    if (gob1 > hum1) {
                        gob1 = gob1 - 1;
                    } else {
                        gob1 = gob1 + 1;
                    }
                } else {
                    if (gob2 > hum2) {
                        gob2 = gob2 - 1;
                    } else {
                        gob2 = gob2 + 1;
                    }
                }

                if (Objects.equals(playerInput, "a") || Objects.equals(playerInput, "d")) {
                    if (playerInput.equals("a")) {
                        hum1 = hum1 - 1;
                    } else {
                        hum1 = hum1 + 1;
                    }
                } else if (Objects.equals(playerInput, "w") || Objects.equals(playerInput, "s")) {
                    if (playerInput.equals("w")) {
                        hum2 = hum2 - 1;
                    } else {
                        hum2 = hum2 + 1;
                    }
                } else if (playerInput.equals("f")) {
                    System.out.println("You have forfeited your move and prepare for combat.");
                } else {
                    System.out.println("Invalid choice. You lose a turn");
                }

                System.out.println(g1.getName() + " chose 'x': " + (gob1 + 1) + " 'y': " + (gob2 + 1) + ".");
                System.out.println(h1.getName() + " chose 'x': " + (hum1 + 1) + " 'y': " + (hum2 + 1) + ".");

                if (!Objects.equals(hum1, gob1) || !Objects.equals(hum2, gob2)) {
                    land.setPlayer(hum1, hum2);
                    land.setDead(gob1, gob2);
                    land.printBoard();
                } else if (Objects.equals(hum1, gob1) && Objects.equals(hum2, gob2)) {
                    combat.setCombat(hum1, hum2);
                    combat.printBoard();
                }
            }
            h1.combat(g1);

            if (h1.getHealth() <= 0){
                break;
            }

            if(!g1.inventory.contains("Empty")){
                if (h1.inventory.contains("Empty")){
                    h1.inventory.remove(0);
                    h1.inventory.add(g1.inventory.get(0));

                    System.out.println(g1.getName() + " drops a " + g1.inventory.get(0) + ".");
                    System.out.println("You pick it up and place it in your bag.");
                }else if (h1.inventory.contains(g1.inventory.get(0))){
                    System.out.println(g1.getName() + " drops nothing useful. However, you find " + g1.getGold() + " gold.");
                    h1.setGold(h1.getGold() + g1.getGold());
                    System.out.println("You place it into your coin purse, and now have " + h1.getGold() + " gold.");
                }else{
                    h1.inventory.add(g1.inventory.get(0));
                    System.out.println(g1.getName() + " drops a " + g1.inventory.get(0) + ".");
                    System.out.println("You pick it up and place it in your bag.");
                }

            }else {
                System.out.println(g1.getName() + " drops nothing useful. However, you find " + g1.getGold() + " gold.");
                h1.setGold(h1.getGold() + g1.getGold());
                System.out.println("You place it into your coin purse, and now have " + h1.getGold() + " gold.");
            }

            System.out.println("You gain a level.");
            h1.setLevel(h1.getLevel() + 1);
            System.out.println("You are now level " + h1.getLevel() + "!");

            Scanner keepPlaying = new Scanner(System.in);
            System.out.println("Would you like to play again? (y or n)");
            String again = keepPlaying.nextLine();

            if(Objects.equals(again, "n")){
                playAgain = false;
            }else if(!Objects.equals(again, "y")){
                System.out.println("Invalid choice. Game over.");
                playAgain = false;
            }
        }
    }
}