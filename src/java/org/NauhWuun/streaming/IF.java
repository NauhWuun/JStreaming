package org.NauhWuun.streaming;

public interface IF<T>
{
    Streams<T> If(Functions<T> func);
}
