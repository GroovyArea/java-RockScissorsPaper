import Enum.*;
import Model.WinDrawCount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import Exception.*;

import static org.assertj.core.api.Assertions.*;

public class WinDrawCountTest {

    @Test
    @DisplayName("게임 이겼을 시 카운트 개수")
    void winCount() throws GameCountException {
        Result.gameCount(Result.WIN);
        int winCount = WinDrawCount.getWinCount();

        assertThat(winCount == 1).isTrue();
    }

    @Test
    @DisplayName("게임 비겼을 시 카운트 개수")
    void drawCount() throws GameCountException {
        Result.gameCount(Result.DRAW);
        int drawCount = WinDrawCount.getDrawCount();

        assertThat(drawCount == 1).isTrue();
    }

}
