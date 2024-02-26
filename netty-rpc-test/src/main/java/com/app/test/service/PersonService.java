package com.app.test.service;

import java.util.List;

/**
 * Created by zhangxiuqi on 2023-07.
 */
public interface PersonService {
    List<Person> callPerson(String name, Integer num);
}
