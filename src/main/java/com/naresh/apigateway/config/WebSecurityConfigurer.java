package com.naresh.apigateway.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestOperations;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;

/**
 * The Web Security configuration for My Website.
 */
// EnableOauth2Sso ==> Browse to protected resource and get redirected to authorization-server. After login the resource should be available.
//@Configuration
//@EnableOAuth2Sso 
//@EnableAutoConfiguration
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {

   
   
}