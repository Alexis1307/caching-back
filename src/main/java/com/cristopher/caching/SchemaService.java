package com.cristopher.caching;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class SchemaService {
    @Autowired
    private SchemaRepository schemaRepository;

    private JsonSchema fetchSchemaFromDatabase(String keyJson) {
        System.out.print("Traer información de la base de datos");
        return schemaRepository.findById(keyJson).orElseThrow(() -> new RuntimeException("Schema no encontrado"));
    }

    @Cacheable(value = "schemas", key = "#keyJson")
    public JsonSchema getSchema(String keyJson) {
        return fetchSchemaFromDatabase(keyJson);
    }
}
