# Sorting Algorithms

## Overview
Sorting algorithms arrange elements in a specific order (ascending or descending).

## Common Sorting Algorithms

### Comparison-based
- **Bubble Sort** - O(n²) - Simple but inefficient
- **Selection Sort** - O(n²) - Finds minimum each iteration
- **Insertion Sort** - O(n²) - Good for small/nearly sorted data
- **Merge Sort** - O(n log n) - Stable, divide and conquer
- **Quick Sort** - O(n log n) average - In-place, not stable
- **Heap Sort** - O(n log n) - Uses heap data structure

### Non-comparison based
- **Counting Sort** - O(n + k) - For limited range integers
- **Radix Sort** - O(d × n) - Digit by digit sorting
- **Bucket Sort** - O(n + k) - Distributes into buckets

## Key Properties
- **Stability**: Maintains relative order of equal elements
- **In-place**: Uses O(1) extra space
- **Adaptive**: Performs better on partially sorted data

## When to Use
- **Quick Sort**: General purpose, good average performance
- **Merge Sort**: When stability is needed
- **Insertion Sort**: Small datasets or nearly sorted data
- **Heap Sort**: When O(n log n) worst case is required
