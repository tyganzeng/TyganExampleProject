/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("C:\\Users\\zengt9949\\Desktop\\APCSA-Tygan\\Unit16\\src\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("C:\\Users\\zengt9949\\Desktop\\APCSA-Tygan\\Unit16\\src\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C:\\Users\\zengt9949\\Desktop\\APCSA-Tygan\\Unit16\\src\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("C:\\Users\\zengt9949\\Desktop\\APCSA-Tygan\\Unit16\\src\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testKeepOnlyBlue(){
	  Picture beach = new Picture("C:\\Users\\zengt9949\\Desktop\\APCSA-Tygan\\Unit16\\src\\beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  
  public static void testNegate(){
	  Picture beach = new Picture("C:\\Users\\zengt9949\\Desktop\\APCSA-Tygan\\Unit16\\src\\beach.jpg");
	  beach.explore();
	  beach.negate();
	  beach.explore();
  }
  public static void testGrayscale(){
	  Picture beach = new Picture("C:\\Users\\zengt9949\\Desktop\\APCSA-Tygan\\Unit16\\src\\beach.jpg");
	  beach.explore();
	  beach.grayscale();
	  beach.explore();
  }
  
  public static void testFixUnderwater(){
	  Picture fish = new Picture("C:\\Users\\zengt9949\\Desktop\\APCSA-Tygan\\Unit16\\src\\water.jpg");
	  fish.explore();
	  fish.fixUnderwater();
	  fish.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("C:\\Users\\zengt9949\\Desktop\\APCSA-Tygan\\Unit16\\src\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture motorcycle = new Picture("C:\\Users\\zengt9949\\Desktop\\APCSA-Tygan\\Unit16\\src\\redMotorcycle.jpg");
    motorcycle.explore();
    motorcycle.mirrorHorizontal();
    motorcycle.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
    Picture motorcycle = new Picture("C:\\Users\\zengt9949\\Desktop\\APCSA-Tygan\\Unit16\\src\\redMotorcycle.jpg");
    motorcycle.explore();
    motorcycle.mirrorHorizontalBotToTop();
    motorcycle.explore();
  }
  public static void testMirrorDiagonal(){
	  Picture beach = new Picture("C:\\Users\\zengt9949\\Desktop\\APCSA-Tygan\\Unit16\\src\\beach.jpg");
	  beach.explore();
	  beach.mirrorDiagonal();
	  beach.explore();
  }
  
  public static void testMirrorArms(){
	  Picture snowman = new Picture("C:\\Users\\zengt9949\\Desktop\\APCSA-Tygan\\Unit16\\src\\snowman.jpg");
	  snowman.explore();
	  snowman.mirrorArms();
	  snowman.explore();
  }
  
  public static void testMirrorGull(){
	  Picture seagull = new Picture("C:\\Users\\zengt9949\\Desktop\\APCSA-Tygan\\Unit16\\src\\seagull.jpg");
	  seagull.explore();
	  seagull.mirrorGull();
	  seagull.explore();
  }
  
  public static void testCopy()
  {
    Picture canvas = new Picture("C:\\Users\\zengt9949\\Desktop\\APCSA-Tygan\\Unit16\\src\\640x480.jpg");
    Picture flower1 = new Picture("C:\\Users\\zengt9949\\Desktop\\APCSA-Tygan\\Unit16\\src\\flower1.jpg");
    canvas.copy(flower1, 0, 10, 0, 80, 110, 110);
    canvas.explore();
  }
  
  public static void testMyCollage(){
	  Picture canvas = new Picture("C:\\Users\\zengt9949\\Desktop\\APCSA-Tygan\\Unit16\\src\\640x480.jpg");
	  canvas.myCollage();
	  canvas.explore();
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue(); done
    //testKeepOnlyBlue(); done
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate(); done
    //testGrayscale(); done
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
	//testMirrorDiagonal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
	//testMyCollage();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}