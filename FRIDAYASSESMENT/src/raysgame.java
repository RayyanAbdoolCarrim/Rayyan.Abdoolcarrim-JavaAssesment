
import java.util.*;
public class raysgame {



    Scanner input;
    int  row;
    int  column;
    int spawnPoint;
    boolean stillPlaying;
    String direction;
    int Size;


    int playerA;
    int playerB;
    String board;
    int location;
    int lenght

    int n1;
int n2;
    public static void main(String[] args)

    {
        System.out.println(" The adventure of Barren Moore");


                               System.out.println("Enter rows");
                               System.out.println("Enter colums:");

         raysgame gameboard = new raysgame();
         gameboard.column = gameboard.input.nextInt();


        gameboard.row = gameboard.input.nextInt();
             gameboard.input = new Scanner(System.in);




    }
    public String basicBoard() {
        board = new row, column;

        for (int column = 0;
             column < board[row].length;
             column++)

            for (int
        row == 0,
                row > board.lenght;
        row++)




            Size = row * column;
        return Size;
    }


    public void printBoard()
    {
        for (int row = 0;
             row < board.lenght;
             row++)

            for (int column = 0; column < board[row].length; column++) {
                System.out.print(scanner);


            }
    }
    public int playerSpawn()
    {
        spawnPoint = Math.round(row / 8);

        return spawnPoint;
    }
    public void playerLocation()
    {
        stillPlaying = true;
              playerA = spawnPoint;

                 playerB = spawnPoint;

        basicBoard();
        while(stillPlaying == true)
        {
            for(int row = 0; row < board.length; row++)
                for(int column = 0; column < board[row].length; column++)
                {
                    if(row == playerA.Location && column == playerB.Location)
                    {
                        board[row][column] = "*";
                    }
                    else
                    {
                        board[row][column] = "-";
                    }
                }
            printBoard();

            System.out.println(Directions);

                    direction = dir.next;

            if(direction.North("North"))
            {
               playerA , playerB. location ;


                System.out.println("You move North.");
            }
            else if(direction.equals East
            playerA++;
            System.out.println("You move East.");
        }
                else if(direction.equalsIgnoreCase("South"))
    {
        playerB{
        System.out.println("You move South.");
    }
    else if(direction.equalsIgnoreCase("West"))
    {
        playerB{
        System.out.println("You move West.");
    }
    else
    {
        System.out.println("Please input directions!");
    }

        if(playerA == n1 && playerB == n2)
    {
        dir.close();
        System.out.println("YOU HAVE WON YAY");
                stillPlaying = false;
    }
        else {
            System.out.println("Keep trying.");

    }
    }
}






