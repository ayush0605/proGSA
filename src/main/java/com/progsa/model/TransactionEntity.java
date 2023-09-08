package com.progsa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="transaction")
@Getter
@Setter
public class TransactionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_key", nullable = false)
    private Long transactionKey;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "stock_name", nullable = false)
    private String stockName;

    @Column(name = "symbol", nullable = false)
    private String symbol;

    @Column(name = "transaction_time", nullable = false)
    private Date time;

    @Column(name = "transaction_date", nullable = false)
    private Date date;

    @Column(name = "volume", nullable = false)
    private int volume;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "cost", nullable = false)
    private double cost;

    @Column(name = "transaction_type", nullable = false)
    private String transactionType;

    public TransactionEntity(String email, String stockName, String symbol, Date time, Date date, int volume, double price, double cost, String transactionType) {
        this.email = email;
        this.stockName = stockName;
        this.symbol = symbol;
        this.time = time;
        this.date = date;
        this.volume = volume;
        this.price = price;
        this.cost = cost;
        this.transactionType = transactionType;
    }
}