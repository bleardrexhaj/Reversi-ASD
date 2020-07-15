package com.asd.reversi.visitor;


import com.asd.reversi.reversi.player.ComputerPlayer;
import com.asd.reversi.reversi.player.HumanPlayer;
import com.asd.reversi.reversi.state.StateDraw;
import com.asd.reversi.reversi.state.StateWinNegative;
import com.asd.reversi.reversi.state.StateWinPositive;


public interface Accept{

	public void accept(Visitor visitor);

}
