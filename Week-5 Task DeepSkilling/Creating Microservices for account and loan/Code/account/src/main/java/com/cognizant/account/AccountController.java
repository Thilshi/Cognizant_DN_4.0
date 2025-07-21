package com.cognizant.account;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class AccountController {

    @GetMapping("/account")
    public Map<String, Object> getAccount() {
        return Map.of(
            "number", "00987987973432",
            "type", "savings",
            "balance", 234343
        );
    }
}
