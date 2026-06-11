package com.QuizGame;

public class Player {
	private String name;
	private int score;
	
	
	public Player(String name)
	{
		this.name=name;
	}
	void updateScore()
	{
		score=score+1;
	}
	
	public String getName()
	{
		return name;
	}
	public int getScore()
	{
		return score;
	}

}
