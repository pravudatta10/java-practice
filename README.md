# Java Practice

A structured Java practice repository for **interview preparation, problem solving, core Java concepts, JVM concepts, concurrency, reactive programming, and DSA**.

The goal of this repository is to maintain **one long-term Java practice project** where every new question follows a consistent structure and can be easily revised before interviews.

---

## 🎯 Purpose

This repository is focused on **Java only**.

It covers:

- Core Java
- Object-Oriented Programming
- Strings
- Collections
- Generics
- Exception Handling
- Java 8+ Features
- Functional Programming
- Stream API
- Optional
- Date & Time API
- Java I/O
- Multithreading & Concurrency
- CompletableFuture
- JVM & Memory
- Reactive Programming
- DSA
- Design Patterns

### Out of Scope

The following should be maintained in separate repositories:

- Spring Boot
- Spring Framework
- Spring Security
- Spring Data JPA
- Spring WebFlux
- Spring Cloud
- Microservices
- Kafka
- AWS / Cloud
- Databases
- System Design

---

# 🏗️ Project Structure

```text
java-practice/
│
├── pom.xml
├── README.md
│
├── src/
│   │
│   ├── main/
│   │   └── java/
│   │       └── com/pravudatta/javapractice/
│   │
│   │           ├── basics/
│   │           ├── oops/
│   │           ├── strings/
│   │           ├── collections/
│   │           ├── generics/
│   │           ├── exceptions/
│   │           ├── functional/
│   │           ├── streams/
│   │           ├── optional/
│   │           ├── datetime/
│   │           ├── io/
│   │           ├── concurrency/
│   │           ├── jvm/
│   │           ├── memory/
│   │           ├── reactive/
│   │           ├── dsa/
│   │           └── designpatterns/
│   │
│   └── test/
│       └── java/
│           └── com/pravudatta/javapractice/
│
└── docs/
    └── notes/
```

---

# 📚 Topic Structure

## 01. Basics

```text
basics/
└── BasicQuestions.java
```

Topics:

- Variables
- Data types
- Operators
- Loops
- Conditions
- Methods
- Type casting
- Pass-by-value
- Arrays
- `==` vs `equals()`

---

## 02. OOP

```text
oops/
└── OopsQuestions.java
```

Topics:

- Encapsulation
- Inheritance
- Polymorphism
- Abstraction
- Interface
- Abstract class
- Overloading
- Overriding
- Composition
- Association
- Aggregation
- SOLID fundamentals

---

## 03. Strings

```text
strings/
└── StringQuestions.java
```

Topics:

- String immutability
- String Pool
- `StringBuilder`
- `StringBuffer`
- Character manipulation
- Anagram
- Palindrome
- Duplicate characters
- Frequency counting
- String transformations

---

## 04. Collections

Collections may grow larger, so multiple classes are allowed.

```text
collections/
├── ListQuestions.java
├── SetQuestions.java
├── MapQuestions.java
├── QueueQuestions.java
└── ConcurrentCollectionQuestions.java
```

Topics:

- ArrayList
- LinkedList
- HashSet
- LinkedHashSet
- TreeSet
- HashMap
- LinkedHashMap
- TreeMap
- PriorityQueue
- Deque
- ConcurrentHashMap
- Comparable
- Comparator

---

## 05. Generics

```text
generics/
└── GenericQuestions.java
```

Topics:

- Generic classes
- Generic methods
- Bounded types
- Wildcards
- `extends`
- `super`
- Type safety
- PECS

---

## 06. Exception Handling

```text
exceptions/
└── ExceptionQuestions.java
```

Topics:

- Checked exceptions
- Unchecked exceptions
- Custom exceptions
- `try-catch`
- `finally`
- try-with-resources
- Exception propagation
- `throw`
- `throws`

---

## 07. Functional Programming

```text
functional/
└── FunctionalQuestions.java
```

Topics:

- Functional interfaces
- Lambda expressions
- Method references
- Predicate
- Function
- Consumer
- Supplier
- BiFunction
- Custom functional interfaces

---

## 08. Stream API

```text
streams/
└── StreamQuestions.java
```

