import Model.ComputerNumber;
import Enum.*;
import Exception.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

public class ComputerNumberTest {

    @Test
    @DisplayName("컴퓨터 자동 번호들이 범위 안에서 잘 생성되는지?")
    void test() {
        for (int i = 0; i < 10; i++) {
            ComputerNumber computerNumber = new ComputerNumber();

            assertThat(computerNumber.getComputerNumber() == 1 ||
                    computerNumber.getComputerNumber() == 2 ||
                    computerNumber.getComputerNumber() == 3).isTrue();
        }

    }
}

