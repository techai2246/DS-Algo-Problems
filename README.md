# DS-Algo-Problems 🚀

A comprehensive collection of **LeetCode Easy Level** Data Structures and Algorithms problems solved in Java. This repository contains well-organized solutions with multiple approaches and detailed complexity analysis.

## 📚 Project Overview

This is a learning repository containing **21 carefully selected algorithmic problems** organized by difficulty level. Each solution demonstrates clean code practices with detailed explanations and complexity analysis. Perfect for interview preparation and understanding fundamental CS concepts.

**Total Problems:** 21 | **Difficulty:** Easy | **Language:** Java

## 📁 Project Structure

```
DS-Algo-Problems/
├── README.md
└── src/main/java/com/techai2246/leetcode/easy/
    ├── BinaryAdditionProblem.java
    ├── ClimbStairsProblem.java
    ├── DeleteDuplicateNode.java
    ├── FindIndexOfFirstString.java
    ├── LengthOfLastWord.java
    ├── ListNode.java (Helper class)
    ├── LongestCommonStringPrefix.java
    ├── MergeTwoSortedArray.java
    ├── MergeTwoSortedList.java
    ├── PalindromeProblem.java
    ├── PlusOneProblem.java
    ├── RemoveDuplicateFromSortedArray.java
    ├── RemoveElement.java
    ├── RomanToInteger.java
    ├── SameTreeChecker.java
    ├── SearchInsertPosition.java
    ├── Solution2SumProblem.java
    ├── SquareRootOfNumber.java
    ├── TreeInorderTraversal.java
    ├── TreeNode.java (Helper class)
    └── ValidParenthesesProblem.java
```

---

## 🔑 Problems by Category

### 📊 Array Problems

#### 1. **2Sum Problem** (`Solution2SumProblem.java`)
Find two numbers in an array that add up to a target sum and return their indices.

**Approaches:**
- **Brute Force:** Nested loop comparing all pairs → O(n²) time, O(1) space
- **Optimal:** Using ArrayList lookup → O(n) time, O(n) space

**Example:**
```
Input: nums = [2, 4, 11, 3], target = 6
Output: [0, 1]
```

---

#### 2. **Merge Two Sorted Array** (`MergeTwoSortedArray.java`)
Merge two sorted arrays into a single sorted array.

**Algorithm:**
- Use two pointers to compare elements from both arrays
- Create temporary array and merge in sorted order
- Copy back to original array

**Complexity:**
- Time: O(m + n) where m, n are array sizes
- Space: O(m + n)

**Example:**
```
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
```

---

#### 3. **Remove Duplicate From Sorted Array** (`RemoveDuplicateFromSortedArray.java`)
Remove duplicates from a sorted array and return the length of unique elements.

**Algorithm:**
- Iterate through array and track unique count
- Compare with previous element to identify duplicates
- Move unique elements forward

**Complexity:**
- Time: O(n)
- Space: O(n)

**Example:**
```
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5 (array becomes [0,1,2,3,4,...])
```

---

#### 4. **Remove Element** (`RemoveElement.java`)
Remove all occurrences of a value and return the length of modified array.

**Algorithm:**
- Iterate through array and collect non-matching elements
- Rearrange elements in-place

**Complexity:**
- Time: O(n)
- Space: O(n)

**Example:**
```
Input: nums = [3,2,2,3], val = 3
Output: 2 (array becomes [2,2,...])
```

---

#### 5. **Plus One Problem** (`PlusOneProblem.java`)
Add one to a number represented as an array of digits.

**Algorithm:**
- Add 1 to the last digit
- Handle carry propagation from right to left
- Expand array if necessary

**Complexity:**
- Time: O(n)
- Space: O(n)

**Example:**
```
Input: digits = [1,2,3]
Output: [1,2,4]

Input: digits = [9,9,9]
Output: [1,0,0,0]
```

---

#### 6. **Search Insert Position** (`SearchInsertPosition.java`)
Find the index where a target value exists, or where it should be inserted.

**Algorithm:**
- Use optimized linear search with boundary checks
- Compare target with mid point to partition search space
- Find exact position or insertion point

**Complexity:**
- Time: O(n) in worst case (can be optimized to O(log n) with binary search)
- Space: O(1)

**Example:**
```
Input: nums = [1,3,5,6], target = 5
Output: 2

Input: nums = [1,3,5,6], target = 7
Output: 4
```

---

### 🔗 Linked List Problems

#### 7. **Merge Two Sorted List** (`MergeTwoSortedList.java`)
Merge two sorted linked lists into a single sorted list.

**Algorithm:**
- Traverse both lists simultaneously
- Compare node values and link smaller value
- Append remaining nodes

**Complexity:**
- Time: O(n + m) where n, m are list sizes
- Space: O(n + m) for new list

**Example:**
```
List1: 1→2→4
List2: 1→3→4
Output: 1→1→2→3→4→4
```

