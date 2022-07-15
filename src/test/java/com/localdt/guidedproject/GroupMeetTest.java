package com.localdt.guidedproject;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GroupMeetTest {


    private static ZoneId Dublin = ZoneId.of("Europe/Dublin");

    @Test
    public void verifyTimePeriod() throws Exception {
        long now = System.currentTimeMillis();

        Instant instant = Instant.ofEpochMilli(now);
        LocalDateTime res = LocalDateTime.ofInstant(instant, Dublin);
        assertEquals(now, res.atZone(Dublin).toInstant().toEpochMilli());

    }
}