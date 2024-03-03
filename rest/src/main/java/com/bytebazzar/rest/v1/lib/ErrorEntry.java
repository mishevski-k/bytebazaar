package com.bytebazzar.rest.v1.lib;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorEntry {
    private int errorCode;
    private String errorMessage;
}
