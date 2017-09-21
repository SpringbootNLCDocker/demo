package com.dockerspringbootwatson.controller;

import com.dockerspringbootwatson.service.WatsonNLCService;
import com.ibm.watson.developer_cloud.natural_language_classifier.v1.model.Classification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZhiDongWang on 9/18/2017.
 */
@RestController
public class DemoController {

    @Autowired
    private WatsonNLCService watsonService;

    @GetMapping("nlc/{inputText}")
    public Classification getClassification(@PathVariable String inputText){
        return watsonService.getClassification(inputText);
    }
}
