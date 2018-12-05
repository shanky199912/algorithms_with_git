# Selection Sort
Selection sort is a simple sorting algorithim.
The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning.
The algorithm maintains two subarrays in a given array.
1) The subarray which is already sorted.
2) Remaining subarray which is unsorted.

In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.


### Input Format
Enter the size of the array in the first line.
In the second line enter the elements of the array.

### Output Format
The first line of the output contains the size of the array.
The second line of the output contains the elements of the array.
The third part of output displays the sorted elements of the array in a single line.

### Sample Input
```
Enter the size of array : 5
Enter the elements of the array :
2
5
4
8
6
```

### Output Format
```
The sorted array is : 2 4 5 6 8
```
### Implemented in
- [Java](SelectionSort.java)
