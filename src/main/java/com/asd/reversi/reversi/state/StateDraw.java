package com.asd.reversi.reversi.state;

import com.asd.reversi.visitor.Accept;
import com.asd.reversi.visitor.Visitor;

public class StateDraw  implements IState,Accept{

	private String  status;
	private static final long serialVersionUID = 1L;

@Override
public String checkWinOrDraw() {
	return "the game is drawn ";

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
