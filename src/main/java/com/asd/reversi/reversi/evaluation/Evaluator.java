package com.asd.reversi.reversi.evaluation;

import com.asd.reversi.visitor.Visitor;

public interface Evaluator {
    int eval(int[][] board,int player);
  
}
