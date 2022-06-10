package com.example.Spring.Boot.entities;

import com.example.Spring.Boot.entities.enums.AccountType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.PositiveOrZero;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "conta")
@Data

public class Conta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "conta_id", nullable = false)
    private Long id;

    @Column(name = "nome_conta")
    private int accountType;

    @Column(name = "saldo_conta")
    private BigDecimal saldo;


    @ManyToOne
    @JoinColumn(name = "fk_cliente")
    private Cliente cliente;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Instant dateCreation;


    public Conta() {
    }

    public Conta(AccountType accountType, BigDecimal saldo, Cliente cliente) {
        setAccountType(accountType);
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public AccountType getAccountType() {
        return AccountType.valueOf(accountType);
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType.getAccountType();
    }

    public Instant getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Instant dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void deposita(BigDecimal saldo) {
        this.saldo = this.saldo.add(saldo);
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void saca(BigDecimal saldo){
        this.saldo = this.saldo.subtract(saldo);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
