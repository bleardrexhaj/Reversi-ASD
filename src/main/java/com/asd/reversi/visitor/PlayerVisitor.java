package com.asd.reversi.visitor;



import com.asd.reversi.reversi.model.MoveDetails;
import com.asd.reversi.reversi.player.ComputerPlayer;
import com.asd.reversi.reversi.player.HumanPlayer;
import com.asd.reversi.reversi.state.StateDraw;
import com.asd.reversi.reversi.state.StateWinNegative;
import com.asd.reversi.reversi.state.StateWinPositive;


public class PlayerVisitor implements Visitor{

private int[][] board;
private int player;
private MoveDetails move;

	@SuppressWarnings("static-access")
	@Override
	public void visitClass(ComputerPlayer computerPlayer) {
		computerPlayer.getNewBoardAfterMove(board, move, player);
		
	}

	@Override
	public void visitClass(HumanPlayer humanPlayer) {
		humanPlayer.getFlag();
		
	}

	@Override
	public void visitClass(StateWinPositive win) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitClass(StateDraw draw) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitClass(StateWinNegative loose) {
		// TODO Auto-generated method stub
		
	}

}
