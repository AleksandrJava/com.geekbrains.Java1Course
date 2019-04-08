package Lesson3;

//1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать;
//2. Реализовать логику более умного компьютера, который определяет свой ход на основании соседних клеток;
//3. Найти в коде неоптимальные места и улучшить их;

import java.util.Random;
import java.util.Scanner;


public class TicTac {

    private static char[][] map;
    private static int SIZE = 3;

    private static final char DOT_EMPTY = '*';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            if (isEndGame(DOT_X)) {
                break;
            }

            computerTurn();

            if (isEndGame(DOT_O)) {
                break;
            }
        }

        System.out.println("Игра закончена");
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for(int i = 0; i < SIZE; i ++){
            for(int j = 0; j < SIZE; j++){
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        for(int i = 0; i <= SIZE; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i =0; i < SIZE; i++){
            System.out.print((i+1) + " ");
            for(int j = 0; j < SIZE; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }


    private static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты через пробел (X Y)");
            y = scanner.nextInt() - 1;
            x = scanner.nextInt() - 1;
        }
        while(!isCellValid(x, y));

        map[y][x] = DOT_X;
    }

    public static void computerTurn(){

        int count = 0;
        int maxcount = 0;
        int x = -1;
        int y = -1;



        do {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY) {
                        if (i == 0) {
                            if (j == 0) {
                                if (map[0][1] == DOT_O) {
                                    count = count + 1;
                                }
                                if (map[1][0] == DOT_O) {
                                    count = count + 1;
                                }
                                if (maxcount <= count) {
                                    maxcount = count;
                                    x = j;
                                    y = i;
                                }

                            } else if (j == 1) {
                                if (map[0][0] == DOT_O) {
                                    count = count + 1;
                                }
                                if (map[0][2] == DOT_O) {
                                    count = count + 1;
                                }
                                if (map[1][1] == DOT_O) {
                                    count = count + 1;
                                }
                                if (maxcount <= count) {
                                    maxcount = count;
                                    x = j;
                                    y = i;
                                }
                            } else if (j == 2) {
                                if (map[0][1] == DOT_O) {
                                    count = count + 1;
                                }
                                if (map[1][2] == DOT_O) {
                                    count = count + 1;
                                }
                                if (maxcount <= count) {
                                    maxcount = count;
                                    x = j;
                                    y = i;
                                }
                            }

                            count = 0;
                        } else if (i == 1) {
                            if (j == 0) {
                                if (map[0][0] == DOT_O) {
                                    count = count + 1;
                                }
                                if (map[1][1] == DOT_O) {
                                    count = count + 1;
                                }
                                if (map[2][0] == DOT_O) {
                                    count = count + 1;
                                }
                                if (maxcount <= count) {
                                    maxcount = count;
                                    x = j;
                                    y = i;
                                }
                            } else if (j == 1) {
                                if (map[1][0] == DOT_O) {
                                    count = count + 1;
                                }
                                if (map[0][1] == DOT_O) {
                                    count = count + 1;
                                }
                                if (map[1][2] == DOT_O) {
                                    count = count + 1;
                                }
                                if (map[2][1] == DOT_O) {
                                    count = count + 1;
                                }
                                if (maxcount <= count) {
                                    maxcount = count;
                                    x = j;
                                    y = i;
                                }
                            } else if (j == 2) {
                                if (map[0][2] == DOT_O) {
                                    count = count + 1;
                                }
                                if (map[1][1] == DOT_O) {
                                    count = count + 1;
                                }
                                if (map[2][2] == DOT_O) {
                                    count = count + 1;
                                }
                                if (maxcount <= count) {
                                    maxcount = count;
                                    x = j;
                                    y = i;
                                }
                            }
                            count = 0;
                        } else if (i == 2) {
                            if (j == 0) {
                                if (map[1][0] == DOT_O) {
                                    count = count + 1;
                                }
                                if (map[2][1] == DOT_O) {
                                    count = count + 1;
                                }
                                if (maxcount <= count) {
                                    maxcount = count;
                                    x = j;
                                    y = i;
                                }
                            } else if (j == 1) {
                                if (map[2][0] == DOT_O) {
                                    count = count + 1;
                                }
                                if (map[1][1] == DOT_O) {
                                    count = count + 1;
                                }
                                if (map[2][2] == DOT_O) {
                                    count = count + 1;
                                }
                                if (maxcount <= count) {
                                    maxcount = count;
                                    x = j;
                                    y = i;
                                }
                            } else if (j == 2) {
                                if (map[1][2] == DOT_O) {
                                    count = count + 1;
                                }
                                if (map[2][1] == DOT_O) {
                                    count = count + 1;
                                }
                                if (maxcount <= count) {
                                    maxcount = count;
                                    x = j;
                                    y = i;
                                }
                            }

                            count = 0;
                        }


                    }

                }
            }



            if (maxcount == 0){
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
            }
        } while (!isCellValid(x, y));



        System.out.println("Компьютер сходил на " + (y + 1) + " " + (x + 1));
        map[y][x] = DOT_O;
    }


    public static boolean isCellValid(int x, int y){
        boolean result = true;

        if(x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            result = false;
        }

        if(map[y][x] != DOT_EMPTY){
            result = false;
        }

        return result;
    }

    private static boolean isEndGame(char playerSymbol){
        boolean result = false;

        printMap();

        if(checkWin(playerSymbol)){
            System.out.println("Победил игрок " + playerSymbol);
            result = true;
        }

        if(isMapFull()){
            System.out.println("Ничья");
            result = true;
        }

        return result;
    }

    public static boolean isMapFull(){
        boolean result = true;

        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                if(map[i][j] == DOT_EMPTY)
                    result = false;
            }
        }

        return result;
    }

    private static boolean checkWin(char playerSymbol) {
        boolean result = false;

        if(
                (map[0][0] == playerSymbol && map[0][1] == playerSymbol && map[0][2] == playerSymbol) ||
                        (map[1][0] == playerSymbol && map[1][1] == playerSymbol && map[1][2] == playerSymbol) ||
                        (map[2][0] == playerSymbol && map[2][1] == playerSymbol && map[2][2] == playerSymbol) ||
                        (map[0][0] == playerSymbol && map[1][0] == playerSymbol && map[2][0] == playerSymbol) ||
                        (map[0][1] == playerSymbol && map[1][1] == playerSymbol && map[2][1] == playerSymbol) ||
                        (map[0][2] == playerSymbol && map[1][2] == playerSymbol && map[2][2] == playerSymbol) ||
                        (map[0][0] == playerSymbol && map[1][1] == playerSymbol && map[2][2] == playerSymbol) ||
                        (map[2][0] == playerSymbol && map[1][1] == playerSymbol && map[0][2] == playerSymbol)){
            result = true;
        }

        return result;
    }

}
