package lotto.controller;

import static lotto.exception.LottoException.validateBonusAll;
import static lotto.utility.Constants.ERROR_MESSAGE_3;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import camp.nextstep.edu.missionutils.test.NsTest;
import java.util.Arrays;
import java.util.List;
import lotto.Application;
import lotto.model.Lotto;
import lotto.model.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LottoManagerTest extends NsTest {
    @DisplayName("로또 번호의 개수가 6개가 넘어가면 예외가 발생한다.")
    @Test
    void createLottoByOverSize() {
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 6, 7)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 번호의 개수가 6개보다 적으면 예외가 발생한다.")
    @Test
    void createLottoByUnderSize() {
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 번호에 중복된 숫자가 있으면 예외가 발생한다.")
    @Test
    void createLottoByDuplicatedNumber() {
        // TODO: 이 테스트가 통과할 수 있게 구현 코드 작성
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 5)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    // 아래에 추가 테스트 작성 가능
    @DisplayName("보너스 번호가 당첨 번호와 중복되는 경우 예외가 발생한다.")
    @Test
    void createBonusLottoByDuplicatedNumber() {
        User.setWinningNumbers(Arrays.asList(1, 2, 3, 4, 5, 6)); // 예를 들어, 여기에 중복된 번호 설정

        assertThatThrownBy(() -> validateBonusAll("1")) // 중복된 번호를 사용해서 테스트
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ERROR_MESSAGE_3);
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }

}