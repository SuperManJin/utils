package com.jwm.utils;

/**
 * @author jin.weimin@lifecycle.cn
 * Created by 2019-02-18 17:07
 * 2元素的元组
 **/
public class Tuple2<T, R> {

    private T first;
    private R second;

    public Tuple2(T first, R second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public R getSecond() {
        return second;
    }

    public void setSecond(R second) {
        this.second = second;
    }
}
