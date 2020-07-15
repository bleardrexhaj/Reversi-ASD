package com.asd.reversi.reversi.state;

import com.asd.reversi.visitor.Accept;
import com.asd.reversi.visitor.Visitor;

public class StateWinNegative implements IState,Accept  {
	private static final long serialVersionUID = 1L;
	private String  status="Negative Win";

	@Override
	public String checkWinOrDraw() {
		return  "Black stone won the game ";
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public void accept(Visitor visitor) {
		visitor.visitClass(this);
		
	}

}
