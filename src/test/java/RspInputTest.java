import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import Enum.*;
import Exception.*;
import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.CoreMatchers.is;

public class RspInputTest {

    @Test
    @DisplayName("입력한 정수가 enum 값으로 잘 바뀌었는지")
    void rspInput() throws RspException {
        Rsp rsp = Rsp.ROCK;

        Rsp input = Rsp.of(1);

        assertThat(rsp == input);
    }
}
