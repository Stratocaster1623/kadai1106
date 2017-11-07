package kadai1106;

import java.util.Arrays;

import kadai1106.kadai1106_lib;

public class kadai1106_main {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		double a[][]= {{1,2},{-1,1}};
		double b[][]= {{3,-1},{2,1}};
				
		kadai1106_lib mlib = new kadai1106_lib();
		
		System.out.println("Product =" + Arrays.deepToString(mlib.getProduct(a,b)));
		double c[][] = { { 3, 1, 1, 2 },{ 5, 1, 3, 4 },{ 2, 0, 1, 0 },{ 1, 3, 2, 1 }};
		System.out.println("Cofactor = "+ (mlib.getCofactor(c)));
		System.out.println("Inverse = "+ Arrays.deepToString(mlib.getInverse(c)));
		double d[][] = { { 1, 1, 1, 1 }, { 1, 1, 1, -1 }, { 1, 1, -1, 1 }, { 1, -1, 1, 1 } };
		double e[] = { 0, 4, -4, 2 };
		System.out.println("Solution = "+ Arrays.toString(mlib.getSolution(d, e)));


}
}
