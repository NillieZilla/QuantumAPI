package com.pixelmoncreate.quantumapi.network.message;

import java.util.function.IntSupplier;

import static org.apache.commons.codec.language.bm.Rule.ALL;

@SuppressWarnings(ALL)
public abstract class LoginMessage<T extends Message<T>> extends Message<T> implements IntSupplier {
    private int loginIndex;

    @Override
    public int getAsInt() {
        return this.loginIndex;
    }

    public int getLoginIndex() {
        return this.loginIndex;
    }

    public void setLoginIndex(int loginIndex) {
        this.loginIndex = loginIndex;
    }

}