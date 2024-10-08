public class RatMaze {

  public static void printSol(int[][] output, int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(output[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static boolean isSafe(int maze[][], int i, int j, int n) {
    if (i >= 0 && i < n && j >= 0 && j < n && maze[i][j] == 1) {
      return true;
    } else {
      return false;
    }

  }

  public static boolean solveMaze(int[][] maze, int[][] output, int i, int j, int n) {
    if (i == n - 1 && j == n - 1 && maze[i][j] == 1) {
      output[i][j] = 1;
      return true;
    }
    if (isSafe(maze, i, j, n) == true) {
      if (output[i][j] == 1) {
        return false;
      }
      // output mark is an part of solution
      output[i][j] = 1;
      // right direction
      if (solveMaze(maze, output, i + 1, j, n) == true) {
        return true;
      }
      if (solveMaze(maze, output, i, j + 1, n) == true) {
        return true;
      }
      // backtarck
      output[i][j] = 0;
      return false;
    }
    return false;
  }

  public static void main(String[] args) {
    int[][] maze = { { 1, 0, 1, 1 }, { 1, 0, 1, 1, }, { 1, 1, 0, 1 }, {
        0, 1, 1, 1
    } };

    int n = maze.length;
    int output[][] = new int[n][n];
    if (solveMaze(maze, output, 0, 0, n) == true) {
      printSol(output, n);
    } else {
      System.out.println("solutio not exists");
    }
  }
}
