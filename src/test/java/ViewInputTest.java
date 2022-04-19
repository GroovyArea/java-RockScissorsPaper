import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import Enum.*;
import Exception.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.CoreMatchers.is;


public class ViewInputTest {

    @Test
    @DisplayName("입력한 정수가 enum 값으로 잘 바뀌었는지")
    void rspInput() throws RspException {
        Rsp rsp = Rsp.ROCK;

        Rsp input = Rsp.of(1);

        assertThat(rsp == input).isTrue();
    }


    @ParameterizedTest
    @ValueSource(ints = {4, -2, 199, 349})
    @DisplayName("잘못 입력했을 경우 예외")
    void rspInputFail(int value){
        assertThatExceptionOfType(RspException.class)
                .isThrownBy(() -> Rsp.of(value))
                .withMessage("가위바위보 입력이 잘못 되었습니다.");
    }
}
