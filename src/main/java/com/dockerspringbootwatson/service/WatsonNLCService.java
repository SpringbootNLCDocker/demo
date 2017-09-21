package com.dockerspringbootwatson.service;

import com.ibm.watson.developer_cloud.natural_language_classifier.v1.NaturalLanguageClassifier;
import com.ibm.watson.developer_cloud.natural_language_classifier.v1.model.Classification;
import org.springframework.stereotype.Component;

/**
 * Created by ZhiDongWang on 9/18/2017.
 */
@Component
public class WatsonNLCService {

    private static NaturalLanguageClassifier service = null;

    static {
        service = new NaturalLanguageClassifier();
        service.setUsernameAndPassword("yourUsername", "yourPassword");
    }

    public Classification getClassification(String text){
        Classification classification = null;
        String classifierId = this.getClassifierId();
        classification = service.classify(classifierId,  text).execute();
        return classification;
    }

    //read value from property file
    private String getClassifierId() {
        return "yourClassifierId";
    }
}
