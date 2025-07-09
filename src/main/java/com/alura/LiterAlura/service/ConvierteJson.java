package com.alura.LiterAlura.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvierteJson {
    private final ObjectMapper objectMapper = new ObjectMapper();

    public String getPrimerLibro(String jsonResponse) {
        try {
            JsonNode rootNode = objectMapper.readTree(jsonResponse);
            JsonNode resultsNode = rootNode.get("results");

            if (resultsNode != null && resultsNode.isArray() && resultsNode.size() > 0) {
                JsonNode primerLibro = resultsNode.get(0);
                return objectMapper.writeValueAsString(primerLibro);
            }

            return null;
        } catch (Exception e) {
            throw new RuntimeException("Error al procesar JSON", e);
        }
    }

}