This package is expected to contain a large number of interview questions.

Examples:

```text
question01_filterEmployees()
question02_findHighestSalary()
question03_findSecondHighestSalary()
question04_groupByDepartment()
question05_countByDepartment()
question06_partitionEmployees()
question07_convertListToMap()
question08_findDuplicateElements()
question09_findFirstNonRepeatedCharacter()
question10_flattenNestedList()
```

Topics:

- `filter`
- `map`
- `flatMap`
- `sorted`
- `distinct`
- `limit`
- `skip`
- `reduce`
- `collect`
- `groupingBy`
- `partitioningBy`
- `mapping`
- `joining`
- `maxBy`
- `minBy`
- `counting`
- Parallel streams

---

## 09. Optional

```text
optional/
└── OptionalQuestions.java
```

Topics:

- `Optional.of`
- `Optional.ofNullable`
- `Optional.empty`
- `map`
- `flatMap`
- `filter`
- `orElse`
- `orElseGet`
- `orElseThrow`

---

## 10. Date & Time

```text
datetime/
└── DateTimeQuestions.java
```

Topics:

- LocalDate
- LocalTime
- LocalDateTime
- ZonedDateTime
- Instant
- Duration
- Period
- Date formatting
- Date conversion

---

## 11. Java I/O

```text
io/
└── IOQuestions.java
```

Topics:

- File
- InputStream
- OutputStream
- Reader
- Writer
- Buffered streams
- Serialization
- NIO
- Files
- Paths

---

# 🧵 12. Concurrency

Concurrency is an important interview area and may require multiple classes.

```text
concurrency/
│
├── ThreadQuestions.java
├── ExecutorQuestions.java
├── CompletableFutureQuestions.java
├── SynchronizationQuestions.java
├── LockQuestions.java
├── AtomicQuestions.java
└── ConcurrentCollectionQuestions.java
```

Topics:

- Thread
- Runnable
- Callable
- Future
- ExecutorService
- ThreadPool
- FixedThreadPool
- ScheduledExecutorService
- CompletableFuture
- `thenApply`
- `thenCompose`
- `thenCombine`
- `allOf`
- `anyOf`
- synchronized
- volatile
- AtomicInteger
- ReentrantLock
- CountDownLatch
- CyclicBarrier
- Semaphore
- Race conditions
- Deadlock
- Producer/Consumer

---

# 🧠 13. JVM

```text
jvm/
├── JVMQuestions.java
├── ClassLoadingQuestions.java
└── GarbageCollectionQuestions.java
```

Topics:

- JVM architecture
- JDK vs JRE vs JVM
- ClassLoader
- Heap
- Stack
- Metaspace
- Garbage Collection
- Young Generation
- Old Generation
- JIT
- Runtime memory
- StackOverflowError
- OutOfMemoryError

---

# 💾 14. Memory

```text
memory/
└── MemoryQuestions.java
```

Topics:

- Object creation
- References
- Garbage collection
- Memory leaks
- Immutable objects
- String pool
- WeakReference
- SoftReference
- ThreadLocal
- Java Memory Model

---

# ⚡ 15. Reactive Programming

Reactive programming is maintained as a Java-focused topic.

```text
reactive/
│
├── basics/
│   └── ReactiveBasics.java
│
├── operators/
│   └── ReactiveOperators.java
│
├── transformation/
│   └── TransformationQuestions.java
│
├── errorhandling/
│   └── ErrorHandlingQuestions.java
│
├── concurrency/
│   └── ReactiveConcurrency.java
│
├── backpressure/
│   └── BackpressureQuestions.java
│
└── scenarios/
    └── ReactiveScenarios.java
```

Topics:

- Mono
- Flux
- Publisher
- Subscriber
- Subscription
- Backpressure
- map
- filter
- flatMap
- concatMap
- flatMapSequential
- zip
- merge
- concat
- reduce
- switchIfEmpty
- onErrorReturn
- onErrorResume
- retry
- retryWhen
- timeout
- Scheduler
- publishOn
- subscribeOn

Spring WebFlux should **not** be added here.

---

# 🧩 16. DSA

