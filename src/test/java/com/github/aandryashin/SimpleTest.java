package com.github.aandryashin;

import org.junit.Test;
import ru.yandex.qatools.allure.annotations.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static ru.yandex.qatools.allure.model.SeverityLevel.*;

@Title("Simple tests")
@Description("Simple tests with predictable result")
@Features("Running simple tests")
@Stories("User runs simple tests")
public class SimpleTest {

    @Test
    @Severity(BLOCKER)
    public void passingTest() throws Exception {
        assertThat(true, is(true));
    }

    @Test
    @Severity(CRITICAL)
    public void failingTest() throws Exception {
        assertThat(true, is(false));
    }

    @Test
    @Severity(MINOR)
    public void brokenTest() throws Exception {
        throw new RuntimeException("I am broken");
    }
}
