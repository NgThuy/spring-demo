package com.higgsup.intern.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class Account {
    private String bank ;

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return bank;
    }
}
