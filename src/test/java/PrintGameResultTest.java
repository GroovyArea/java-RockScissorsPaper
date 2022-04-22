import Enum.*;
import Exception.RspException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import Enum.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;


public class PrintGameResultTest {

    private List<Result> results;

    private List<PrintGameResult> resultMessages;

    // 게임에서 진 경우와 이긴 경우의 결과 메세지가 잘 나오는지 살펴보자

    static Stream<Arguments> rspResultsAndPrints(){
        return Stream.of(
                Arguments.arguments(Result.WIN, PrintGameResult.WIN_RESULT),
                Arguments.arguments(Result.LOSE, PrintGameResult.LOSE_RESULT),
                Arguments.arguments(Result.DRAW, PrintGameResult.DRAW_RESULT)
        );
    }

    @ParameterizedTest(name = "게임 결과 : {0}, 출력 메시지 : {1}")
    @MethodSource("rspResultsAndPrints")
    @DisplayName("게임 결과 메시지가 상황에 맞게 잘 나오니?")
    void ofTest(Result result, PrintGameResult printGameResult){
        assertThat(PrintGameResult.of(result)).isEqualTo(printGameResult);
    }



}
