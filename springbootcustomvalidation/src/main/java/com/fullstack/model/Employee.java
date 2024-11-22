package com.fullstack.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Employee {

    @JsonFormat
    private Date empDOB;
}
