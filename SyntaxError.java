package com.QuizGame;

public class SyntaxError extends Question {
	private String errorCode;
	
	public SyntaxError(String questionText,String correctAnswer,String difficulty,String errorCode)
	{
		super(questionText,new String[] {"Find the error"},correctAnswer,difficulty);
		this.errorCode=errorCode;	
	}
	
	@Override
	public void displayQuestion() {
		System.out.println(getQuestionText());
//		System.out.println(getErrorCode());
		}
		
	
	
	public String getErrorCode() {
		return errorCode;
	}

}
