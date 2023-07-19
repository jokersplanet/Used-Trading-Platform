package com.example.utp.Config;

public enum PermissionLevel {

    SUPER_ADMIN(0),

    ADMIN(1),

    USER(2);



    private final Integer level;

    PermissionLevel(Integer level) {
        this.level = level;
    }


    public Integer getLevel() {
        return level;
    }

}
