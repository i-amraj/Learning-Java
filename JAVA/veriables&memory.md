# 🚀 CHAPTER 3 – Variables & Memory

Before coding more, you must understand:

👉 What is memory?  
👉 What is a variable?  

---

# 🖥️ WHAT IS MEMORY (RAM)?

RAM is the temporary storage in a computer where:

- Programs run  
- Variables are stored  
- Data is processed  

⚠️ When the program stops, RAM is cleared.

---

# 🧠 What is a Variable?

A variable is:

👉 A named container used to store data in memory.

---

## 📌 Example

```java
int age = 25;
```

### 🔍 Break it:

- `int` → Data type  
- `age` → Variable name  
- `=` → Assignment operator  
- `25` → Value stored in memory  

---

## 📦 Think Like This

### Memory Box Representation

| Name | Value |
|------|-------|
| age  | 25    |

---

# 🔥 Data Types in Java (Primitive)

| Type    | Stores            | Example |
|----------|------------------|----------|
| int      | Whole numbers     | 10       |
| double   | Decimal numbers   | 10.5     |
| char     | Single character  | 'A'      |
| boolean  | true/false        | true     |

---

# 🎯 STRICT TEST – LEVEL 3

Answer clearly:

### 1️⃣ What is RAM?  
### 2️⃣ What is a variable?  

### 3️⃣ In `int age = 25;`
- What is `int`?  
- What is `age`?  
- What is `25`?  

---

### 4️⃣ What will happen if we write?

```java
int age = "25";
```

Why?

---

### 5️⃣ What is the difference between:

```
'A' and "A"
```

- 5.1 Which one is `char`?  
- 5.2 Which one is `String`?  
- 5.3 Why can't we store `"25"` inside `int`?  

---

### 6️⃣ If I write:

```java
int x = 10;
double y = x;
```

Will this give error or not?  
And WHY?

---

### 7️⃣ What about this?

```java
double a = 10.5;
int b = a;
```

Will this give error or not?  
If yes → Why?  
If no → Why?

---

## 🧠 Very Important Rule

Smaller → Bigger ✅ Allowed automatically  
Bigger → Smaller ❌ Not allowed automatically  

```
double = 8 bytes  
int = 4 bytes
```

---

# 8️⃣ 🔥 Now I Test Your Understanding

### 8.1 Why does Java not allow automatic `double → int` conversion?

### 8.2 What will be output of:

```java
double a = 9.8;
int b = (int) a;
System.out.println(b);
```

### 8.3 Is decimal rounded or removed?

---

# 9️⃣ Think Carefully

```java
int x = 10;
int y = x;
x = 20;
System.out.println(y);
```

What will be output?  
Explain WHY.

---

# 🔟 Memory Understanding Test

```java
int a = 5;
int b = a;
a = a + 10;
b = b + 20;
System.out.println(a);
System.out.println(b);
```

Tell me:

- Q10.1 First output?  
- Q10.2 Second output?  
- Q10.3 Explain step-by-step memory changes.  

---

# 1️⃣1️⃣ Beginner Confusion Test

```java
int x = 10;
int y = x;
x = y;
y = x;
System.out.println(x);
System.out.println(y);
```

What will be output?

---

# 1️⃣2️⃣ 🔥 Real Brain Test

How would you swap two numbers WITHOUT using a third variable?

Example:

```
x = 10  
y = 20
```

After swapping:

```
x = 20  
y = 10
```

❌ No third variable allowed.

---

# 🧠 Important Memory Table

| Data Type | Size          |
|------------|--------------|
| byte       | 1 byte       |
| short      | 2 bytes      |
| int        | 4 bytes      |
| long       | 8 bytes      |
| float      | 4 bytes      |
| double     | 8 bytes      |
| char       | 2 bytes      |
| boolean    | JVM dependent|

---

⚠️ **Important:**  
Memorize especially:

- `int` → 4 bytes  
- `double` → 8 bytes  

---

# ⚠️ BEFORE READING BELOW NOTE  
Solve the above questions in your mind first.

---

# 🔥 Swap Using Multiplication & Division

## Formula

```java
x = x * y;
y = x / y;
x = x / y;
```

---

## 🧠 Let’s Test With:

```
x = 10  
y = 20
```

### Step 1
```
x = 10 * 20 = 200
```

Now:
```
x = 200  
y = 20
```

### Step 2
```
y = 200 / 20 = 10
```

Now:
```
x = 200  
y = 10
```

### Step 3
```
x = 200 / 10 = 20
```

Final:
```
x = 20  
y = 10
```

✔ Swapped successfully.

---

# 🚨 BUT IMPORTANT PROBLEM

What if:

```
x = 0  
y = 20
```

### Step 1
```
x = 0 * 20 = 0
```

### Step 2
```
y = 0 / 20 = 0
```

Now both become 0.

❌ Original value lost.

So multiplication/division method fails when one value is 0.

---

# 🧠 Lesson Here

Good programmers don’t just solve problems.  
They think about:

- Edge cases  
- Overflow  
- Zero division  
- Limitations  

---

# 🎯 Final Concept Check
Q. Which swapping method is safer?

- Addition/Subtraction  
- Multiplication/Division  
- Using third variable  

And WHY?

Think like an engineer, not a student.

Answer carefully.


1️⃣ What is maximum value of int?

2,147,483,647

Q.2️⃣ What is the minimum value of int in Java?

🔥 Java int Details

Size = 4 bytes

1 byte = 8 bits

Total bits = 32 bits

So total possible values:
2³²

Now calculate:
2³² = 4,294,967,296
RANGE
Minimum: −2,147,483,648
Minimum: −2,147,483,648

FORMULA TO FIND MAXIMUM AND MINIMUM

MAXIMUM = TOTAL VALUE / 2 - 1
MINIMUM = TOTAL VALUE / 2

Q. - How many values can a byte store in Java?
Remember:
byte = 1 byte

# 🧠 Pattern You Must Remember

| Type  | Bits | Total Values      |
|--------|------|------------------|
| byte   | 8    | 2⁸ = 256         |
| short  | 16   | 2¹⁶ = 65,536     |
| int    | 32   | 2³² = 4,294,967,296 |
| long   | 64   | 2⁶⁴ = 18,446,744,073,709,551,616 |

---

🔥 Important Rule (Signed Types in Java)
For signed types:
Total values = 2ⁿ
Maximum value = 2ⁿ⁻¹ − 1
Minimum value = −2ⁿ⁻¹

Q. What is the maximum value of byte?

## What is Type Casting?

Type casting means:

👉 Converting one data type into another data type.

🔥