# Recursion

## Overview
Recursion is a technique where a function calls itself to solve smaller instances of the same problem.

## Key Components
1. **Base Case**: Condition to stop recursion
2. **Recursive Case**: Function calls itself with modified parameters
3. **Progress**: Each recursive call moves toward base case

## Types
- **Direct Recursion**: Function calls itself
- **Indirect Recursion**: Function A calls B, B calls A
- **Tail Recursion**: Recursive call is the last operation

## Common Patterns
- Divide and Conquer
- Backtracking
- Tree/Graph traversal
- Generate permutations/combinations

## Common Problems
- Factorial
- Fibonacci Numbers
- Tower of Hanoi
- Generate Parentheses
- Permutations and Combinations
- Subsets
- N-Queens Problem
- Sudoku Solver

## Time Complexity
Often analyzed using recurrence relations:
- T(n) = T(n-1) + O(1) → O(n)
- T(n) = T(n/2) + O(1) → O(log n)
- T(n) = 2T(n/2) + O(n) → O(n log n)

## Tips
- Always define clear base case(s)
- Ensure progress toward base case
- Draw recursion tree for understanding
- Consider memoization for overlapping subproblems
- Watch for stack overflow with deep recursion
