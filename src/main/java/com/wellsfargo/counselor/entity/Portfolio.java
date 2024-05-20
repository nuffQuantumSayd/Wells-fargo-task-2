package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "security_id", referencedColumnName = "securityId")
    private List<Security> securities;

    @Column(nullable = false)
    private long clientId;

    @Column(nullable = false)
    private LocalDateTime creationDate;

    protected Portfolio() {

    }

    public Portfolio(long clientId, LocalDateTime creationDate) {;
        this.clientId = clientId;
        this.creationDate = creationDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime cd) {
        this.creationDate = cd;
    }
}
