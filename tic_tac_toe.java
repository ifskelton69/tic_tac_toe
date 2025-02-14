package java1;
import java.util.Scanner;
public class tic_tac_toe {
      public static void print(char[][] board)
      {
         for(int row=0;row<board.length;row++){
            
            for(int col=0;col<board[0].length;col++){
               System.out.print(board[row][col]+"|");
            }
                System.out.println();
        }

       }
    
       public static boolean havewon(char[][] board,char player){ 
        
            for(int row=0;row<board.length;row++){
               if(board[row][0]==player&&board[row][1]==player&&board[row][2]==player){
                  return true;
              }
            }
              for(int col=0;col<board[0].length;col++){
       
                if (board[0][col]==player&&board[1][col]==player&&board[2][col]==player){
                return true;
               }
            }
              if(board[0][0]==player&&board[1][1]==player&&board[2][2]==player){
                return true;
            }
              if(board[2][0]==player&&board[1][1]==player&&board[0][2]==player){
               return true;
            }
            return false;
    }
     public static void playgame() {
    	 char[][] board=new char[3][3];
         for(int row=0;row<board.length;row++){
          
          for(int col=0;col<board[row].length;col++){
              board[row][col]=' ';
            }
          }
    	 char player='X';
         boolean gameover=false;
         Scanner sc = new Scanner(System.in);
    	 while(!gameover){
     
           print(board);
           System.out.println(player+" Enter the coordinates:");
           int row=sc.nextInt();
           int col=sc.nextInt();
           
           if(board[row][col]==' '){
              board[row][col]=player;
              gameover=havewon(board,player);
              if (gameover){
                  System.out.println("\t***** WINNER IS : "+player+" ******");
               } else {
                  player=(player=='X')?'O':'X';
               }
               }
              else {
                  System.out.println("Invalid move");
              }
          }
    	 print(board);

     }
     
     public static void rule() {
    	 
    	 System.out.println("***** RULES OF GAME ******");
    	 System.out.println("1. 2 players are required for the game.");
    	 System.out.println("2. First, decide which player will be X and which player will be O.");
    	 System.out.println("3. The player with X starts the game.");
    	 System.out.println("4. The first player must place their mark on any of the 9 squares on the grid.");
    	 System.out.println("5. Then, the second player has a turn to place their mark on the grid.");
    	 System.out.println("6. Each player must continue to take 1 turn at a time to place their marks until all the squares are full");
    	 System.out.println("\n *********************************");
    	 
     }
        public static void main(String[] args)
    {
        
        System.out.println("**** Welcome to Tic Tac Toe Game ****");
        int ch;
        do {
        System.out.println("\n 1. Read Rules of Game");
        System.out.println("\n 2. Play Game");
        System.out.println("\n 3. Exit");
       
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Choice:");
        ch=sc.nextInt();
        
        switch(ch){
        
        case 1:rule();
        break;
        case 2: playgame();
        break;
        case 3: System.out.println("Thank You....!!!!");
        break;
        default:System.out.println("Plz Enter valid Number!!");
        }
        }while(ch!=3);
                  
        }
    }