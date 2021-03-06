package com.restapispringboot.restapi;

import java.util.List;

import com.restapispringboot.restapi.object.account.Account;
import com.restapispringboot.restapi.util.OAuth2Salesforce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestapiController{

    @Autowired
    private OAuth2Salesforce force;

    @RequestMapping("/accounts")
    public List<Account> accounts(OAuth2Authentication principal) {
        return force.accounts(principal);
    }
}