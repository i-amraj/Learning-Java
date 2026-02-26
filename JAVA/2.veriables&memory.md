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

🔥 Type of casting 

1. Windening casting (Autometic)

small -> big 
java does it autometically

Example:

int x = 10;
double y = x;

✔ No error
✔ int → double
✔ Safe conversion

Why safe?

Because double is bigger (64 bits)
int is smaller (32 bits)

So no data loss.

2️⃣ Narrowing Casting (Manual)

Big ➜ Small
Java does NOT allow automatically.

Example:

 double x = 10.5;
int y = x;   // ❌ Error ```

This gives error.

To fix:

``` int y = (int) x;

Now it works.

But…
⚠ Decimal part is LOST.
10.5 becomes 10
No rounding. Just cut.

🧠 Important Rule

| Type of Cast | Direction   | Automatic? | Risk?           |
| ------------ | ----------- | ---------- | --------------- |
| Widening     | small ➜ big | Yes        | No              |
| Narrowing    | big ➜ small | No         | Yes (data loss) |

Q. What will be the output?
double x = 9.8;
int y = (int) x;
System.out.println(y);
Think carefully.

# 🔥 Now Let’s Understand Internally (Step by Step)

## Example

```java
double x = 9.8;
int y = (int) x;
```

---

# 🧠 How It Works Internally

## Step 1️⃣ — Memory Storage

```java
double x = 9.8;
```

- Stored in **64-bit IEEE 754 floating format**  
- It has:
  - Sign bit  
  - Exponent  
  - Mantissa (fraction)  

It represents **9.8** in binary floating format.

---

## Step 2️⃣ — Casting Starts

```java
(int) x
```

- Target type = `int` (32-bit integer)  
- Source type = `double` (64-bit floating)  

**JVM performs:**  
👉 Floating-point to integer conversion

---

## Step 3️⃣ — What JVM Actually Does

Internally it:

- Removes fractional part  
- Keeps only integer part  
- Stores result in 32-bit signed integer  

❌ It does **NOT round**.  
It simply truncates toward zero.

So:

```
9.8  → 9
-9.8 → -9
```

**Important:** Always moves **toward ZERO**.

---

## 🔄 Internal Flow (Text Flowchart)

```
Start
   ↓
Read double value (9.8)
   ↓
Is explicit cast present?
   ↓
Yes → Continue
   ↓
Remove fractional part
   ↓
Check if value fits in int range
   ↓
If yes → Store in int
If no → Overflow occurs
   ↓