DSA is implemented using Java.

```text
dsa/
│
├── arrays/
│   └── ArrayQuestions.java
│
├── strings/
│   └── StringQuestions.java
│
├── linkedlist/
│   └── LinkedListQuestions.java
│
├── stack/
│   └── StackQuestions.java
│
├── queue/
│   └── QueueQuestions.java
│
├── recursion/
│   └── RecursionQuestions.java
│
├── sorting/
│   └── SortingQuestions.java
│
├── searching/
│   └── SearchingQuestions.java
│
├── tree/
│   └── TreeQuestions.java
│
├── graph/
│   └── GraphQuestions.java
│
├── heap/
│   └── HeapQuestions.java
│
├── slidingwindow/
│   └── SlidingWindowQuestions.java
│
└── dynamicprogramming/
    └── DPQuestions.java
```

---

# 🎨 17. Design Patterns

```text
designpatterns/
│
├── creational/
│   ├── Singleton.java
│   ├── Factory.java
│   └── Builder.java
│
├── structural/
│   ├── Adapter.java
│   ├── Decorator.java
│   └── Facade.java
│
└── behavioral/
    ├── Strategy.java
    ├── Observer.java
    └── TemplateMethod.java
```

Design patterns are implementation exercises rather than normal question/test pairs.

---

# 📝 Question Naming Convention

Use this format:

```text
question01_<shortDescription>
question02_<shortDescription>
question03_<shortDescription>
```

Examples:

```java
question01_findDuplicateElements()

question02_findSecondHighestSalary()

question03_groupEmployeesByDepartment()

question04_findFirstNonRepeatedCharacter()
```

### Do not use

```text
test1()
test2()
abc()
demo()
practice()
newMethod()
```

The method name should tell you what the problem is.

---

# 📊 Difficulty Convention

Every question should have a difficulty:

```text
Easy
Medium
Hard
```

Example:

```java
/*
 * Q15 - Find second highest salary
 *
 * Difficulty: Medium
 * Concepts: Stream API, grouping, sorting
 */
```

Do not create separate packages such as:

```text
easy/
medium/
hard/
```

Difficulty belongs to the **question**, while packages represent the **technology/concept**.

This makes the repository easier to navigate as it grows.

---

# 🧪 Testing Standard

Where practical, use **JUnit 5** for validation.

For normal Java problems:

```java
@Test
void question01_findDuplicates() {

    List<Integer> input =
            List.of(1, 2, 2, 3, 4, 4);

    List<Integer> result =
            findDuplicates(input);

    assertEquals(
            List.of(2, 4),
            result
    );
}
```

For Reactive Programming, use **Reactor Test / StepVerifier**.

```java
@Test
void question01_filterEvenNumbers() {

    Flux<Integer> result =
            Flux.range(1, 10)
                .filter(n -> n % 2 == 0);

    StepVerifier.create(result)
            .expectNext(2, 4, 6, 8, 10)
            .verifyComplete();
}
```

---

# 🧱 Standard Question Template

Use this template whenever adding a new question:

```java
/*
 * =====================================================
 * Q01 - Find Duplicate Elements
 * =====================================================
 *
 * Problem:
 * Given a list of integers, find all duplicate elements.
 *
 * Example:
 * Input  : [1, 2, 3, 2, 4, 1]
 * Output : [1, 2]
 *
 * Difficulty: Easy
 *
 * Concepts:
 * - HashSet
 * - Collections
 *
 * Interview Focus:
 * - Time Complexity
 * - Space Complexity
 *
 * =====================================================
 */

static List<Integer> question01_findDuplicates(
        List<Integer> numbers) {

    // TODO: Implement
    return null;
}
```

---

# 🔢 Question Numbering

Question numbers should be **unique within a class**.

Example:

```text
StreamQuestions.java

Q01
Q02
Q03
...
Q50
```

When the class becomes too large, split it by logical concept.

Example:

```text
StreamQuestions.java
AdvancedStreamQuestions.java
StreamGroupingQuestions.java
```

Do **not** create:

```text
Question01.java
Question02.java
Question03.java
```

unless a question genuinely requires a separate class or data structure.

