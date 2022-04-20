import Enum.*;
import Exception.RspException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import Enum.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;


public class PrintGameResultTest {

    private List<Result> results;

    private List<PrintGameResult> resultMessages;

    @BeforeEach
    void beforeResults() {
        results = Arrays.asList(Result.WIN, Result.DRAW, Result.LOSE);
    }

    @BeforeEach
    void beforeMessages() {
        resultMessages = Arrays.asList(PrintGameResult.WIN_RESULT,PrintGameResult.DRAW_RESULT,PrintGameResult.LOSE_RESULT);
    }


    @Test
    @DisplayName("게임 결과 메시지가 상황에 맞게 잘 나오니?")
    void ofTest() {
        int i = 0;
        for (Result result : results){
            assertThat(PrintGameResult.of(result) == resultMessages.get(i)).isTrue();
            i++;
        }

    }



}
