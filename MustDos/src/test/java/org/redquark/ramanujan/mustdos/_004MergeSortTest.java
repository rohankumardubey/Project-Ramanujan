package org.redquark.ramanujan.mustdos;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

/**
 * @author Anirudh Sharma
 *
 */
class _004MergeSortTest {

	private _004MergeSort mergeSort = new _004MergeSort();

	/**
	 * Test method for
	 * {@link org.redquark.ramanujan.mustdos._004MergeSort#sort(int[], int, int)}.
	 */
	@Test
	void testSort() {
		int[] a = new int[] { 0, 5, 9, 2, 1, 3, 4, 8, 6, 7 };
		int[] expected = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		assertArrayEquals(expected, mergeSort.sort(a, 0, a.length - 1));

		a = new int[] { 64, 34, 25, 12, 22, 11, 90 };
		expected = new int[] { 11, 12, 22, 25, 34, 64, 90 };
		assertArrayEquals(expected, mergeSort.sort(a, 0, a.length - 1));
	}

}
