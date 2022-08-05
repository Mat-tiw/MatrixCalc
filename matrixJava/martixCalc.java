public class martixCalc {

  private int[][] martixGenarate;
  private int dimensionInput;

  public martixCalc(int dimensionInput) {
    this.dimensionInput = dimensionInput;
    CreateAndFillMartix();
  }

  public void printMatrix_containder() {
    if(dimensionInput == 3){
      System.out.print(
      martixGenarate[0][0] +
      " " +
      martixGenarate[0][1] +
      " " +
      martixGenarate[0][2] +
      "\n"
    );
    System.out.print(
      martixGenarate[1][0] +
      " " +
      martixGenarate[1][1] +
      " " +
      martixGenarate[1][2] +
      "\n"
    );
    System.out.print(
      martixGenarate[2][0] +
      " " +
      martixGenarate[2][1] +
      " " +
      martixGenarate[2][2] +
      "\n"
    );
    }else{
      System.out.print(martixGenarate[0][0]+" "+martixGenarate[0][1]+"\n");
      System.out.println(martixGenarate[1][0]+" "+martixGenarate[0][1]);
    }
  }

  void CreateAndFillMartix() {
    int[][] newMartix = new int[dimensionInput][dimensionInput];
    for (int i = 0; i < dimensionInput; i++) {
      for (int j = 0; j < dimensionInput; j++) {
        newMartix[i][j] = 0;
      }
    }
    martixGenarate = newMartix;
  }

  public int[][] returnMartixOut() {
    return martixGenarate;
  }

  public void PopulateMartixWithInt(int x, int y, int value) {
    martixGenarate[x][y] = value;
  }
  void Calc2DMatrixDet(){
    if(dimensionInput == 2){int topHalf = martixGenarate[0][0]*martixGenarate[1][1];
      int underHalf = martixGenarate[1][0]*martixGenarate[0][1];
      int det = topHalf-underHalf;
      System.out.println(det);}
      return;
  }
}
