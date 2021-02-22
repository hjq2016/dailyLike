package com.austin.daily.hashMap;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description
 * @Author hjq
 * @Date 2021/1/7
 */
@Slf4j
public class ConcurrentHashMapTest {

    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        String t = map.put("2", "3");
        String m = map.putIfAbsent("2", "4");
        log.info(t);
        log.info(m);
        log.info(map.get("2"));
    }
}
