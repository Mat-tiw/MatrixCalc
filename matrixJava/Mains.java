import java.util.Scanner;

public class Mains {

  public static void main(String[] args) {
    Scanner kin = new Scanner(System.in);
    int userInput = 3;
    martixCalc n = new martixCalc(userInput);
    n.printMatrix_containder();
    for (int i = 0; i < userInput; i++) {
      for (int j = 0; j < userInput; j++) {
        System.out.print(
          "input value " + "current position " + i + " " + j + " : "
        );
        int value = kin.nextInt();
        n.PopulateMartixWithInt(i, j, value);
      }
    }
    n.printMatrix_containder();
  }
}
