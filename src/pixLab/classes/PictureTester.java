package pixLab.classes;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Jonah Tucker 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorGull()
  {
	  Picture seagull = new Picture("seagull.jpg");
	  seagull.explore();
	  seagull.mirrorGull();
	  seagull.explore();
  }
  
  public static void testMirrorArms()
  {
	  Picture snowman = new Picture("snowman.jpg");
	  snowman.explore();
	  snowman.mirrorArms();
	  snowman.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture koala = new Picture("jenny-red.jpg");
	  koala.explore();
	  koala.mirrorVerticalRightToLeft();
	  koala.explore();
	  koala.zeroBlue();
	  koala.explore();
  }
  
  public static void testMirrorDiagonalTopRightToBottomLeft()
  {
	  Picture koala = new Picture("koala.jpg");
	  koala.explore();
	  koala.mirrorDiagonalTopRightToBottomLeft();
	  koala.explore();
  }
  
  public static void testMirrorDiagonalBottomRightToTopLeft()
  {
	  Picture koala = new Picture("koala.jpg");
	  koala.explore();
	  koala.mirrorDiagonalBottomRightToTopLeft();
	  koala.explore();
	  
  }
  
  public static void testMirrorHorizontalBottomToTop()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.mirrorHorizontalBottomToTop();
	  beach.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
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
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testRandomize()
  {
	  Picture island = new Picture("CumberlandIsland.jpg");
	  island.explore();
	  island.fullRandomBlue();
	  island.explore();
	  island.fullRandomGreen();
	  island.explore();
	 
  }
  
  public static void grayScale()
  {
	  Picture island = new Picture("CumberlandIsland.jpg");
	  island.explore();
	  island.Grayscale();
	  island.explore();
  }
  
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
//     uncomment a call here to run a test
//     and comment out the ones you don't want
//     to run
//	  testMirrorDiagonalTopRightToBottomLeft();
//	  testMirrorDiagonalBottomRightToTopLeft();
//    testZeroBlue();
//    testKeepOnlyBlue();
//    testKeepOnlyRed();
//    testKeepOnlyGreen();
//    testNegate();
//    testGrayscale();
//    testFixUnderwater();
//    testMirrorVertical();
//    testMirrorVerticalRightToLeft();
//    testMirrorHorizontalBottomToTop();
//    testMirrorTemple();
//    testMirrorArms();
//    testMirrorGull();
//    testMirrorDiagonal();
//    testCollage();
//    testCopy();
//	  testEdgeDetection();
//    testEdgeDetection2();
//    testChromakey();
//    testEncodeAndDecode();
//    testGetCountRedOverValue(250);
//    testSetRedToHalfValueInTopHalf();
//    testClearBlueOverValue(200);
//    testGetAverageForColumn(0);
//	  testMirrorGull();
//	  testMirrorArms();
	  testCollage();
//	  testRandomize();
  }
}