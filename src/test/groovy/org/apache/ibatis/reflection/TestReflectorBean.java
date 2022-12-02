package org.apache.ibatis.reflection;

public class TestReflectorBean {
    private String name;
    private String id;

    private boolean present;

    public TestReflectorBean() {
    }

    public TestReflectorBean(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }
}
