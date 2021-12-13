public class Land extends Main{

    int width;
    int height;
    int[][] board;

    public Land(int width, int height) {
        this.width = width;
        this.height = height;
        this.board = new int[width][height];
    }

    public void printBoard() {

        try{
            for (int y = 0; y < height; y++) {
                StringBuilder line = new StringBuilder("|");
                for (int x = 0; x < width; x++) {
                    if (this.board[x][y] == 0) {
                        line.append("|   |");
                    } else if (this.board[x][y] == 2){
                        line.append("| G |");
                    } else if (this.board[x][y] == 3){
                        line.append("| X |");
                    } else {
                        line.append("| H |");
                    }
                }
                line.append("|");
                System.out.println(line);
            }
            System.out.println("\n");
        }catch (Exception e){
            System.out.println("Failed to print map.");
        }
    }

    public void setPlayer(int x, int y) {
        try{
            this.board[x][y] = 1;
        }catch (Exception e){
            System.out.println("Failed to set player location.");
        }
    }

    public void setDead(int x, int y) {
        try{
            this.board[x][y] = 2;
        }catch (Exception e){
            System.out.println("Failed to set Goblin location.");
        }
    }

    public void setCombat(int x, int y){
        try{
            this.board[x][y] = 3;
        }catch (Exception e){
            System.out.println("Failed to set combat location");
        }
    }
}