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

    static List<Integer> autoNumbers() {
        final List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            ComputerNumber computerNumber = new ComputerNumber();
            numbers.add(computerNumber.getComputerNumber());
        }

        return numbers;
    }

    @Test
    @DisplayName("컴퓨터 자동 번호들이 범위 안에서 잘 생성되는지?")
    void test() {
        assertThat(autoNumbers()).contains(1,2,3);
    }
}

