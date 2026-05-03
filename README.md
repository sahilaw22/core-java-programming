# Java Programming Coursework - CSP3413

<img src="https://github.com/user-attachments/assets/9abd6e44-0374-4490-ba07-e33f9d9e5f1e" width="140" style="float: left; margin-right:16px; margin-bottom:16px;">

<h3>This repository contains my Java programs, course assignments, and practice sets from my college coursework.</h3>

<br clear="left">

## Programs

Folder structure:

```text
└── core-java-programming/
    ├── README.md
    ├── Java Programming.iml
    ├── Practice Sets/
    │   ├── Coding Set 1/
    │   │   ├── SET4P10.java
    │   │   ├── SET4P3.java
    │   │   ├── SET4P4.java
    │   │   ├── SET4P5.java
    │   │   ├── SET4P8.java
    │   │   ├── SET4P9.java
    │   │   ├── SET4P1/
    │   │   │   ├── college/
    │   │   │   │   ├── Admin.java
    │   │   │   │   └── Result.java
    │   │   │   └── main/
    │   │   │       └── Main.java
    │   │   ├── SET4P2/
    │   │   │   └── type/
    │   │   │       ├── bank/
    │   │   │       │   └── BankAccount.java
    │   │   │       ├── main/
    │   │   │       │   └── Main.java
    │   │   │       └── premium/
    │   │   │           └── PremiumAccount.java
    │   │   ├── SET4P6/
    │   │   │   └── payroll/
    │   │   │       ├── Main.java
    │   │   │       ├── finance/
    │   │   │       │   └── Finance.java
    │   │   │       ├── management/
    │   │   │       │   └── Manager.java
    │   │   │       └── staff/
    │   │   │           ├── Employee.java
    │   │   │           └── HR.java
    │   │   └── SET4P7/
    │   │       ├── document.txt
    │   │       └── SET4P7.java
    │   ├── Coding Set 2/
    │   │   ├── SET2P1.java
    │   │   ├── SET2P10.java
    │   │   ├── SET2P2.java
    │   │   ├── SET2P3.java
    │   │   ├── SET2P4.java
    │   │   ├── SET2P5.java
    │   │   ├── SET2P6.java
    │   │   ├── SET2P7.java
    │   │   ├── SET2P8.java
    │   │   └── SET2P9.java
    │   ├── Coding Set 3/
    │   │   ├── SET3P1.java
    │   │   ├── SET3P10.java
    │   │   ├── SET3P2.java
    │   │   ├── SET3P3.java
    │   │   ├── SET3P4.java
    │   │   ├── SET3P5.java
    │   │   ├── SET3P6.java
    │   │   ├── SET3P7.java
    │   │   ├── SET3P8.java
    │   │   └── SET3P9.java
    │   ├── Coding Set 4/
    │   │   ├── SET4P1.java
    │   │   ├── SET4P10.java
    │   │   ├── SET4P2.java
    │   │   ├── SET4P3.java
    │   │   ├── SET4P4.java
    │   │   ├── SET4P5.java
    │   │   ├── SET4P6.java
    │   │   ├── SET4P7.java
    │   │   ├── SET4P8.java
    │   │   ├── SET4P9.java
    │   │   └── StudentManagementSystem.java
    │   ├── Coding Set 5/
    │   │   ├── SET5P1.java
    │   │   ├── SET5P10.java
    │   │   ├── SET5P2.java
    │   │   ├── SET5P3.java
    │   │   ├── SET5P4.java
    │   │   ├── SET5P5.java
    │   │   ├── SET5P6.java
    │   │   ├── SET5P7.java
    │   │   ├── SET5P8.java
    │   │   ├── SET5P9.java
    │   │   └── .gitkeep
    │   └── Coding Set 6/
    │       ├── SET6P1.java
    │       ├── SET6P10.java
    │       ├── SET6P2.java
    │       ├── SET6P3.java
    │       ├── SET6P4.java
    │       ├── SET6P5.java
    │       ├── SET6P6.java
    │       ├── SET6P7.java
    │       ├── SET6P8.java
    │       ├── SET6P9.java
    │       └── .gitkeep
    └── src/
        ├── CountEachChar.java
        ├── CountFreqWords.java
        ├── GuessNumberGame.java
        ├── HelloJava.java
        └── removeDuplicateList.java


```

