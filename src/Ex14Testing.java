import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for Mman 14
 *
 * @author Daniel Wong
 * @version 15.05.2022
 * @link https://wongi.io/
 */

public class Ex14Testing {

    @Test
    @DisplayName("Testing Q1: findValWhat")
    public void findValWhat() {
        int[][] a1 = new int[][]{{Integer.MIN_VALUE, 2, 3}, {2, 2, 3}, {4, 5, Integer.MAX_VALUE}};
        assertTrue(Ex14.findValWhat(a1, Integer.MIN_VALUE), "\nArray: \n" + arr2d2str(a1));
        assertTrue(Ex14.findValWhat(a1, 2), "\nArray: \n" + arr2d2str(a1));
        assertTrue(Ex14.findValWhat(a1, 3), "\nArray: \n" + arr2d2str(a1));
        assertTrue(Ex14.findValWhat(a1, 4), "\nArray: \n" + arr2d2str(a1));
        assertTrue(Ex14.findValWhat(a1, 5), "\nArray: \n" + arr2d2str(a1));
        assertTrue(Ex14.findValWhat(a1, Integer.MAX_VALUE), "\nArray: \n" + arr2d2str(a1));
        assertFalse(Ex14.findValWhat(a1, 7), "\nArray: \n" + arr2d2str(a1));
        assertFalse(Ex14.findValWhat(a1, 999), "\nArray: \n" + arr2d2str(a1));

        int[][] a2 = new int[][]{{-99, -98, -97, -96, 0, 1, 2, 3}, {-98, -98, -97, -96, 1, 12, 13, 14}, {-97, -96, -95, -94, 2, 13, 22, 33}, {-96, -1, 0, 1, 3, 23, 32, 43}, {-95, 55, 56, 57, 58, 59, 60, 61}, {-94, 56, 56, 58, 66, 69, 72, 73}, {-93, 57, 57, 58, 67, 70, 82, 83}, {0, 57, 57, 59, 100, 200, 400, 800}};
        assertTrue(Ex14.findValWhat(a2, -99), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, -98), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, -97), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, -96), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, -95), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, -94), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, -93), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, -1), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 0), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 1), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 2), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 3), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 12), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 13), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 14), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 22), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 23), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 32), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 43), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 55), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 56), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 57), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 58), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 59), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 60), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 61), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 66), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 69), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 70), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 72), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 73), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 82), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 83), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 100), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 200), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 400), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValWhat(a2, 800), "\nArray: \n" + arr2d2str(a2));

        assertTrue(what(a1), "\nArray: \n" + arr2d2str(a1));
        assertTrue(what(a2), "\nArray: \n" + arr2d2str(a2));

    }

    @Test
    @DisplayName("Testing Q1: findValTest")
    public void findValTest() {
        int[][] a1 = new int[][]{{1, 2, 3}, {3, 3, 3}, {4, 5, 6}};
        assertTrue(Ex14.findValTest(a1, 1), "\nArray: \n" + arr2d2str(a1));
        assertTrue(Ex14.findValTest(a1, 2), "\nArray: \n" + arr2d2str(a1));
        assertTrue(Ex14.findValTest(a1, 3), "\nArray: \n" + arr2d2str(a1));
        assertTrue(Ex14.findValTest(a1, 4), "\nArray: \n" + arr2d2str(a1));
        assertTrue(Ex14.findValTest(a1, 5), "\nArray: \n" + arr2d2str(a1));
        assertTrue(Ex14.findValTest(a1, 6), "\nArray: \n" + arr2d2str(a1));
        assertFalse(Ex14.findValTest(a1, -7), "\nArray: \n" + arr2d2str(a1));
        assertFalse(Ex14.findValTest(a1, 7), "\nArray: \n" + arr2d2str(a1));
        assertFalse(Ex14.findValTest(a1, 999), "\nArray: \n" + arr2d2str(a1));
        assertFalse(Ex14.findValTest(a1, Integer.MIN_VALUE), "\nArray: \n" + arr2d2str(a1));
        assertFalse(Ex14.findValTest(a1, Integer.MAX_VALUE), "\nArray: \n" + arr2d2str(a1));

        int[][] a2 = new int[][]{{-1, 6, -2, 3, 4}, {7, 9, 8, 11, 8}, {14, 15, 13, 16, 12}, {18, 20, 17, 20, 25}, {136, 135, 134, 133, 132},};
        assertTrue(Ex14.findValTest(a2, -1), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValTest(a2, 6), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValTest(a2, -2), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValTest(a2, 3), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValTest(a2, 4), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValTest(a2, 7), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValTest(a2, 9), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValTest(a2, 8), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValTest(a2, 11), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValTest(a2, 14), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValTest(a2, 15), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValTest(a2, 13), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValTest(a2, 16), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValTest(a2, 12), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValTest(a2, 18), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValTest(a2, 20), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValTest(a2, 17), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValTest(a2, 25), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValTest(a2, 136), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValTest(a2, 135), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValTest(a2, 134), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValTest(a2, 133), "\nArray: \n" + arr2d2str(a2));
        assertTrue(Ex14.findValTest(a2, 132), "\nArray: \n" + arr2d2str(a2));
        assertFalse(Ex14.findValTest(a2, 5), "\nArray: \n" + arr2d2str(a2));
        assertFalse(Ex14.findValTest(a2, 999), "\nArray: \n" + arr2d2str(a2));
        assertFalse(Ex14.findValTest(a2, Integer.MIN_VALUE), "\nArray: \n" + arr2d2str(a2));
        assertFalse(Ex14.findValTest(a2, Integer.MAX_VALUE), "\nArray: \n" + arr2d2str(a2));

        int[][] a3 = new int[][]{{0, -2, -1, 2, 0, -5, 5, 5}, {21, 21, 7, 7, 7, 21, 21, 21}, {21, 21, 21, 21, 21, 21, 21, 21}, {21, 21, 23, 42, 41, 23, 21, 21}, {60, 56, 57, 58, 53, 52, 47, 51}, {61, 65, 70, 72, 73, 78, 82, 98}, {112, 121, 112, 134, 123, 100, 98, 111}, {136, 136, 136, 134, 147, 150, 154, 134}};
        assertTrue(Ex14.findValTest(a3, -2), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, -1), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 0), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 2), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 5), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 7), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 21), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 23), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 41), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 42), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 47), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 52), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 53), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 56), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 57), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 58), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 60), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 61), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 65), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 70), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 72), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 73), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 78), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 82), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 98), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 100), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 111), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 112), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 121), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 123), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 134), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 136), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 147), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 150), "\nArray: \n" + arr2d2str(a3));
        assertTrue(Ex14.findValTest(a3, 154), "\nArray: \n" + arr2d2str(a3));
        assertFalse(Ex14.findValTest(a3, -55), "\nArray: \n" + arr2d2str(a3));
        assertFalse(Ex14.findValTest(a3, 999), "\nArray: \n" + arr2d2str(a3));
        assertFalse(Ex14.findValTest(a3, Integer.MIN_VALUE), "\nArray: \n" + arr2d2str(a3));
        assertFalse(Ex14.findValTest(a3, Integer.MAX_VALUE), "\nArray: \n" + arr2d2str(a3));

        int[][] a4 = new int[][]{{-5, 6, -2, 3, 4}, {7, 9, 8, 11, 8}, {14, 14, 14, 14, 12}, {14, 20, 17, 20, 25}, {136, 135, 134, 133, 132},};

        assertTrue(Ex14.findValTest(a4, -5), "\nArray: \n" + arr2d2str(a4));
        assertTrue(Ex14.findValTest(a4, 6), "\nArray: \n" + arr2d2str(a4));
        assertTrue(Ex14.findValTest(a4, -2), "\nArray: \n" + arr2d2str(a4));
        assertTrue(Ex14.findValTest(a4, 3), "\nArray: \n" + arr2d2str(a4));
        assertTrue(Ex14.findValTest(a4, 4), "\nArray: \n" + arr2d2str(a4));
        assertTrue(Ex14.findValTest(a4, 7), "\nArray: \n" + arr2d2str(a4));
        assertTrue(Ex14.findValTest(a4, 9), "\nArray: \n" + arr2d2str(a4));
        assertTrue(Ex14.findValTest(a4, 8), "\nArray: \n" + arr2d2str(a4));
        assertTrue(Ex14.findValTest(a4, 11), "\nArray: \n" + arr2d2str(a4));
        assertTrue(Ex14.findValTest(a4, 14), "\nArray: \n" + arr2d2str(a4));
        assertTrue(Ex14.findValTest(a4, 12), "\nArray: \n" + arr2d2str(a4));
        assertTrue(Ex14.findValTest(a4, 20), "\nArray: \n" + arr2d2str(a4));
        assertTrue(Ex14.findValTest(a4, 17), "\nArray: \n" + arr2d2str(a4));
        assertTrue(Ex14.findValTest(a4, 25), "\nArray: \n" + arr2d2str(a4));
        assertTrue(Ex14.findValTest(a4, 136), "\nArray: \n" + arr2d2str(a4));
        assertTrue(Ex14.findValTest(a4, 135), "\nArray: \n" + arr2d2str(a4));
        assertTrue(Ex14.findValTest(a4, 134), "\nArray: \n" + arr2d2str(a4));
        assertTrue(Ex14.findValTest(a4, 133), "\nArray: \n" + arr2d2str(a4));
        assertTrue(Ex14.findValTest(a4, 132), "\nArray: \n" + arr2d2str(a4));
        assertFalse(Ex14.findValTest(a4, 5), "\nArray: \n" + arr2d2str(a4));
        assertFalse(Ex14.findValTest(a4, 999), "\nArray: \n" + arr2d2str(a4));
        assertFalse(Ex14.findValTest(a4, Integer.MIN_VALUE), "\nArray: \n" + arr2d2str(a4));
        assertFalse(Ex14.findValTest(a4, Integer.MAX_VALUE), "\nArray: \n" + arr2d2str(a4));

        assertTrue(test(a1), "\nArray: \n" + arr2d2str(a1));
        assertTrue(test(a2), "\nArray: \n" + arr2d2str(a2));
        assertTrue(test(a3), "\nArray: \n" + arr2d2str(a3));
        assertTrue(test(a4), "\nArray: \n" + arr2d2str(a4));

    }

    @Test
    @DisplayName("Testing Q2: strictlyIncreasing")
    public void strictlyIncreasing() {
        int[] a1 = {1, 2, 4, 4, 5};
        assertEquals(4, Ex14.strictlyIncreasing(a1), "\nArray: \n" + arr2str(a1));
        int[] a2 = {1, 3, 2};
        assertEquals(1, Ex14.strictlyIncreasing(a2), "\nArray: \n" + arr2str(a2));
        int[] a3 = {5, 4, 3, 2, 1};
        assertEquals(0, Ex14.strictlyIncreasing(a3), "\nArray: \n" + arr2str(a3));
        int[] a4 = {5, 5, 5, 1, 2};
        assertEquals(1, Ex14.strictlyIncreasing(a4), "\nArray: \n" + arr2str(a4));
    }

    @Test
    @DisplayName("Testing Q3: longestFlatSequence")
    public void longestFlatSequence() {
        int[] a1 = {4, 4};
        assertEquals(2, Ex14.longestFlatSequence(a1), "\nArray: \n" + arr2str(a1));
        int[] a2 = {4, 6};
        assertEquals(1, Ex14.longestFlatSequence(a2), "\nArray: \n" + arr2str(a2));
        int[] a3 = {4, 5, 6, 5, 4, 3};
        assertEquals(3, Ex14.longestFlatSequence(a3), "\nArray: \n" + arr2str(a3));
        int[] a4 = {4, 5, 6, 5, 6, 5};
        assertEquals(5, Ex14.longestFlatSequence(a4), "\nArray: \n" + arr2str(a4));
        int[] a5 = {4, 6, 4};
        assertEquals(1, Ex14.longestFlatSequence(a5), "\nArray: \n" + arr2str(a5));
        int[] a6 = {2, 2, 3, 2};
        assertEquals(4, Ex14.longestFlatSequence(a6), "\nArray: \n" + arr2str(a6));
    }

    @Test
    @DisplayName("Testing Q4: findMaximum")
    public void findMaximum() {
        int[][] a1 = new int[][]{{1, 1, -1, 1, 1}, {1, 0, 0, -1, 1}, {1, 1, 1, 1, -1}, {-1, -1, 1, 1, 1}, {1, 1, -1, -1, 1},};
        assertEquals(9, Ex14.findMaximum(a1), "\nArray: \n" + arr2d2str(a1));
        int[][] a2 = {{1, 1}, {1, 1}};
        assertEquals(4, Ex14.findMaximum(a2), "\nArray: \n" + arr2d2str(a2));
        int[][] a3 = {{-1, -1}, {-1, -1}};
        assertEquals(-1, Ex14.findMaximum(a3), "\nArray: \n" + arr2d2str(a3));
        int[][] a4 = {{-1}, {1}};
        assertEquals(-1, Ex14.findMaximum(a4), "\nArray: \n" + arr2d2str(a4));
        int[][] a5 = {{1}, {1}};
        assertEquals(2, Ex14.findMaximum(a5), "\nArray: \n" + arr2d2str(a5));
        int[][] a6 = {{1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0}};
        assertEquals(6, Ex14.findMaximum(a6), "\nArray: \n" + arr2d2str(a6));
        int[][] a7 = {{0, 1, 0}, {0, 1, -1}, {0, 1, -1}};
        assertEquals(3, Ex14.findMaximum(a7), "\nArray: \n" + arr2d2str(a7));
        int[][] a8 = {{0, -1, 1}, {-1, 1, 0}, {0, 1, -1}};
        assertEquals(0, Ex14.findMaximum(a8), "\nArray: \n" + arr2d2str(a8));
        int[][] a9 = {{0, 1}, {-1, 1}, {-1, 0}};
        assertEquals(2, Ex14.findMaximum(a9), "\nArray: \n" + arr2d2str(a9));
        int[][] a10 = {{1, 1, 0, 1, -1}, {-1, 1, 0, -1, 0}, {-1, 1, 0, -1, -1}};
        assertEquals(4, Ex14.findMaximum(a10), "\nArray: \n" + arr2d2str(a10));
        int[][] a11 = {{1, -1, -1}, {1, 1, 1}, {0, 0, 0}, {1, -1, -1}, {-1, 0, -1}};
        assertEquals(3, Ex14.findMaximum(a11), "\nArray: \n" + arr2d2str(a11));
        int[][] a12 = {{0}, {0}};
        assertEquals(0, Ex14.findMaximum(a12), "\nArray: \n" + arr2d2str(a12));
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
                if (m[x][y] > m[x][y + 1]) return false;
        for (int x = 0; x < n; x++)
            for (int y = 0; y < (n - 1); y++)
                if (m[y][x] > m[y + 1][x]) return false;
        return true;
    }

    public static boolean test(int[][] m) {
        int n = m.length;
        for (int r = 0; r < (n - 1); r++)
            for (int c = 0; c < n; c++)
                for (int i = 0; i < n; i++)
                    if (m[r][c] > m[r + 1][i]) return false;
        return true;
    }
}
