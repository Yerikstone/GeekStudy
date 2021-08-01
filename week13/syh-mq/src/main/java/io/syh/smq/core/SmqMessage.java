package io.syh.kmq.core;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;

@AllArgsConstructor
@Data
public class SmqMessage<T> {

    private HashMap<String,Object> headers;

    private T body;

}
