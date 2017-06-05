package com.weibo.motan.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by tend on 2017/6/1.
 */
public interface TestInterfaceAsync<K,V> {
    ArrayList<String> xxx(ConcurrentHashMap<String, Boolean> map);

    List<K> methodRaw();

    Map<K, V> methodRaw(List<String> list);

    List<String> methodType();

    List<?> methodWildcard();

    List<? extends Number> methodBoundedWildcard();

    <T extends List<String>> Map<K, V> methodTypeLiteral();

    <T extends List<T>> void method(String p1, T p2, List<?> p3, List<T> p4);
}
