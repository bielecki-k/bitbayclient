package com.bielecki.bitbayclient.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class PersistenceConfig {

    @Autowired
    private Environment env;

    public PersistenceConfig() {
        super();
    }

}
