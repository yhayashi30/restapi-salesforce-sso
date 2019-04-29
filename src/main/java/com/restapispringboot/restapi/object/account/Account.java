package com.restapispringboot.restapi.object.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {
    public String Id;
    public String Name;
    public String Industry;
    public String Rating;
}