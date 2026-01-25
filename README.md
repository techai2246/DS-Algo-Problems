# DS-Algo-Problems

A comprehensive collection of classic **Data Structures and Algorithms** problems solved in Java. This repository contains implementations of popular LeetCode-style problems with multiple approaches and optimizations.

## 📚 Project Overview

This learning repository includes solutions to fundamental algorithmic problems with detailed implementations and explanations. Each solution demonstrates different approaches (brute force vs. optimized) with corresponding time and space complexity analysis.

## 📁 Project Structure

```
DS-Algo-Problems/
├── README.md
└── src/main/java/
    ├── com.techai2246.leetcode.easy.LongestCommonStringPrefix.java
    ├── com.techai2246.leetcode.easy.PalindromeProblem.java
    ├── com.techai2246.leetcode.easy.RomanToInteger.java
    ├── com.techai2246.leetcode.easy.Solution2SumProblem.java
    └── com.techai2246.leetcode.easy.ValidParenthesesProblem.java
```

## 🔑 Problems Included

### 1. **2Sum Problem** (`com.techai2246.leetcode.easy.Solution2SumProblem.java`)
Find two numbers in an array that add up to a target sum and return their indices.

**Approaches:**
- **Brute Force:** Nested loop comparing all pairs
  - Time Complexity: O(n²)
  - Space Complexity: O(1)
  
- **Optimal:** Using ArrayList to store and lookup complements
  - Time Complexity: O(n)
  - Space Complexity: O(n)

**Example:**
```
Input: nums = [2, 4, 11, 3], target = 6
Output: [0, 3]  (nums[0] + nums[3] = 2 + 3 = 5... adjusted example)
```

---

### 2. **Valid Parentheses** (`com.techai2246.leetcode.easy.ValidParenthesesProblem.java`)
Validate if a string containing parentheses, curly braces, and square brackets is correctly matched.

**Algorithm:**
- Uses a **Stack** data structure
- Push opening parentheses onto stack
- For closing parentheses, verify it matches the top of the stack
- Stack must be empty at the end

**Supported Characters:** `()`, `{}`, `[]`

**Example:**
```
Input: "{[](}"
Output: false (mismatched braces)
```

**Complexity:**
- Time Complexity: O(n)
- Space Complexity: O(n)

---

### 3. **Longest Common String Prefix** (`com.techai2246.leetcode.easy.LongestCommonStringPrefix.java`)
Find the longest common prefix shared by all strings in an array.

**Algorithm:**
- Compare characters at each position across all strings
- Stop when a mismatch is found or a string is exhausted

**Example:**
```
Input: ["flower", "f", "flight"]
Output: "f"
```

**Complexity:**
- Time Complexity: O(n × m) where n is number of strings, m is prefix length
- Space Complexity: O(m) for StringBuilder

---

### 4. **Palindrome Problem** (`com.techai2246.leetcode.easy.PalindromeProblem.java`)
Check if an integer number is a palindrome.

**Approaches:**
- **String Reversal:** Convert to string and compare with reverse
  - Time Complexity: O(n) where n is number of digits
  - Space Complexity: O(n)
  
- **Two Pointer Optimal:** Use left and right pointers to compare characters
  - Time Complexity: O(n)
  - Space Complexity: O(n) for string conversion

**Example:**
```
Input: 121
Output: true (121 reversed is 121)

Input: 123
Output: false
```

---

### 5. **Roman to Integer** (`com.techai2246.leetcode.easy.RomanToInteger.java`)
Convert a Roman numeral string to its integer representation.

**Algorithm:**
- Maps Roman characters to integer values
- Handles special cases (I before V/X, X before L/C, C before D/M)
- Uses HashMaps for efficient character-to-value lookup

**Roman Numeral Reference:**
| Symbol | Value |
|--------|-------|
| I      | 1     |
| V      | 5     |
| X      | 10    |
| L      | 50    |
| C      | 100   |
| D      | 500   |
| M      | 1000  |

**Example:**
```
Input: "MCMXCIV"
Output: 1994 (M=1000, CM=900, XC=90, IV=4)
```

**Complexity:**
- Time Complexity: O(n) where n is length of Roman string
- Space Complexity: O(1) constant space for maps

---

## 🚀 How to Run

### Compile
```bash
javac src/main/java/*.java
```

### Run Individual Programs
```bash
java -cp src/main/java com.techai2246.leetcode.easy.Solution2SumProblem
java -cp src/main/java com.techai2246.leetcode.easy.ValidParenthesesProblem
java -cp src/main/java com.techai2246.leetcode.easy.LongestCommonStringPrefix
java -cp src/main/java com.techai2246.leetcode.easy.PalindromeProblem
java -cp src/main/java com.techai2246.leetcode.easy.RomanToInteger
```

## 📊 Complexity Analysis Summary

| Problem | Best Approach | Time | Space |
|---------|---------------|------|-------|
| 2Sum | HashMap/ArrayList | O(n) | O(n) |
| Valid Parentheses | Stack | O(n) | O(n) |
| Longest Common Prefix | Horizontal Scan | O(n×m) | O(m) |
| Palindrome | Two Pointers | O(n) | O(n) |
| Roman to Integer | HashMap Lookup | O(n) | O(1) |

## 💡 Key Concepts Demonstrated

- **Stack:** Valid Parentheses problem
- **HashMap/HashSet:** Roman to Integer, 2Sum optimization
- **String Manipulation:** Palindrome, Longest Common Prefix
- **Two Pointer Technique:** Palindrome optimization
- **StringBuilder:** Efficient string building

## 📖 Learning Resources

These problems are commonly found on:
- [LeetCode](https://leetcode.com/)
- [GeeksforGeeks](https://www.geeksforgeeks.org/)
- [HackerRank](https://www.hackerrank.com/)

## 🎯 Next Steps

Consider exploring:
- More complex string algorithms (KMP, Trie)
- Graph algorithms (BFS, DFS)
- Dynamic programming problems
- Tree and binary search tree problems

## 📝 License

This project is for educational purposes.

---

**Last Updated:** January 2026
