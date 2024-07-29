package com.ki.level2.p12909;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.level2.p12909.Solution;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("()() => true")
    void t1(){assertThat(new Solution().solution("()()")).isEqualTo(true);}

    @Test
    @DisplayName("(())() => true")
    void t2(){assertThat(new Solution().solution("(())()")).isEqualTo(true);}

    @Test
    @DisplayName(")()( => false")
    void t3(){assertThat(new Solution().solution(")()(")).isEqualTo(false
    );}

    @Test
    @DisplayName("(()( => false")
    void t4(){assertThat(new Solution().solution("(()(")).isEqualTo(false);}



}
