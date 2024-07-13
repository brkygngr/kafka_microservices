package com.brkygngr.kafka_core.event;

import java.io.Serializable;

public record MessageEvent(String message) implements Serializable {

}
