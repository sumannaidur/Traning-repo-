# Java Full Stack Training Repository

Welcome to the **Java Full Stack Training Repository**! This is a centralized, structured repository for all students to upload and organize their Java Full Stack practice programs in a systematic way, day by day.

## 📋 Overview

This repository serves as a centralized platform for students to:
- Upload Java Full Stack practice programs and coding exercises
- Organize solutions by student name, day, and topic
- Track learning progress throughout the training
- Share knowledge and learn from peers' implementations
- Build a portfolio of completed Java Full Stack projects
- Practice core Java concepts through to full-stack development

---

## 🚀 How to Add Your Programs - Detailed Steps

### **Step 1: Clone the Repository**

Open your terminal/command prompt and run:

```bash
git clone git@github.com:sumannaidur/Traning-repo-.git
cd Traning-repo-
```

> **Note:** Make sure you have Git installed and SSH keys configured for GitHub.

---

### **Step 2: Create Your Personal Student Folder**

Navigate to the repository and create a folder with your name:

```bash
mkdir StudentName
cd StudentName
```

**Naming Convention:**
- Use your full name or username (e.g., `suman-naidu`, `suman-r`, `sumannaidur`)

---

### **Step 3: Create Your Day Folder**

Inside your student folder, create a subfolder for each day of practice:

```bash
mkdir Day-01
cd Day-01
```

**Day Folder Naming Convention:**
- Use format: `Day-XX` (e.g., `Day-01`, `Day-02`, `Day-03`)
- If organizing by topics: `Day-01-Variables`, `Day-02-OOP`, etc.

---

### **Step 4: Create Your Java Program Files**

Inside your day folder, create Java files for each problem:

```bash
# Create a new Java program file
echo public class Solution {} > Problem1.java
echo public class Problem2 {} > Problem2.java
```

**File Naming Convention:**
- Use format: PascalCase
- Match class name with filename (e.g., class `ArraySum` should be in `ArraySum.java`)

---

### **Step 5: Write Your Java Solution**

Open your program file in your preferred IDE (IntelliJ IDEA, Eclipse, VS Code) and write your solution:

**Example 1 - Basic Java Program (Problem1.java):**

```java
/**
 * Problem: Find the sum of two numbers
 * Input: Two integers
 * Output: Their sum
 */
public class Problem1 {
    public static int findSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = findSum(10, 20);
        System.out.println("Sum: " + result);
    }
}
```

**Example 2 - Object-Oriented Program (Problem2.java):**

```java
/**
 * Problem: Create a Student class with basic properties
 */
public class Problem2 {
    private String name;
    private int rollNumber;
    private double cgpa;

    // Constructor
    public Problem2(String name, int rollNumber, double cgpa) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.cgpa = cgpa;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getCgpa() {
        return cgpa;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + rollNumber);
        System.out.println("CGPA: " + cgpa);
    }

    public static void main(String[] args) {
        Problem2 student = new Problem2("John Doe", 101, 8.5);
        student.display();
    }
}
```

---

### **Step 6: Create a README for Your Day (Optional)**

Inside each day folder, create a `README.md` to describe your problems:

```bash
# Create README.md in Day-01 folder
echo # Day 01 Problems > Day-01/README.md
```

**Content for Day-01/README.md:**

```markdown
# Day 01 - Java Basic Programs

## Problem 1: Sum of Two Numbers
- **Description:** Add two integers and return the sum
- **Difficulty:** Easy
- **Topics:** Variables, Methods
- **File:** Problem1.java

## Problem 2: Student Class
- **Description:** Create a class to store student information
- **Difficulty:** Easy
- **Topics:** OOP, Classes, Constructors

---
**Date:** 09-Dec-2025
**Status:** Completed ✅
```

---

### **Step 7: Add and Commit Your Changes**

Stage your new files:

```bash
# Add all new files
git add .

# Or add specific student folder
git add StudentName/
git add StudentName/Day-01/
```

Commit your changes:

```bash
git commit -m "Add Day-01: Basic Java programs"
```

**Good commit message examples:**
- `Add Day-01: Variables and basic operations`
- `Day-02: OOP concepts - Classes and Objects`
- `Add Day-03: Arrays and String manipulation`
- `StudentName - Day-04: Java Collections`

---

### **Step 8: Push Your Changes to GitHub**

Upload your changes to the remote repository:

```bash
git push origin main
```

---

## 📁 Repository Structure Example

```
Traning-repo/
├── README.md                        # Main repository README
├── sumannaidur/                        # Student 1 folder
│   ├── Day-01/
│   │   ├── README.md                # Day 01 details
│   │   ├── Problem1.java            # Solution 1
│   │   └── Problem2.java            # Solution 2
│   ├── Day-02/
│   │   ├── README.md                # Day 02 details
│   │   ├── ArrayOperations.java     # Solution 1
│   │   └── StringManipulation.java  # Solution 2
│   └── Day-03/
│       ├── README.md                # Day 03 details
│       ├── OOPConcepts.java         # Solution 1
│       └── StudentClass.java        # Solution 2
├── student 2/                      # Student 2 folder
│   ├── Day-01/
│   │   ├── README.md
│   │   ├── Problem1.java
│   │   └── Problem2.java
│   └── Day-02/
│       ├── README.md
│       ├── ArraySum.java
│       └── StringReverse.java
├── student 3/                       # Student 3 folder
│   ├── Day-01/
│   │   ├── README.md
│   │   ├── Variables.java
│   │   └── DataTypes.java
│   └── Day-02/
│       ├── README.md
│       ├── Loops.java
│       └── Conditionals.java
└── ...
```

---

## 🔧 Useful Git Commands

| Command | Description |
|---------|-------------|
| `git status` | Check the status of your repository |
| `git log` | View commit history |
| `git pull origin main` | Update your local repository |
| `git branch` | List all branches |
| `git checkout -b day-04` | Create a new branch for a new day |
| `git diff` | View changes before committing |

---

## 📝 Example Workflow - Complete Day

```bash
# 1. Clone repository
git clone git@github.com:sumannaidur/Traning-repo-.git
cd Traning-repo-

# 2. Create your student folder
mkdir your name
cd your name

# 3. Create day folder
mkdir Day-01
cd Day-01

# 4. Create Java solution files
echo public class Problem1 {} > Problem1.java
echo public class Problem2 {} > Problem2.java

# 5. Add your solutions (edit files with your IDE)
# (Use IntelliJ IDEA, Eclipse, or VS Code to write code)

# 6. Create README for the day
echo "# Day 01 - Java Basics" > README.md

# 7. Go back to root and add files
cd ../..
git add John-Doe/

# 8. Commit with meaningful message
git commit -m "John-Doe: Add Day-01 - Java Variables and Methods"

# 9. Push to GitHub
git push origin main
```

---

## ❓ Frequently Asked Questions

**Q: I forgot to add a problem to my commit. What do I do?**

A: You can amend your last commit:

```bash
git add Problem3.java
git commit --amend --no-edit
git push origin main -f
```

**Q: How do I sync if the repository was updated?**

A: Pull the latest changes:

```bash
git pull origin main
```

**Q: Can I work on multiple days at once?**

A: Yes! Create separate day folders and commit them together or separately.

**Q: What if I make a mistake in my commit message?**

A: Amend the last commit:

```bash
git commit --amend -m "Your new message"
```

---

## 📜 License

This repository is created for educational purposes.

---

## 🎓 Happy Learning

Keep practicing, stay consistent, and track your progress day by day!
# Traning-repo-
