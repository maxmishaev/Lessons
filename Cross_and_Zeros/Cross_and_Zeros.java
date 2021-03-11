import java.util.Scanner;

class Main {
  private static final char CROSS_SYMB = 'X';
  private static final char ZERO_SYMB = '0';
  private static final char FIELD_VOID = '.';
  //private static final Scanner SCANNER = new Scanner(System.in);

  private static void gameFieldInit(char[][] battleField) {
    //Начальная нициализация массива. Записываются точки во все элементы. 
    for(int i=0;i<battleField.length;i++) {
      for(int j=0;j<battleField.length;j++) {
        battleField[i][j] = FIELD_VOID;
      }
    } 
  }
   

  private static void fillGameField(char[][] battleField) { 
    //Метод выводит на экран игровое поле, пользуясь данными массива battleField.
    System.out.println("  _______");
    System.out.println("  1  2  3");
    for(int i=0;i<battleField.length;i++) {
      System.out.print((i+1) + " |");
      for (int j=0; j<battleField.length;j++) {
        System.out.print(battleField[i][j] + "|");
      }
      System.out.println();
    }
    System.out.println("  _______");
  }

  private static void moveHuman() {
  int x;
  int y;
  Scanner sc = new Scanner(System.in);
  System.out.print("Введите координаты через пробел:> ");
  x = sc.nextInt();
  y = sc.nextInt();
  }

  public static void main(String[] args) {
    System.out.println("Hello world!");    

    char[][] gameField = new char[3][3];
    
    gameFieldInit(gameField);
    fillGameField(gameField);
    moveHuman();

   
  }
}