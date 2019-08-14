package com.example.voizfonica.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document

public class DonglePurchase {
    @Id
    private String Id;
    private final String amount;
    private final String dongleName;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getAmount() {
        return amount;
    }

    public String getDongleName() {
        return dongleName;
    }

    public DonglePurchase(String amount, String dongleName) {

        this.amount = amount;
        this.dongleName = dongleName;
    }
}
