# Dynamic Programming

## Overview
Dynamic Programming (DP) is an optimization technique that solves complex problems by breaking them down into simpler subproblems and storing their solutions.

## Key Principles
1. **Optimal Substructure**: Optimal solution contains optimal solutions to subproblems
2. **Overlapping Subproblems**: Same subproblems solved multiple times

## Approaches

### Top-Down (Memoization)
- Start with the original problem
- Recursively break down
- Cache results to avoid recomputation

### Bottom-Up (Tabulation)
- Start with smallest subproblems
- Build up to the final solution
- Usually more efficient (no recursion overhead)

## Common Patterns
- 0/1 Knapsack
- Unbounded Knapsack
- Fibonacci-like sequences
- Longest Common Subsequence
- Longest Increasing Subsequence
- Edit Distance
- Matrix Chain Multiplication
- Subset Sum

## Common Problems
- Climbing Stairs
- House Robber
- Coin Change
- Longest Common Subsequence
- Longest Increasing Subsequence
- Edit Distance
- Maximum Subarray (Kadane's Algorithm)

## Tips
- Identify if a problem has optimal substructure
- Define the state and recurrence relation
- Start with recursive solution, then optimize with memoization
- Convert to bottom-up for better space efficiency
