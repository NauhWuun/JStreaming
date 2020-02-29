package org.NauhWuun.streaming;

public class Builder<T>
{
    /**
     *
     * @param <T> Genric Type
     * @return return Builder Object
     */
    public static <T> Streams<T> Build() { return new Streams<T>(); }

    /**
     *
     * @param value Class Genric Type
     * @return meta Class Object
     */
    public Builder<T> Bind(Builder<T> value) {
        return value;
    }

    /**
     *
     * @param value data object
     * @return meta data object
     */
    public T Bind2(T value) { return value; }
}