package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name = "Movimentacao")
public class Movimentacao
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_movimentacao;
    private TipoMovimentacao tp_movimentacao;
    private BigDecimal vl_valor;
    private String ds_descricao;
    private LocalDateTime dt_dataMovimentacao;
    private ContaBancaria id_contaBancaria;
    private Categoria id_categoria;

}
