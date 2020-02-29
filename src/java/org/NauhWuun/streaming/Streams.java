package org.NauhWuun.streaming;

import java.util.stream.Stream;

public class Streams<T> extends Builder<T>
        implements
        If<T>,
        Else<T>,
        While<T>
{
    public Streams<T> Bind() {
        return this;
    }

    @Override
    public Streams<T> If(Functions<T> value) { return this; }

    @Override
    public Streams<T> Else(T value) {
        return this;
    }

    @Override
    public Streams<T> While(T value) {
        return this;
    }
}