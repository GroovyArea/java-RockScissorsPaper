import Model.ComputerNumber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ComputerNumberTest {

    private List<Integer> rspNumbers;

    @BeforeEach
    void Numbers() {
       rspNumbers = Arrays.asList(1, 2, 3);
    }

    @Test
    @DisplayName("컴퓨터 자동 번호가 잘 생성되었니?")
    void computerNumber() {
        ComputerNumber computerNumber = new ComputerNumber();
        Integer number = computerNumber.getComputerNumber();

        assertThat(rspNumbers).contains(number);
    }
}

