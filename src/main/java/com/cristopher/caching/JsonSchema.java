package com.cristopher.caching;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity(name = "schemas_json")
public class JsonSchema {
    @Id
    @Column(name = "key_json")
    private String keyJson;

    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String jsonSchema;

    public JsonSchema(){}

    public JsonSchema(String keyJson, String jsonSchema) {
        this.keyJson = keyJson;
        this.jsonSchema = jsonSchema;
    }

    public String getKey() {
        return keyJson;
    }

    public void setKey(String key) {
        this.keyJson = key;
    }

    public String getSchemaJson() {
        return jsonSchema;
    }

    public void setSchemaJson(String jsonSchema) {
        this.jsonSchema = jsonSchema;
    }
}
