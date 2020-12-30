package com.kodilla.tictactoe;

import java.io.Serializable;
import java.lang.reflect.Field;

public class GameState {
    public com.kodilla.tictactoe.Field[][] getBoardFields() {
    }

    public class GameState implements Serializable {

        private Field[][] boardFields;
        private int playerScore;
        private int cpuScore;

        public GameState(Field[][] boardFields, int playerScore, int cpuScore) {
            this.boardFields = boardFields;
            this.playerScore = playerScore;
            this.cpuScore = cpuScore;
        }

        public Field[][] getBoardFields() {
            return boardFields;
        }

        public int getPlayerScore() {
            return playerScore;
        }

        public int getCpuScore() {
            return cpuScore;
        }
    }
}
