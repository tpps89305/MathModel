
public class Main {
	//т 3 蛾丁舼いみ翴
	public static void main(String[] args) {
		
		int ax = 100;
		int ay = 100;
		double ar = 50;
		
		int bx = 160;
		int by = 120;
		double br = 36.06;
		
		int cx = 70;
		int cy = 150;
		double cr = 60.83;
		
		int[][] array = new int[3][3];
		
		array[0][0] = -(2 * ax);
		array[0][1] = -(2 * ay);
		array[0][2] = (int) Math.pow(ax, 2) + (int) Math.pow(ay, 2) - (int ) Math.pow(ar, 2);
		
		array[1][0] = -(2 * bx);
		array[1][1] = -(2 * by);
		array[1][2] = (int) Math.pow(bx, 2) + (int) Math.pow(by, 2) - (int ) Math.pow(br, 2);
		
		array[2][0] = -(2 * cx);
		array[2][1] = -(2 * cy);
		array[2][2] = (int) Math.pow(cx, 2) + (int) Math.pow(cy, 2) - (int ) Math.pow(cr, 2);
		
		int[] ab = new int[3]; // A-B
		ab[0] = array[0][0] - array[1][0]; //Ax - Bx
		ab[1] = array[0][1] - array[1][1]; //Ay - By
		ab[2] = array[0][2] - array[1][2]; //A盽计 - B盽计
		
		//埃 y 玒计
		ab[0] = ab[0] / ab[1];
		ab[2] = ab[2] / ab[1];
		ab[1] = ab[1] / ab[1];
		
		int[] bc = new int[3]; //B-C
		bc[0] = array[1][0] - array[2][0]; //Bx - Cx
		bc[1] = array[1][1] - array[2][1]; //By - Cy
		bc[2] = array[1][2] - array[2][2]; //B盽计 - C盽计
		
		//埃 y 玒计
		bc[0] = bc[0] / bc[1];
		bc[2] = bc[2] / bc[1];
		bc[1] = bc[1] / bc[1];
		
		int x = Math.abs((ab[2] - bc[2]) / (ab[0] - bc[0]));
		System.out.println("X: " + x);
		int y = Math.abs(bc[0] * x + 250);
		System.out.println("Y: " + y);
		System.out.println("3 蛾丁舼いみ翴 (" + x + ", " + y + ")");
		
	}

}
