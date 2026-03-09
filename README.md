# Java Programming Coursework - CSP3413

<img src="https://github.com/user-attachments/assets/9abd6e44-0374-4490-ba07-e33f9d9e5f1e" width="140" style="float: left; margin-right:16px; margin-bottom:16px;">

<h3>This repository contains my Java programs, course assignments, and practice sets from my college coursework.</h3>

<br clear="left">

## Programs

Folder structure:

```text
Java Programming/
|-- src/
|   |__ Main Java programs
|-- Practice Sets/
|   |__ Coding Set 4/
|       |__ Set 4 Programs files
|          |__ Student Management System
|__ README.md
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

### Coding Set 4 (`Practice Sets/Coding Set 4`)

- `SET4P1.java`: Add and retrieve elements from an `ArrayList`
- `SET4P2.java`: Remove an element from a list
- `SET4P3.java`: Check if a list contains a specific element
- `SET4P4.java`: Convert array to list and list to array
- `SET4P5.java`: Find maximum and minimum values in a list
- `SET4P6.java`: Reverse a list
- `SET4P7.java`: Sort a list in ascending and descending order
- `SET4P8.java`: Count frequency of elements in a list
- `SET4P9.java`: Find common elements between two lists
- `SET4P10.java`: Implement stack operations using `Deque`
- `StudentManagementSystem.java`: Basic student record model and display

## How to Compile and Run

Use the same pattern for any Java file:

```bash
cd <folder-containing-file>
javac FileName.java
java FileName
```

Examples:
- For `src`: `cd src`
- For Coding Set 4: `cd "Practice Sets/Coding Set 4"`

## Student Management System (How It Works)

File: `Practice Sets/Coding Set 4/StudentManagementSystem.java`

Sample input:

```text
101 // id
Aarav // name
20 // age
88.5 // marks
```

Sample output:

```text
Student Management System
1. Add Student
2. Remove Student
3. Search Student
4. Display All Students
5. Find Top Student
6. Exit
Enter your choice(1-6): 1
Enter ID: 101
Enter Name: Aarav
Enter Age: 20
Enter Marks: 88.5
Student added successfully

Student Management System
1. Add Student
2. Remove Student
3. Search Student
4. Display All Students
5. Find Top Student
6. Exit
Enter your choice(1-6): 4

ID: 101
Name: Aarav
Age: 20
Marks: 88.5

Student Management System
1. Add Student
2. Remove Student
3. Search Student
4. Display All Students
5. Find Top Student
6. Exit
Enter your choice(1-6): 5

Top StudentID: 101
Name: Aarav
Age: 20
Marks: 88.5
```

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
