package io.educative.mediaapp.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseStatusError {
    @JsonProperty("status_code")
    private int status;

    @JsonProperty("status_message")
    private String message;
}
