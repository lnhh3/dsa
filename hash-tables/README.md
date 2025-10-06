# Hash Tables

## Overview
Hash tables (Hash Maps, Dictionaries) store key-value pairs with fast lookup, insertion, and deletion.

## Key Concepts
- **Hash Function**: Converts key to index
- **Collision Handling**:
  - Chaining (linked lists)
  - Open Addressing (linear/quadratic probing, double hashing)
- **Load Factor**: n/m (entries/buckets)
- **Rehashing**: Resize when load factor exceeds threshold

## Time Complexity
- Average: O(1) for insert, delete, search
- Worst: O(n) when many collisions

## Use Cases
- Fast lookup by key
- Counting frequencies
- Caching/memoization
- Detecting duplicates
- Grouping related items

## Common Problems
- Two Sum
- Group Anagrams
- Valid Anagram
- Longest Substring Without Repeating Characters
- Top K Frequent Elements
- LRU Cache
- Design HashMap

## Related Data Structures
- **HashSet**: Stores unique elements (keys only)
- **HashMap**: Stores key-value pairs
- **LinkedHashMap**: Maintains insertion order
- **TreeMap**: Sorted order (using BST, not hash-based)

## Tips
- Use for O(1) lookups and frequency counting
- Consider space-time tradeoff
- Good for deduplication and caching
