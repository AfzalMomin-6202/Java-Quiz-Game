package com.QuizGame;

public class MCQ extends Question{
	
	public MCQ(String questionText,String options[],String correctAnswer,String difficulty)
	{
		super(questionText,options,correctAnswer,difficulty);
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
