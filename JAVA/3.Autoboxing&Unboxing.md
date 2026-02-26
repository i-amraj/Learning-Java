# 🚀 Autoboxing & Unboxing (Very Important)

Before this, you must know:

Java has **primitive types**:

- `int`  
- `double`  
- `char`  
- `boolean`  
- etc.

And Java has **Wrapper Classes** (object versions of primitives).

---

## 🔹 Primitive vs Wrapper

| Primitive | Wrapper Class |
|-----------|---------------|
| int       | Integer       |
| double    | Double        |
| char      | Character     |
| boolean   | Boolean       |
| byte      | Byte          |
| short     | Short         |
| long      | Long          |
| float     | Float         |

---

## 🔥 What is Autoboxing?

**Autoboxing = Automatic conversion**  
Primitive ➜ Wrapper object

### Example

```java
int x = 10;
Integer obj = x;   // Autoboxing
```

Java automatically converts `int` into `Integer`.

Internally it does something like:

```java
Integer obj = Integer.valueOf(10);
```

---

## 🔥 What is Unboxing?

**Unboxing = Wrapper ➜ Primitive**

### Example

```java
Integer obj = 20;
int x = obj;   // Unboxing
```

Internally:

```java
int x = obj.intValue();
```

---

## 🧠 Why Wrapper Classes Exist

Because:

- Collections (like `ArrayList`) store **objects**, not primitives  
- Generics work **only with objects**  
- Objects can be `null`, primitives cannot  

Example:

```java
ArrayList<Integer> list = new ArrayList<>();
```

We **cannot use**:

```java
ArrayList<int> list;   // ❌ Not allowed
```

---

## ⚠️ Important Danger (Interview Question)

Look at this:

```java
Integer a = null;
int b = a;
```

- Java tries to unbox:

```java
int b = a.intValue();
```

- But `a` is `null`  
- 👉 This causes **NullPointerException**

---

## 🔥 Very Important Difference

| Feature     | Primitive       | Wrapper       |
|------------|----------------|---------------|
| Storage    | Stack          | Heap (object) |
| Speed      | Faster         | Slightly slower |
| Null       | ❌ Cannot be null | ✅ Can be null |
| Methods    | None           | Has methods    |

---

## 🎯 Test Question

```java
Integer a = 100;
Integer b = 100;

System.out.println(a == b);
```

Think carefully.  
This is **tricky**.