End
```

---

## ⚠️ Important Edge Case

What if:

```java
double x = 1e20;
int y = (int) x;
```

- `1e20` is bigger than `int` max  
- **Overflow happens**  
- Result becomes incorrect (wrapped value)  
- **No error thrown**

---

# 🎯 Very Important Rule

Casting from **floating → integer**:

- Decimal part removed  
- No rounding  
- Toward zero  
- May overflow  
- No exception thrown

---

# 🔥 Deep Check Question

```java
double x = -7.9;
int y = (int) x;
System.out.println(y);
```

Think carefully about **“toward zero”**.  
What will this print?

# 🔹 Type Conversions in Java

What happens when converting:

- `String → int`  
- `int → String`  
- `char → int`  
- `int → char`  

Let’s explain clearly.

---

## 1️⃣ String → int

### Example

```java
String s = "25";
int x = Integer.parseInt(s);
```

**What happens internally?**

- String `"25"` contains characters: `'2'` and `'5'`  
- Java reads each character  
- Converts character digits to numeric value  
- Combines them mathematically

```
"25" = (2 × 10) + 5 = 25
```

⚠ **If string contains non-number:**

```java
String s = "25a";
int x = Integer.parseInt(s);  // NumberFormatException
```

It throws:  
👉 `NumberFormatException`

---

## 2️⃣ int → String

### Example

```java
int x = 25;
String s = String.valueOf(x);
```

**What happens?**

- Java converts number `25`  
- Breaks into digits `2` and `5`  
- Converts each digit to character  
- Stores as text `"25"`

Now it is **text**, not number.  

Example:

```java
"25" + 5  // results in "255"
```

Because it becomes **string concatenation**.

---

## 3️⃣ char → int

### Example

```java
char c = 'A';
int x = c;
```

**What happens?**

- Java converts character to **ASCII/Unicode value**  

```
'A' = 65
'a' = 97
'0' = 48
```

So:

```
x = 65
```

✅ No error. This is **widening conversion**.

---

## 4️⃣ int → char

### Example

```java
int x = 65;
char c = (char) x;
```

**What happens?**

- Java looks at Unicode table  
- `65 = 'A'`  

So:

```
c = 'A'
```

⚠ Must cast because `int → char` is **narrowing conversion**.

---

# 🔥 Summary Table

| Conversion   | What Happens                     |
|--------------|---------------------------------|
| String → int | Parses digits mathematically    |
| int → String | Converts number into text       |
| char → int   | Returns ASCII/Unicode value     |
| int → char   | Returns character of that code  |

---

# 🧠 Deep Test

```java
System.out.println('A' + 1);
```

Think carefully.  
This is where many students fail.

# 🔹 Char and Int Promotion in Java

### Example

```java
System.out.println('A' + 1);
```

---

### Analysis

- `'A'` is a **char**  
- `1` is an **int**  
- There is **NO String involved**  

So Java does **numeric promotion**.

---

## 🔥 Step-by-Step What Happens

### Step 1️⃣
`'A'` is a character.  

Internally:

```
'A' = 65   (ASCII / Unicode value)
```

### Step 2️⃣
Java promotes `char` to `int`.  

Expression becomes:

```
65 + 1
```

### Step 3️⃣
Math happens:

```
65 + 1 = 66
```

**Final Output:**  
```
66
```

---

# 🧠 Why It Is NOT "A1"

String concatenation happens **only when at least ONE operand is a String**.

Example:

```java
System.out.println("A" + 1);
```

- `"A" + 1 → "A1"`  
- Because `"A"` is a String

---

# ⚡ Golden Rule

| Expression | Output | Why                        |
|------------|--------|----------------------------|
| 'A' + 1    | 66     | char → int promotion       |
| "A" + 1    | A1     | String concatenation       |

---

# 🔥 Next Trap Question

```java
System.out.println('A' + 'B');
```

Think very carefully.  
What will this print?

# 🔹 Automatic Type Promotion in Java

### Real Question:

We did not use an int converter.  
So how did `'A'` become number `66`?

---

## 🔥 This is called **Automatic Type Promotion**

You **do NOT** need to manually convert.  
Java does it automatically during arithmetic operations.

---

## 🔹 Why Does This Happen?

In Java:

- When arithmetic operators are used (`+`, `-`, `*`, `/`)  
- 👉 All smaller integer types are automatically promoted to `int`.

**Smaller types:**  

- `byte`  
- `short`  
- `char`  

They automatically become `int` before calculation.

---

## 🔥 What Happens Internally

Example:

```java
'A' + 1
```

Flow inside JVM:

```
char 'A'
   ↓
Promoted to int (65)
   ↓
65 + 1
   ↓
66
```

You don’t see conversion code, but Java does it automatically.

---

# 🧠 Important Rule (VERY IMPORTANT)

In arithmetic expressions:

```
byte → int  
short → int  
char → int
```

This is called:

- **Implicit Widening Primitive Conversion**  
- OR **Numeric Promotion**

---

## 🔥 Why Java Does This

- CPU works faster with 32-bit integers  
- So Java converts small types into `int` before doing math

---

## 🔥 Now Compare

**Case 1:**

```java
System.out.println('A' + 1);
```

- No String involved → numeric addition → `66`

**Case 2:**

```java
System.out.println("A" + 1);
```

- String involved → concatenation → `"A1"`  
- When String appears, Java converts everything to String

---

# 🔥 FINAL GOLDEN RULE

- Arithmetic + **no String** → numeric operation  
- If **String present** → concatenation

---

### 🔹 Tricky Question

```java
System.out.println('A' + 1 + "B");
```

Think **step by step**.  
This is a tricky one.  
What will it print?

### 🔹 Tricky Question 
Tell me the output:

System.out.println('A' + (1 + "B"));

Now parentheses change the game.

# 🔥 Step-by-Step Evaluation

## Step 1️⃣: Solve Parentheses / Inner Expression First

Inside brackets:

```
1 + "B"
```

- Since `"B"` is a **String**, Java switches to **concatenation**  
- `1` → `"1"`  
- Result becomes:

```
"1B"
```

Now the full expression becomes:

```
'A' + "1B"
```

---

## Step 2️⃣: Now Evaluate

Now we have:

```
char + String
```

- When **String is involved** → concatenation  
- `'A'` becomes `"A"`  

Now:

```
"A" + "1B"
```

✅ **Final Output:**

```
A1B
```
### 🔹 Tricky Question

What will this print?

System.out.println('A' + 1 + 2 + "B");

Think carefully.
Do NOT rush.

# 🔥 You Have Now Mastered

- **Char → int promotion**  
- **Left-to-right evaluation**  
- **When Java switches to String concatenation**  
- **Parentheses priority**  
- **Mixed-type expression evaluation**  

This is a **strong foundation** for Java type conversions and expression evaluation.

Next powerful topic:

🚀 Autoboxing & Unboxing (Very Important)

check Autoboxing&Unboxing.md file 