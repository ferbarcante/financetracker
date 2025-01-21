package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name="contaBancaria")
@Data
public class ContaBancaria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_contaBancaria;
    private String nm_conta;
    private BigDecimal vl_saldoInicial;

    @Enumerated(EnumType.STRING)
    private TipoConta tp_conta;

    private BigDecimal vl_saldoAtual;
}
