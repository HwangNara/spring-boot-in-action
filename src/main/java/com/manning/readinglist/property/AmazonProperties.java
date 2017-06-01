package com.manning.readinglist.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by dany on 2017. 6. 1..
 */
@Component
@ConfigurationProperties("amazon")
@Setter
@Getter
public class AmazonProperties {

    private String associateId;
}
