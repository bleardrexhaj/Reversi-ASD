package com.asd.reversi.visitor;



import com.asd.reversi.reversi.player.ComputerPlayer;
import com.asd.reversi.reversi.player.HumanPlayer;
import com.asd.reversi.reversi.state.StateDraw;
import com.asd.reversi.reversi.state.StateWinNegative;
import com.asd.reversi.reversi.state.StateWinPositive;


public interface Visitor {

	public void visitClass(ComputerPlayer computerPlayer);
	public void visitClass(HumanPlayer humanPlayer);
	
	public void visitClass(StateWinPositive win);
	public void visitClass(StateDraw draw);
	public void visitClass(StateWinNegative loose);
	

}
