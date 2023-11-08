package lotto.utility;

public class Constants {
    public static final Integer LOTTO_LENGTH = 6;
    public static final Integer CHECK_BONUS_CONDITION = 5;
    public static final Integer MIN_LOTTO_NUMBER = 1;
    public static final Integer MAX_LOTTO_NUMBER = 45;
    public static final Integer LOTTO_PRICE = 1000;
    public static final String COMMA = ",";
    public static final String LINE = "-";
    public static final String COUNT_WORD = "개";
    public static final String BUY_MESSAGE_BEFORE = "구입금액을 입력해 주세요.";
    public static final String BUY_MESSAGE_AFTER = "개를 구매했습니다.";
    public static final String INPUT_WINNING_NUMBERS_MESSAGE = "당첨 번호를 입력해 주세요.";
    public static final String INPUT_BONUS_NUMBER_MESSAGE = "보너스 번호를 입력해 주세요.";
    public static final String WINNING_STATISTIC = "당첨 통계";
    public static final String EARNING_RATE_MESSAGE_1 = "총 수익률은 ";
    public static final String EARNING_RATE_MESSAGE_2 = "%입니다.";
    public static final String ERROR_MESSAGE_1 = "[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.";
    public static final String ERROR_MESSAGE_2 = "[ERROR] 구입 가격은 양의 정수로만 이루어져야 합니다.";
    public static final String ERROR_MESSAGE_3 = "[ERROR] 당첨 번호의 개수는 6개여야 합니다.";
    public static final String ERROR_MESSAGE_4 = "[ERROR] 로또 번호는 중복되지 않아야 합니다.";

    // 정규식
    public static final String ONLYINT = "\\d+";
    private Constants() {}
}
