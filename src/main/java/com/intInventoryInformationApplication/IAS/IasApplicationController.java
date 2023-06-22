package com.intInventoryInformationApplication.IAS;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

@RestController
public class IasApplicationController {
    @GetMapping("/")
    public String greeting() {
        return "HELLO";
    }

    @PostMapping("/addProduct")
    public String addProduct(@RequestBody String reqBody) throws IOException {
        String productId = reqBody.substring(reqBody.indexOf("productId:") + 10, reqBody.indexOf(","));
        String fileContent = "\n" + reqBody + "\n";
        System.out.println(reqBody);
//        Files.write(Paths.get("src/main/resources/inventoryInformation.txt"), fileContent.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        return reqBody;
    }
}
