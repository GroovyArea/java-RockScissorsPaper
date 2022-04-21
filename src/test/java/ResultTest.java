import Model.Computer;
import Model.ComputerNumber;
import Model.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import Enum.*;
import Exception.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.CoreMatchers.is;

public class ResultTest {

    // 게임 결과가 잘 나오는지 판단해야댐
    // 어떻게 해볼가..?
    private Player player;
    private Computer computer;

    @BeforeEach
    void playerComputerRsp() {
        player = new Player(Rsp.SCISSORS);
        computer = new Computer(Rsp.PAPER.getValue());
    }

    @Test
    @DisplayName("사용자 가위, 컴퓨터 보 => 이긴 결과")
    void resultTest() throws RspException {
        Result result = Result.getGameResult(player.getRsp(), computer.getComRsp());
        assertThat(result == Result.WIN).isTrue();
    }

    @Test
    @DisplayName("진 결과가 들어갈 경우 예외 발생")
    void validResultTest() {
        assertThatExceptionOfType(GameCountException.class)
                .isThrownBy(() -> Result.gameCount(Result.LOSE)).withMessage("진 결과를 받아올 수 없습니다.");
    }

}
