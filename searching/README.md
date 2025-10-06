# Searching Algorithms

## Overview
Searching algorithms find the position of a target value within a data structure.

## Common Algorithms

### Linear Search
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Use Case**: Unsorted data, small datasets

### Binary Search
- **Time Complexity**: O(log n)
- **Space Complexity**: O(1) iterative, O(log n) recursive
- **Requirement**: Sorted data
- **Use Case**: Large sorted datasets

### Binary Search Variations
- Find first/last occurrence
- Find insertion position
- Search in rotated sorted array
- Find peak element
- Search in 2D matrix

## Common Problems
- Binary Search
- Search in Rotated Sorted Array
- Find First and Last Position
- Search a 2D Matrix
- Find Minimum in Rotated Sorted Array

## Tips
- Always check if data is sorted before using binary search
- Watch for integer overflow: use `mid = left + (right - left) / 2`
- Practice boundary conditions (left, right, mid)
