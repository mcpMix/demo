package com.example.demo.files.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class StoreCsv {

    public StoreCsv(String store_uuid) {
        this.store_uuid = store_uuid;
    }

    private String store_uuid;

    public String getStore_uuid() {
        return store_uuid;
    }

    public void setStore_uuid(String store_uuid) {
        this.store_uuid = store_uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        StoreCsv storeCsv = (StoreCsv) o;

        return new EqualsBuilder().append( store_uuid, storeCsv.store_uuid ).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder( 17, 37 ).append( store_uuid ).toHashCode();
    }

    @Override
    public String toString() {
        return "StoreCsv{" +
                "store_uuid='" + store_uuid + '\'' +
                '}';
    }
}
