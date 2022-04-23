package Enum;

import Model.WinDrawCount;
import Exception.GameCountException;

public enum Result {

    WIN, LOSE, DRAW;

    private static final String RESULT_EXCEPTION = "진 결과를 받아올 수 없습니다.";

    // 결과 로직 반환
    public static Result getGameResult(Rsp player, Rsp com) {

        // 이김
        if (com == Rsp.ROCK && player == Rsp.PAPER
                || com == Rsp.SCISSORS && player == Rsp.ROCK
                || com == Rsp.PAPER && player == Rsp.SCISSORS) {
            return WIN;
        }

        // 비김
        if (com == player) {
            return DRAW;
        }

        // 짐
        return LOSE;
    }

    // enum 타입 결과를 매개변수로 받아 승 무 카운트
    public static void gameCount(Result result) throws GameCountException {

        switch (result) {
            case WIN:
                WinDrawCount.plusWinCount();
                break;
            case DRAW:
                WinDrawCount.plusDrawCount();
                break;
            default:
                throw new GameCountException(RESULT_EXCEPTION);
        }

    }

}
