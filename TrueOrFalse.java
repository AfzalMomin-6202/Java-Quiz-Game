package com.QuizGame;

public class TrueOrFalse extends Question {
	
	public TrueOrFalse(String questionText,String correctAnswer,String difficulty)
	{
		super(questionText,new String[]{"True","False"},correctAnswer,difficulty);
		
	}
	
	@Override
	public void displayQuestion() {
		String[] options = getOptions();
		System.out.println(getQuestionText());
		for(int i=0; i < options.length; i++){
		    System.out.println(options[i]);
		}
	}
}
