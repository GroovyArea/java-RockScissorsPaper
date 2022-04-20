import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import Enum.*;
import Exception.*;

import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.CoreMatchers.is;

public class ResultTest {

    private Result result;

    @Test
    @DisplayName("게임 졌을 경우")
    void gameLoseResult() {
        result = Result.getGameResult(Rsp.PAPER, Rsp.ROCK);

        assertThat(result == Result.LOSE).isTrue();
    }

    @Test
    @DisplayName("게임에 이겼을 경우")
    void gameWin() {
        result = Result.getGameResult(Rsp.SCISSORS, Rsp.PAPER);

        assertThat(result == Result.WIN).isTrue();
    }

    @Test
    @DisplayName("게임에 비겼을 경우")
    void gameDraw() {
        result = Result.getGameResult(Rsp.ROCK, Rsp.ROCK);

        assertThat(result == Result.DRAW).isTrue();
    }

    @Test
    @DisplayName("진 결과가 들어갈 경우 예외 발생")
    void validResultTest() {
        assertThatExceptionOfType(GameCountException.class)
                .isThrownBy(() -> Result.gameCount(Result.LOSE)).withMessage("진 결과를 받아올 수 없습니다.");
    }

}
