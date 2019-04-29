package com.restapispringboot.restapi;

import java.util.List;

import com.restapispringboot.restapi.util.OAuth2Salesforce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class RestapiController{

    @Autowired
    private OAuth2Salesforce force;

    @RequestMapping("/accounts")
    public List<OAuth2Salesforce.Account> accounts(OAuth2Authentication principal) {
        return force.accounts(principal);
    }
}