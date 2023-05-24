
 
  public class Mmn14StudentTester441 {

	public static void main(String[] args) {
		System.out.println("/*=============== Test Start =================\n");

		testQ1What();
		testQ1Test();
		testQ2();
		testQ3();
		testQ4();

		System.out.println("\n=============== Test mmn14 End  =================/");

	}

	private static void testQ1What() {
		System.out.println("=============== test Q1 findValWhat Start =================");
		int[][] a = { { 5, 6, 7, 9 }, { 10, 11, 12, 13 }, { 14, 15, 16, 17 }, { 18, 19, 20, 21 } };
		boolean res = Ex14.findValWhat(a, 13);
		System.out.println("run findValWhat(a, 13) expected " + true + " and got " + res);
		System.out.println("array a = \n" + arr2d2str(a));
		System.out.println("============================== test Q1 findValWhat End =================\n");
	}

	private static void testQ1Test() {
		System.out.println("\n=============== test Q1 findValTest Start =================");
		int[][] a = { { 5, 6, 7, 9 }, { 10, 11, 12, 13 }, { 14, 15, 16, 17 }, { 18, 19, 20, 21 } };
		boolean res = Ex14.findValTest(a, 13);
		System.out.println("run findValTest(a, 13) expected " + true + " and got " + res);
		System.out.println("array a = \n" + arr2d2str(a));
	}

	private static void testQ2() {
		System.out.println("\n=============== test Q2 strictlyIncreasing Start =================");
		int[] a = { 1, 2, 4, 4, 5 };
		int res = Ex14.strictlyIncreasing(a);
		System.out.println("run strictlyIncreasing(a) expected " + 4 + " and got " + res);
		System.out.println("array a = \n" + arr2str(a));
		System.out.println("============================== test Q2 strictlyIncreasing End =================\n");
	}

	 private static void testQ3() {
		System.out.println("\n=============== test Q3 longestFlatSequence  Start =================");
		int[] a = { 4, 5, 6, 5, 4, 3 };
		int res = Ex14.longestFlatSequence(a);
		System.out.println("run longestFlatSequence(a) expected " + 3 + " and got " + res);
		System.out.println("array a = \n" + arr2str(a));
		System.out.println("============================== test Q3 longestFlatSequence  End =================\n");

	}

	private static void testQ4() {
		System.out.println("\n=============== test Q4 findMaximum Start =================");
		int[][] a = { { 1, 1, -1, 1, 1 }, { 1, 0, 0, -1, 1 }, { 1, 1, 1, 1, -1 }, { -1, -1, 1, 1, 1 },
				{ 1, 1, -1, -1, 1 } };

		int res = Ex14.findMaximum(a);
		System.out.println("run findMaximum(a) expected " + 9 + " and got " + res);
		System.out.println("array a= \n" + arr2d2str(a));
		System.out.println("============================== test Q4 findMaximum End =================\n");
	}

	private static String arr2str(int[] a) {
		String str = "{" + a[0];
		for (int i = 1; i < a.length; i++) {
			str += ", " + a[i];
		}
		return str + "}\n";
	}

	private static String arr2d2str(int[][] a) {
		String str = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				str += a[i][j] + "\t";
			}
			str += "\n";
		}
		return str;
	}

	public static boolean what(int[][] m) {
		int n = m.length;
		for (int x = 0; x < n; x++)
			for (int y = 0; y < (n - 1); y++)
				if (m[x][y] > m[x][y + 1])
					return false;
		for (int x = 0; x < n; x++)
			for (int y = 0; y < (n - 1); y++)
				if (m[y][x] > m[y + 1][x])
					return false;
		return true;
	}

	public static boolean test(int[][] m) {
		int n = m.length;
		for (int r = 0; r < (n - 1); r++)
			for (int c = 0; c < n; c++)
				for (int i = 0; i < n; i++)
					if (m[r][c] > m[r + 1][i])
						return false;
		return true;
	}

}
