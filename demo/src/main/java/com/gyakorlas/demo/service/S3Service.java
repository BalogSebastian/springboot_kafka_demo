package com.gyakorlas.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class S3Service {

    public void upload(String filename, byte[] content) {

    }

}