---

#### 8. **Delete Duplicate Node** (`DeleteDuplicateNode.java`)
Remove consecutive duplicate nodes from a sorted linked list.

**Algorithm:**
- Track previous and current nodes
- Compare values and skip duplicate nodes
- Update next pointers to bypass duplicates

**Complexity:**
- Time: O(n)
- Space: O(1)

**Example:**
```
Input: 1→1→1
Output: 1
```

---

### 📝 String Problems

#### 9. **Valid Parentheses** (`ValidParenthesesProblem.java`)
Validate if a string with parentheses, brackets, and braces is correctly matched.

**Algorithm:**
- Use Stack data structure
- Push opening characters
- Pop and validate closing characters match

**Complexity:**
- Time: O(n)
- Space: O(n)

**Example:**
```
Input: "{[]}"
Output: true

Input: "{[](}"
Output: false
```

---

#### 10. **Longest Common String Prefix** (`LongestCommonStringPrefix.java`)
Find the longest common prefix among all strings in an array.

**Algorithm:**
- Compare characters at each position across all strings
- Stop at first mismatch or end of string

**Complexity:**
- Time: O(n × m) where n = strings count, m = prefix length
- Space: O(m)

**Example:**
```
Input: ["flower", "flow", "flight"]
Output: "fl"
```

---

#### 11. **Palindrome Problem** (`PalindromeProblem.java`)
Check if an integer is a palindrome.

**Approaches:**
- **String Reversal:** Convert and compare → O(n) time, O(n) space
- **Two Pointer:** Compare from both ends → O(n) time, O(n) space

**Example:**
```
Input: 121
Output: true

Input: 123
Output: false
```

---

#### 12. **Roman to Integer** (`RomanToInteger.java`)
Convert a Roman numeral string to an integer.

**Algorithm:**
- Map Roman characters to values using HashMap
- Handle special cases (IV, IX, XL, XC, CD, CM)
- Sum the values with special case adjustments

**Roman Values:** I=1, V=5, X=10, L=50, C=100, D=500, M=1000

**Complexity:**
- Time: O(n)
- Space: O(1)

**Example:**
```
Input: "MCMXCIV"
Output: 1994
```

---

#### 13. **Find Index Of First String** (`FindIndexOfFirstString.java`)
Find the first occurrence of a substring (needle) in a string (haystack).

**Algorithm:**
- Iterate through haystack
- Check if substring matches at each position
- Return index of first match

**Complexity:**
- Time: O(n × m) where n = haystack length, m = needle length
- Space: O(1)

**Example:**
```
Input: haystack = "hello", needle = "ll"
Output: 2
```

---

#### 14. **Length Of Last Word** (`LengthOfLastWord.java`)
Find the length of the last word in a string.

**Approaches:**
- **Split Method:** Split by spaces and get last word → O(n) time
- **Optimal:** Iterate from end, count until space → O(n) time, O(1) extra space

**Complexity:**
- Time: O(n)
- Space: O(1)

**Example:**
```
Input: "   fly me   to   the moon  "
Output: 4 (word "moon")
```

---

### 🔢 Math & Number Problems

#### 15. **Binary Addition Problem** (`BinaryAdditionProblem.java`)
Add two binary numbers represented as strings.

**Algorithm:**
- Process from right to left
- Handle carry propagation
- Build result string in reverse

**Complexity:**
- Time: O(max(len(a), len(b)))
- Space: O(max(len(a), len(b)))

**Example:**
```
Input: a = "11", b = "1"
Output: "100"
```

---

#### 16. **Square Root Of Number** (`SquareRootOfNumber.java`)
Find the integer square root using Newton's Theorem.

**Algorithm:**
- Use Newton's iterative method for square root approximation
- Refine approximation through recursion
- Return integer floor of square root

**Complexity:**
- Time: O(log n) with 30 iterations
- Space: O(1) amortized

**Example:**
```
Input: 8
Output: 2

Input: 4
Output: 2
```

---

### 🔄 Dynamic Programming

#### 17. **Climb Stairs Problem** (`ClimbStairsProblem.java`)
Count the number of ways to climb n stairs (you can take 1 or 2 steps at a time).

**Algorithm:**
- Use dynamic programming with bottom-up approach
- For each stair, sum ways to reach it from previous two stairs
- Fibonacci sequence pattern

**Complexity:**
- Time: O(n)
- Space: O(n)

**Example:**
```
Input: n = 3
Output: 3
Explanation: 1+1+1, 1+2, 2+1
```

---

### 🌳 Tree Problems

#### 19. **Same Tree Checker** (`SameTreeChecker.java`)
Check if two binary trees are identical in structure and values.

**Algorithm:**
- Use recursive approach to compare both trees simultaneously
- Base case: both nodes are null (identical subtrees)
- Check if one node is null and other isn't (different)
- Check if node values match
- Recursively check left and right subtrees