## Main Programs (`src`)

### 1. HelloJava.java

What it does:
- Stores a greeting in a `String` variable
- Prints the message to the console

Key concepts:
- `main` method
- Variables and `String`
- `System.out.println()`

Sample output:

```text
Hello Java! My first program
```

### 2. GuessNumberGame.java

What it does:
- Generates a random number from 1 to 100
- Accepts user input using `Scanner`
- Compares guess vs computer number and provides hints
- Repeats until the correct guess is entered

Key concepts:
- `while (true)` loop with `break`
- `Math.random()`
- `Scanner`
- Ternary operator
- Conditional branching (`if / else if / else`)

### 3. CountEachChar.java

What it does:
- Reads a full line of text from the console
- Counts how many times each character appears using a `HashMap<Character, Integer>`
- Prints each character with its frequency

Key concepts:
- `Scanner.nextLine()`
- Iterating over `toCharArray()`
- Map lookups and updates with `containsKey`

Sample output:

```text
Enter the character
hello java
h:1
e:1
l:2
o:1
 :1
j:1
a:2
v:1
```

### 4. CountFreqWords.java

What it does:
- Splits a user-provided sentence on spaces
- Counts how many times each word occurs with a `HashMap<String, Integer>`
- Prints each word followed by its frequency

Key concepts:
- `split(" ")`
- `HashMap` with `String` keys
- Enhanced `for` loop for traversal

Sample output:

```text
Enter the sentence
hello hello world
hello:2
world:1
```

### 5. removeDuplicateList.java

What it does:
- Demonstrates removing duplicate integers from a list
- Converts the list to a `HashSet` for uniqueness and back to an `ArrayList`
- Prints the original and deduplicated lists (order of the unique list may vary)

Key concepts:
- `HashSet` for enforcing uniqueness
- Converting between `List` and `Set`
- Printing collections

Sample output:

```text
Original list: [1, 2, 1, 3, 4, 4]
Unique list: [1, 2, 3, 4]
```

## Practice Sets

- Coding Set 1 (`Practice Sets/Coding Set 1`): Renamed from Coding Set 4; object-oriented mini projects using packages and custom exceptions (college result processing, bank/premium accounts, payroll, orders/books, etc.).
- Coding Set 2 (`Practice Sets/Coding Set 2`): Constructor practice across small classes (students, rectangles, employees, books, cars), arrays and averages, string/word processing, student arrays, and a basic bank account simulation with deposits.
- Coding Set 3 (`Practice Sets/Coding Set 3`): Additional practice problems (see folder for details).

## How to Compile and Run

Use the same pattern for any Java file:

```bash
cd <folder-containing-file>
javac FileName.java
java FileName
```

Examples:
- For `src`: `cd src`
- For Coding Set 1: `cd "Practice Sets/Coding Set 1"`
- For Coding Set 2: `cd "Practice Sets/Coding Set 2"`

## Student Programs

- The earlier Coding Set 1 exercises (e.g., StudentManagementSystem.java) are kept in `Practice Sets/Coding Set 1_original` as a backup; they are not part of the new Coding Set 1 layout.

## Topics Covered

- Java basics and console output
- Variables and data types
- User input with `Scanner`
- Loops and conditionals
- Random number generation
- Java Collections Framework (`List`, `ArrayList`, `HashMap`, `Deque`, `Collections`)
- Adding, removing, searching, and reversing list elements
- Sorting lists in ascending and descending order
- Finding max/min values in collections
- Array and list conversion (`array <-> list`)
- Frequency counting with `HashMap` (lists, characters, words)
- Removing duplicates from lists using `Set`
- Finding common elements between lists
- Basic stack operations using `Deque`

<img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=6,11,20&height=120&section=footer&animation=twinkling" width="100%"/>



