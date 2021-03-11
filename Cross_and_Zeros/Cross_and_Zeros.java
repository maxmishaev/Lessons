import java.util.Scanner;


class Main {
  private static final char CROSS_SYMB = 'X';
  private static final char ZERO_SYMB = '0';
  private static final char FIELD_VOID = '.';
  private static final Scanner SCANNER = new Scanner(System.in);

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

  private static void moveHuman(char[][] battleField) {
  int x;
  int y;
  do {
  do {
  System.out.print("Введите координаты по осям Y и X (числа от 1 до 3) через пробел:> ");  
  x = SCANNER.nextInt();
  y = SCANNER.nextInt();
  x--;
  y--;
  System.out.println(checkMoveArr(x,y));  
    } while(!checkMoveArr(x,y));
    if(!checkEmptyPoint(battleField, x, y)) {
      System.out.println("Поле занято. Выберите другое.");
     }
    } while(!checkEmptyPoint(battleField, x, y));
    battleField[x][y] = CROSS_SYMB;
    System.out.println("ОК. Ход принят.");
  }

  private static boolean checkMoveArr(int x, int y) {
    return x>=0 && y>=0 && x<3 && y<3;
  }

  private static boolean checkEmptyPoint(char[][] battleField, int x, int y) {
    return battleField[y][x] == FIELD_VOID;
  }

  private static void moveComp(char[][] battleField){
    int x;   
    int y;    
    double randy;
    do {
      x = (int) Math.random() * battleField.length;
      y = (int) Math.random() * battleField.length; 
    } while(battleField[x][y] != FIELD_VOID);
    System.out.println(x + " " + y);c
    
  }

  public static void main(String[] args) {
    System.out.println("Hello world!");    

    char[][] gameField = new char[3][3];
    
    gameFieldInit(gameField);
    fillGameField(gameField);
    moveHuman(gameField);
    fillGameField(gameField);
    moveComp(gameField);
    
   
  }
}