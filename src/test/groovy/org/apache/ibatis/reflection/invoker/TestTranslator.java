package org.apache.ibatis.reflection.invoker;

public class TestTranslator {
    private String chinese;

    public TestTranslator(String chinese) {
        this.chinese = chinese;
    }

    public String translate(String prefix) {
        return prefix + chinese;
    }

    public String translate(int prefix) {
        return chinese;
    }

    public long translate() {
        return 1L;
    }
}
