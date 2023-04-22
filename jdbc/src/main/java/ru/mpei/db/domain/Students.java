package ru.mpei.db.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class Students {

    private final long id;
    private final String name;
    private final String group;
    private final String course;
    private final int evaluation;
}
