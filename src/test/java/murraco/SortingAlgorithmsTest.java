package murraco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import murraco.BubbleSort;
import murraco.Heapsort;
import murraco.InsertionSort;
import murraco.MergeSort;
import murraco.Quicksort;
import murraco.SelectionSort;

public class SortingAlgorithmsTest {

  @Test
  public void testBubbleSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    BubbleSort.bubbleSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testInsertionSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    InsertionSort.insertionSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testSelectionSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    SelectionSort.selectionSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testMergeSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    MergeSort.mergeSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testHeapsort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    Heapsort.heapSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testQuicksort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    Quicksort.quickSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testmaxHeapify() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    Heapsort.maxHeapify(data, 1, data.length - 1);
    assertEquals("[4, 11, 0, 99, 7, 5, 15, 12, 3, 1]", Arrays.toString(data));
 }

  @Test //This fails
  public void testMergeSortStrings() {
    final String[] data = {"banana", "apple", "cherry", "dates"};
    MergeSort.mergeSort(data);
    assertEquals("[apple, banana, cherry, dates]",    Arrays.toString(data));
  }

  @Test
  public void testBubbleSortSingleElementArray() {
    final Integer[] data = {4};
    BubbleSort.bubbleSort(data);
    assertEquals("[4]", Arrays.toString(data));
  }

  @Test
  public void testBubbleSortPositiveAndNegative() {
    final Integer[] data = {-4, -3, 0, -11, 7, 5, 15, 12, 99, 1};
    BubbleSort.bubbleSort(data);
    assertEquals("[-11, -4, -3, 0, 1, 5, 7, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testBubbleSortEqualElements() {
    final Integer[] data = {5, 5, 5, 5, 5};
    BubbleSort.bubbleSort(data);
    assertEquals("[5, 5, 5, 5, 5]", Arrays.toString(data));
  }

  @Test
  public void testBubbleSortEmptyArray() {
    final Integer[] data = {};
    BubbleSort.bubbleSort(data);
    assertTrue("Array should be empty", data.length == 0);
  }

  @Test
  public void testInsertionSortWithNegativeValues() {
    Integer[] data = {-3, 0, -1, -4, -2};
    InsertionSort.insertionSort(data);
    assertEquals("[-4, -3, -2, -1, 0]", Arrays.toString(data));
  }

  @Test
  public void testSelectionSortAlreadySortedArray() {
    Integer[] data = {1, 2, 3, 4, 5};
    SelectionSort.selectionSort(data);
    assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(data));
  }

  @Test
  public void testMergeSortReverseSortedArray() {
    Integer[] data = {5, 4, 3, 2, 1};
    MergeSort.mergeSort(data);
    assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(data));
  }

@Test //This fails
  public void testMergeSortWithNonInteger() {
    final Double[] data = {3.1, -2.5, 0.0, 4.6};
    MergeSort.mergeSort(data);
    assertEquals("[-2.5, 0.0, 3.1, 4.6]", Arrays.toString(data));
  }
}
