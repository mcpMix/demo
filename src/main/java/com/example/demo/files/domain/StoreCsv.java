package com.example.demo.files.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.math.BigDecimal;

public class StoreCsv {

    public StoreCsv() {
    }

    public StoreCsv(String store_uuid, BigDecimal valor, String status) {
        this.store_uuid = store_uuid;
        this.valor = valor;
        this.status = status;
    }

    private String store_uuid;

    private BigDecimal valor;

    private String status;

    public String getStore_uuid() {
        return store_uuid;
    }

    public void setStore_uuid(String store_uuid) {
        this.store_uuid = store_uuid;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        StoreCsv storeCsv = (StoreCsv) o;

        return new EqualsBuilder().append( store_uuid, storeCsv.store_uuid ).append( valor, storeCsv.valor ).append( status, storeCsv.status ).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder( 17, 37 ).append( store_uuid ).append( valor ).append( status ).toHashCode();
    }

    @Override
    public String toString() {
        return "StoreCsv{" +
                "store_uuid='" + store_uuid + '\'' +
                ", valor=" + valor +
                ", status='" + status + '\'' +
                '}';
    }
}
