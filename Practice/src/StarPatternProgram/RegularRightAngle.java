package StarPatternProgram;

public class RegularRightAngle {
	public static void main(String[] args) {
		
		
		// *
				// **
				// ***
				int star = 1;

				for (int row = 1; row <= 5; row++) {
					for (int col = 1; col <= star; col++) {
						System.out.print(" *");
					}
					System.out.println(); //this line move cursor next line
					star++;
				}
				
				
//				int Space=4;    // mirror image
//				for(int row=1; row<=5; row++) {
//					for(int col=1; col<=Space;col++) {
//					System.out.print("  ");
//					}
//					for(int col=1; col<=star;col++) {
//						System.out.print(" *");
//					}
//					System.out.println();
//					star++; 
//					Space--;
//				}
				
				
				
//				int star=5, space=0;    //water image of reverce triangle
//				
//				for(int row=1; row<=5; row++) {
//					for(int col=1; col<=space;col++) {
//						System.out.print("  ");
//					}
//					for(int col=1; col<=star;col++) {
//						System.out.print(" *");
//					}
//					System.out.println();
//					star--; 
//					space= space+1;
//				}
//				

	}

}
