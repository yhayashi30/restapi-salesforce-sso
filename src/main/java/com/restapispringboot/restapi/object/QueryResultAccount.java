package com.restapispringboot.restapi.object;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QueryResultAccount {

    public List<Account> records;
}