package com.cristopher.caching;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SchemaRepository extends JpaRepository<JsonSchema, String> {
}
