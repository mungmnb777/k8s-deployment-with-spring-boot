package com.example.k8s;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class JsonController {
    

    @Value("${random-data}")
    String randomData;

    @GetMapping("/data")
    public String data() throws JsonProcessingException {
        ObjectMapper om = new ObjectMapper();

        Product[] datas = om.readValue(randomData, Product[].class);

        int random = (int) (Math.random() * datas.length);

        return om.writeValueAsString(datas[random]);
    }
}
