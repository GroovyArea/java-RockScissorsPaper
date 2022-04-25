import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import Enum.*;
import Exception.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.CoreMatchers.is;


public class ViewInputTest {

/*    @Test
    @DisplayName("입력한 정수가 enum 값으로 잘 바뀌었는지")
    void rspInput() throws RspException {
        Rsp rsp = Rsp.ROCK;

        Rsp input = Rsp.of(1);

        assertThat(rsp == input).isTrue();
    }*/

    static Stream<Arguments> rsp(){
        return Stream.of(
          Arguments.arguments(1, Rsp.ROCK),
          Arguments.arguments(2, Rsp.SCISSORS),
          Arguments.arguments(3, Rsp.PAPER)
        );
    }

    @ParameterizedTest(name = "입력 값 : {0}, 가위바위보 값 : {1}")
    @MethodSource("rsp")
    @DisplayName("입력 값에 맞는 가위바위보로 변경되는지")
    void ofTest(Integer integer, Rsp rsp) throws RspException {
        assertThat(Rsp.of(integer)).isEqualTo(rsp);
    }


    @ParameterizedTest
    @ValueSource(ints = {4, -2, 199, 349})
    @DisplayName("잘못 입력했을 경우 예외")
    void rspInputFail(int value) {
        assertThatExceptionOfType(RspException.class)
                .isThrownBy(() -> Rsp.of(value))
                .withMessage(value + "은 잘못된 입력값입니다. 1, 2, 3의 숫자 중 하나를 입력하세요.");
    }
}