**Complexity:**
- Time: O(n) where n is minimum number of nodes in both trees
- Space: O(h) where h is height (recursion stack)

**Example:**
```
Tree1:      1          Tree2:      1
           / \                    / \
          2   3                  2   3
Output: true
```

---

#### 20. **Tree Inorder Traversal** (`TreeInorderTraversal.java`)
Perform inorder traversal (Left → Node → Right) of a binary tree.

**Algorithm:**
- Recursively traverse the left subtree
- Process the current node (add to result list)
- Recursively traverse the right subtree

**Complexity:**
- Time: O(n) where n is number of nodes
- Space: O(h) where h is height (recursion stack)

**Example:**
```
Tree:       1
             \
              2
             /
            3
Output: [1, 3, 2]
```

---

#### 21. **Helper Class** (`TreeNode.java`)
Utility class for binary tree node representation.

**Features:**
- Node with value, left, and right child pointers
- Multiple constructors for tree creation
- Fields for tree structure management

---

## 🚀 How to Run

### Compile All Files
```bash
cd /Users/rhl08120/Documents/Learning/DS-Algo-Problems
javac -d out src/main/java/com/techai2246/leetcode/easy/*.java
```

### Run Individual Problems
```bash
java -cp out com.techai2246.leetcode.easy.Solution2SumProblem
java -cp out com.techai2246.leetcode.easy.ValidParenthesesProblem
java -cp out com.techai2246.leetcode.easy.MergeTwoSortedArray
java -cp out com.techai2246.leetcode.easy.RomanToInteger
java -cp out com.techai2246.leetcode.easy.ClimbStairsProblem
# ... and so on
```

---

## 📊 Quick Complexity Reference

| Problem | Category | Time | Space | Difficulty |
|---------|----------|------|-------|------------|
| 2Sum | Array | O(n) | O(n) | ⭐ |
| Merge Two Sorted Array | Array | O(m+n) | O(m+n) | ⭐ |
| Remove Duplicates | Array | O(n) | O(n) | ⭐ |
| Remove Element | Array | O(n) | O(n) | ⭐ |
| Plus One | Array | O(n) | O(n) | ⭐ |
| Search Insert Position | Array | O(n) | O(1) | ⭐ |
| Merge Two Sorted Lists | Linked List | O(n+m) | O(n+m) | ⭐ |
| Delete Duplicates | Linked List | O(n) | O(1) | ⭐ |
| Valid Parentheses | String | O(n) | O(n) | ⭐ |
| Longest Common Prefix | String | O(n×m) | O(m) | ⭐ |
| Palindrome | String | O(n) | O(n) | ⭐ |
| Roman to Integer | String | O(n) | O(1) | ⭐ |
| Find First String | String | O(n×m) | O(1) | ⭐ |
| Length Last Word | String | O(n) | O(1) | ⭐ |
| Binary Addition | Math | O(n) | O(n) | ⭐ |
| Square Root | Math | O(log n) | O(1) | ⭐ |
| Climb Stairs | DP | O(n) | O(n) | ⭐ |
| Same Tree Checker | Tree | O(n) | O(h) | ⭐ |
| Inorder Traversal | Tree | O(n) | O(h) | ⭐ |

---

## 💡 Key Concepts Demonstrated

### Data Structures
- **Arrays:** Iteration, modification, sorting
- **Linked Lists:** Traversal, merging, deletion
- **Stacks:** Parentheses matching
- **Trees:** Binary tree traversal, tree comparison, recursion

### Algorithms
- **Two Pointer Technique:** Merge operations, comparison
- **Dynamic Programming:** Climb stairs problem
- **String Manipulation:** Parsing, pattern matching
- **HashMap/HashSet:** Fast lookups, counting

### Techniques
- **StringBuilder:** Efficient string building
- **Bit Manipulation:** Binary operations
- **Mathematical Approximation:** Newton's method

---

## 📖 Learning Resources

- [LeetCode Easy Problems](https://leetcode.com/problemset/all/?difficulty=Easy)
- [GeeksforGeeks DSA](https://www.geeksforgeeks.org/data-structures/)
- [Java Collections Framework](https://docs.oracle.com/javase/tutorial/collections/)

---

## 🎯 Suggested Learning Path

1. **Start with Arrays:** 2Sum → Merge Array → Remove Duplicates
2. **Master Strings:** Valid Parentheses → Palindrome → Roman to Integer
3. **Explore Linked Lists:** Merge Lists → Delete Duplicates
4. **Add Math Skills:** Binary Addition → Square Root
5. **Learn DP:** Climb Stairs
6. **Understand Trees:** Tree Inorder Traversal → Same Tree Checker
7. **Practice Mixed:** All remaining problems

---

## 📝 Contributing

This is a personal learning project. Feel free to fork and adapt for your own learning journey!

## 📄 License

Educational purposes only.

---

**Last Updated:** January 30, 2026 | **Total Problems:** 21

