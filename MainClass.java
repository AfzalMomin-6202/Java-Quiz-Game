package com.QuizGame;

import java.util.*;
public class MainClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name=sc.next();
		
		System.out.println("Are you ready??????");
		String deci=sc.next();
		if(deci.equals("yes")|| deci.equals("Yes")) {
			System.out.println("<----------RULES OF QUIZ----------->");
			System.out.println("1. You will get 3 Questions");
			System.out.println("2.No time limit");
			System.out.println("3.Out of three questions 1 MCQ , 1 True Or False , 1 Syntax Error question");
			System.out.println("4.This is going to test your java skills.");
			System.out.println("All the best👍");
			System.out.println("Accept/Reject");
			String deci2=sc.next();
			if(deci2.equals("Accept"))
			{
				Player p1=new Player(name);
				MCQ[] mcqBank = {
					    new MCQ("1. What is the main purpose of a method in Java?", new String[]{"A)To store data permanently","B)To increase memory usage","C)To perform a specific task and promote code reusability","D)To create objects"}, "C", "Easy"),
					    new MCQ("2. Which of the following is mandatory in every method declaration?",new String[] {"A. Constructor name","B. Return type (or void) and method name","C. Object creation","D. Package declaration"},"B","Easy"),
					    new MCQ("3. What happens if a non-void method does not return a value on all execution paths?",new String[] {"A. Runtime Error","B. Compilation Error","C. Returns 0 automatically","D. Returns null automatically"},"B","Easy")
					};
				TrueOrFalse[] trueOrFalseBank= {new TrueOrFalse("1. A static method can be overridden in a child class.","False","Easy"),
						                        new TrueOrFalse("2. A reference variable of a parent class can refer to an object of its child class.","True","Medium"),
						                        new TrueOrFalse("3. A final reference variable cannot be used to modify the object's state.","False","Hard")
				    };
				SyntaxError[] errorBank= {new SyntaxError("1. class Demo {\r\n"
						+ "    void display() {\r\n"
						+ "        return 10;\r\n"
						+ "    }\r\n"
						+ "} ","Void cannot return a value","Easy","class Demo {\r\n"
								+ "    void display() {\r\n"
								+ "        return;\r\n"
								+ "    }\r\n"
								+ "}"),
						             new SyntaxError("2. class Demo {\r\n"
						             		+ "    int test() {\r\n"
						             		+ "        System.out.println(\"Java\");\r\n"
						             		+ "    }\r\n"
						             		+ "}","Missing return statement","Easy","class Demo {\r\n"
						             				+ "    int display() {\r\n"
						             				+ "        return 10;\r\n"
						             				+ "    }\r\n"
						             				+ "}"),
						             new SyntaxError("3. class Demo {\r\n"
						             		+ "    static void test() {\r\n"
						             		+ "        System.out.println(\"Java\");\r\n"
						             		+ "    }\r\n"
						             		+ "\r\n"
						             		+ "    public static void main(String[] args) {\r\n"
						             		+ "        test;\r\n"
						             		+ "    }\r\n"
						             		+ "}","Method call missing parentheses","Easy","class Demo {\r\n"
						             				+ "    static void test() {\r\n"
						             				+ "        System.out.println(\"Java\");\r\n"
						             				+ "    }\r\n"
						             				+ "\r\n"
						             				+ "    public static void main(String[] args) {\r\n"
						             				+ "        test();\r\n"
						             				+ "    }\r\n"
						             				+ "}")
				             };
				
				Random rand = new Random();
				int randomIndex = rand.nextInt(mcqBank.length);
				int randomIndex1 = rand.nextInt(trueOrFalseBank.length);
				int randomIndex2 = rand.nextInt(errorBank.length);
				
//				MCQ
				MCQ selectedMCQ = mcqBank[randomIndex];
				selectedMCQ.displayQuestion();
				String ans1 = sc.next();
				if(ans1.equals(selectedMCQ.getCorrectAnswer())) {
				    System.out.println("Correct!");
				    p1.updateScore();
				} else {
				    System.out.println("Wrong!");
				}
				
//				TrueOrFalse
				TrueOrFalse selectedTOrF = trueOrFalseBank[randomIndex1];
				selectedTOrF.displayQuestion();
				String ans2 = sc.next();
				if(ans2.equals(selectedTOrF.getCorrectAnswer())) {
				    System.out.println("Correct!");
				    p1.updateScore();
				} else {
				    System.out.println("Wrong!");
				}
				
//				SyntaxError
				SyntaxError selectedError = errorBank[randomIndex2];
				selectedError.displayQuestion();
				String ans3 = sc.next();
				if(ans3.equals(selectedError.getCorrectAnswer())) {
				    System.out.println("Correct!");
				    p1.updateScore();
				} else {
				    System.out.println("Wrong!");
				}
				
				System.out.println("Game Over!");
				System.out.println(p1.getName() + " your score is: " + p1.getScore() + "/3");

				if(p1.getScore() == 3) {
				    System.out.println("You are great in Java! 🎉");
				} else {
				    System.out.println("Try again! 💪");
				}
				
		}
			else {
				System.exit(0);
			}
	}
		else {
			System.out.println("Maybe next time....");
			System.exit(0);
		}
   }
}
