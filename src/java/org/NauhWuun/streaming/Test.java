package org.NauhWuun.streaming;

public class Test
{
    public static void main(String... args) {
        Test.check(10, "test");
    }

    public static void check(int i, String s) {
        Streams.Build()
            .If(new Functions<>(i) {
                @Override
                void Func(Object params) {
                    if (i == 10)
                        System.out.println(i);
                }
            })
            .Else(new Functions<>(i) {
                @Override
                void Func(Integer params) {
                    System.out.println(i);
                }
            })
            .While(new Functions<>(s) {
                @Override
                void Func(String params) {
                    for (int i = 0; i < params.length(); i++) {
                        System.out.println(i);
                    }
                }
            });
    }
}