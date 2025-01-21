package com.example.demo.entities;

public enum TipoConta
{
    INVESTIMENTOS("Investimentos"),
    CORRENTE("Corrente");

    private final String ds_descricao;

    TipoConta(String ds_descricao)
    {
        this.ds_descricao = ds_descricao;
    }

    public String getDs_descricao()
    {
        return ds_descricao;
    }

}
