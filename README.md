# 🎯 Java Quiz Game

A console-based Java Quiz Game that tests your Java programming knowledge through three types of questions — MCQ, True/False, and Syntax Error. Built using core Object-Oriented Programming concepts.

---

## 📌 About the Project

This project was built to demonstrate the practical application of OOP principles in Java. The game randomly selects one question from each category every time it runs, ensuring a different experience each session.

---

## 🚀 How to Run

1. Clone the repository
   ```
   git clone https://github.com/AfzalMomin-6202/Java-Quiz-Game.git
   ```
2. Open the project in **IntelliJ IDEA** or any Java IDE
3. Run `MainClass.java`
4. Follow the on-screen instructions and play!

---

## 🎮 Game Flow

```
Enter your name
     ↓
Are you ready? (Yes/No)
     ↓
Rules displayed → Accept/Reject
     ↓
Question 1 → MCQ
Question 2 → True/False
Question 3 → Syntax Error
     ↓
Final Score displayed
     ↓
"You are great in Java!" or "Try again!"
```

---

## 🏗️ Project Structure

```
com.QuizGame
│
├── Question.java         → Abstract parent class
├── MCQ.java              → Multiple Choice Question
├── TrueOrFalse.java      → True/False Question
├── SyntaxError.java      → Find the bug Question
├── Player.java           → Stores player name and score
└── MainClass.java        → Game entry point and logic
```

---

## 🧠 OOP Concepts Used

| Concept | How it's used |
|---|---|
| **Encapsulation** | All fields are `private` with public getters |
| **Inheritance** | `MCQ`, `TrueOrFalse`, `SyntaxError` extend `Question` |
| **Abstraction** | `Question` is an abstract class with abstract `displayQuestion()` |
| **Polymorphism** | Each child class overrides `displayQuestion()` differently |

---

## 📸 Sample Output

```
Enter your name: Afzal
Are you ready??????
Yes
<----------RULES OF QUIZ----------->
1. You will get 3 Questions
2. No time limit
3. Out of three questions 1 MCQ, 1 True Or False, 1 Syntax Error question
4. This is going to test your java skills.
All the best👍
Accept/Reject
Accept

1. What is the main purpose of a method in Java?
A) To store data permanently
B) To increase memory usage
C) To perform a specific task and promote code reusability
D) To create objects
C
Correct!

1. A static method can be overridden in a child class.
True
False
False
Correct!

...

Game Over!
Afzal your score is: 3/3
You are great in Java! 🎉
```

---

## 🛠️ Technologies Used

- **Language:** Java
- **IDE:** IntelliJ IDEA
- **Concepts:** OOP, Arrays, Random, Scanner

---

## 👨‍💻 Author

**Afzal Momin**
- GitHub: [@AfzalMomin-6202](https://github.com/AfzalMomin-6202)
- Portfolio: [My Portfolio](https://afzalmomin-6202.github.io/My-Portfolio)
