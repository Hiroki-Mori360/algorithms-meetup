import java.util.*;

public class Solution5 {
  public static void main(String[] args) {
    Integer n = Integer.parseInt(args[0]);

    Solution5 solution5 = new Solution5();
    // create chessboard
    Chessboard chessboead = solution5.createChessboead(n);
  }

  public Chessboard createChessboead(Integer n) {
    List<Square> squareList = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        squareList.add(new Square(i, j));
      }
    }
    return new Chessboard(squareList);
  }

  private Integer calcNumOf (Square placedPos) {

  }

  public class Square {
    public boolean isDeleted;
    public Integer xPos;
    public Integer yPos;

    public Square(Integer xPos, Integer yPos) {
      this.xPos = xPos;
      this.yPos = yPos;
    }
  }

  public class Chessboard {
    List<Square> squareList;

    Chessboard(List<Square> squareList) {
      this.squareList = squareList;
    }

    public boolean isAllSquareDeleted() {
      for (Square square : squareList) {
        if (!square.isDeleted) {
          return false;
        }
      }
      return true;
    }
  }

  public 
}