package com.asd.reversi.reversi.state;

import com.asd.reversi.visitor.Accept;
import com.asd.reversi.visitor.Visitor;

public class StateWinPositive implements IState,Accept {

	private static final long serialVersionUID = 1L;

	@Override
	public String checkWinOrDraw() {
		return "white won the game";
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitClass(this);
		
	}
}
