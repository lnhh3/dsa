# Graphs

## Overview
A graph is a collection of nodes (vertices) connected by edges.

## Types
- Directed vs Undirected
- Weighted vs Unweighted
- Cyclic vs Acyclic (DAG)
- Connected vs Disconnected

## Representation
- Adjacency Matrix
- Adjacency List
- Edge List

## Key Algorithms
- **BFS** (Breadth-First Search) - shortest path in unweighted graph
- **DFS** (Depth-First Search) - exploring all paths
- **Dijkstra's Algorithm** - shortest path in weighted graph
- **Bellman-Ford** - shortest path with negative weights
- **Floyd-Warshall** - all pairs shortest path
- **Kruskal's/Prim's** - Minimum Spanning Tree
- **Topological Sort** - for DAGs

## Common Problems
- Number of Islands
- Clone Graph
- Course Schedule (topological sort)
- Network Delay Time
- Word Ladder

## Time Complexity
- BFS/DFS: O(V + E) where V = vertices, E = edges
- Dijkstra: O((V + E) log V) with heap
