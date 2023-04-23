package ru.mpei.util;

import java.time.Instant;

public record Measurement(Instant timestamp, String source, Double value) {
}
