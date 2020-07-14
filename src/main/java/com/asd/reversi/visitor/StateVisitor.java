package com.asd.reversi.visitor;



import com.asd.reversi.reversi.player.ComputerPlayer;
import com.asd.reversi.reversi.player.HumanPlayer;

import com.asd.reversi.reversi.state.StateDraw;
import com.asd.reversi.reversi.state.StateWinNegative;
import com.asd.reversi.reversi.state.StateWinPositive;


public class StateVisitor implements Visitor{

@Override
public void visitClass(StateWinPositive win) {
	win.checkWinOrDraw();
	
}

@Override
public void visitClass(StateDraw draw) {
	draw.checkWinOrDraw();
	
}

@Override
public void visitClass(StateWinNegative loose) {
	loose.checkWinOrDraw();
	
}

	@Override
	public void visitClass(ComputerPlayer computerPlayer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitClass(HumanPlayer hpl) {
		// TODO Auto-generated method stub
		
	}

	

}