---

# 🔀 When Should a Class Be Split?

Start with:

```text
StreamQuestions.java
```

If it grows to something like:

```text
3000+ lines
```

split it logically:

```text
streams/
├── StreamBasicQuestions.java
├── StreamIntermediateQuestions.java
├── StreamAdvancedQuestions.java
└── StreamGroupingQuestions.java
```

The rule is:

> **Split by concept, not by question number.**

---

# 🧪 Practice Workflow

For every new question:

```text
1. Read the problem
       ↓
2. Identify the concept
       ↓
3. Add it to the correct package
       ↓
4. Create a question method
       ↓
5. Try the solution yourself
       ↓
6. Write a test
       ↓
7. Check edge cases
       ↓
8. Analyze time/space complexity
       ↓
9. Add interview notes
       ↓
10. Mark the question as completed
```

---

# 📌 Question Status

Maintain progress in the README or a separate tracker.

Recommended status:

```text
⬜ Not Started
🟡 Practicing
🟢 Solved
🔵 Revised
🔴 Needs Revision
```

Example:

```text
Streams

🟢 Q01 - Filter employees
🟢 Q02 - Group employees
🔵 Q03 - Highest salary
🔴 Q04 - Complex grouping
⬜ Q05 - Partition employees
```

---

# 📖 Interview Revision Rule

A question is considered **interview-ready** only when you can:

- Explain the approach
- Write the solution without searching
- Explain the important Java API/operator
- Explain time complexity
- Explain space complexity
- Handle edge cases
- Explain an alternative approach

---

# 🧹 Code Quality Rules

Keep practice code close to production-quality Java.

### Follow

- Meaningful names
- Small methods
- Proper indentation
- Avoid unnecessary code
- Avoid duplicated logic
- Use appropriate Java APIs
- Prefer immutable data where practical
- Handle edge cases
- Add tests
- Add complexity notes for DSA

### Avoid

```java
System.out.println("hello");
```

as the only form of verification.

Prefer tests where the result can be asserted.

---

# ☕ Java Version

The project should use a modern LTS Java version.

Current target:

```text
Java 21
```

When practicing version-specific features, clearly identify them:

```text
java8/
java11/
java17/
java21/
```

Do not force newer APIs into questions specifically intended to test older Java versions.

---

# 📦 Maven

The root `pom.xml` should control common configuration.

Recommended:

```text
Java 21
Maven
JUnit 5
AssertJ
Reactor Core
Reactor Test
```

Only add an external dependency when it is actually useful for a Java concept being practiced.

Keep the project lightweight.

---

# 📈 Growth Strategy

The repository should grow like this:

```text
Phase 1
Core Java
    ↓
Phase 2
Collections + Streams
    ↓
Phase 3
Concurrency
    ↓
Phase 4
JVM + Memory
    ↓
Phase 5
Reactive
    ↓
Phase 6
DSA
    ↓
Phase 7
Design Patterns
```

Do not create a new Maven project when adding a new Java topic.

Add a **package/class** instead.

---

# 🚫 Project Boundary

This repository is for:

> **Java language and Java-based programming practice.**

Keep these outside:

```text
Spring Boot
Spring MVC
Spring Security
Spring Data
Spring Cloud
Microservices
Kafka
Docker
AWS
SQL
System Design
```

Those should have their own dedicated repositories so that each repository has a clear purpose.

---

# 🎯 Final Goal

This repository should eventually become a personal Java reference containing:

```text
100+ Core Java Questions
100+ Stream/Collection Questions
100+ DSA Problems
50+ Concurrency Problems
30+ JVM/Memory Exercises
30+ Reactive Problems
20+ Design Pattern Implementations
```

The goal is **not simply to collect questions**.

The goal is to build enough hands-on practice that common Java interview problems can be solved and explained from memory.

---

## Repository Principle

> **One repository.  
> One Maven project.  
> One standard structure.  
> Packages represent concepts.  
> Classes group related questions.  
> Methods represent individual problems.  
> Tests verify solutions.  
> README tracks progress.  
> New topics extend the structure instead of creating unnecessary projects.**

---
