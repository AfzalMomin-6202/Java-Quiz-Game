package com.QuizGame;

public abstract class Question {
	private String questionText;
	private String options[]=new String[4];
	private String correctAnswer;
	private String difficulty;
	
	public abstract void displayQuestion();
	
	public Question(String questionText,String options[],String correctAnswer,String difficulty)
	{
		this.questionText=questionText;
		this.options=options;
		this.correctAnswer=correctAnswer;
		this.difficulty=difficulty;
	}
	public String  getQuestionText()
	{
		return questionText;
	}
	
	public String[] getOptions()
	{
		return options;
	}
	public String getCorrectAnswer()
	{
		return correctAnswer;
	}
	public String getDifficulty()
	{
		return difficulty;
	}
	
	
	
}
