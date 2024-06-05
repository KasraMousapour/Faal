//package com.kasra;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Faal {
    @JsonProperty("Poem")
    private String Poem;

    @JsonProperty("Interpretation")
    private String Interpretation;

    Faal(StringBuffer content) throws Exception {
        String json = String.valueOf(content);
        ObjectMapper objectMapper=new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(json);
        this.Poem= jsonNode.get("Poem").asText();
        this.Interpretation = jsonNode.get("Interpretation").asText();

    }

    public String getPoem() {
        return Poem;
    }

    public String getInterpretation() {
        return Interpretation;
    }
}
