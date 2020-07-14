package com.asd.reversi.reversi.player;

import com.asd.reversi.visitor.Accept;
import com.asd.reversi.visitor.Visitor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HumanPlayer implements Player,Accept{

    private String name;
    private int flag;

    public HumanPlayer(String name, int flag){
        this.name = name;
        this.flag = flag;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getFlag() {
        return flag;
    }

	@Override
	public void accept(Visitor visitor) {
		visitor.visitClass(this);
		
	}
}
