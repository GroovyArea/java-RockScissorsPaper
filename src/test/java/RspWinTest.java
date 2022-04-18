import Controller.Controller;
import Model.Computer;
import Model.ComputerNumber;
import Model.Player;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import Enum.*;
import Exception.RspException;

import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.CoreMatchers.is;

public class RspWinTest {

    private Result result;

    @Test
    @DisplayName("게임 졌을 경우")
    void gameLoseResult() throws RspException {
       result = Result.getGameResult(Rsp.PAPER, Rsp.ROCK);

        assertThat(result == Result.LOSE);
    }

    /*@Test
    @DisplayName("유저 : 주먹, 컴퓨터 : 가위")
    void gameWin2(){
        result = Result.getGameResult(Rsp.ROCK, Rsp.SCISSORS);

        assertThat(result == Result.LOSE);
    }

    @Test
    @DisplayName("유저 : 가위, 컴터 : 보")
    void gameLose3(){
        result = Result.getGameResult(Rsp.SCISSORS, Rsp.PAPER);

        assertThat(result ==Result.getGameResult(Rsp.SCISSORS, Rsp.ROCK));
    }*/

    @Test
    @DisplayName("게임에 이겼을 경우")
    void gameWin(){
        result = Result.getGameResult(Rsp.SCISSORS, Rsp.PAPER);

        assertThat(result == Result.WIN);
    }

    @Test
    @DisplayName("게임에 비겼을 경우")
    void gameDraw(){
        result = Result.getGameResult(Rsp.ROCK,Rsp.ROCK);

        assertThat(result == Result.DRAW);
    }
}
