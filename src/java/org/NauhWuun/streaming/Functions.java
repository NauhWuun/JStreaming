package org.NauhWuun.streaming;

public abstract class Functions<T>
{
    public Functions(T params) {
        Func(params);
    }

    abstract void Func(T params);
}