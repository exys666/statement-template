package com.exys666.stmtpl;

import com.exys666.stmtpl.Statement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

public class StatementTests {

    private Connection connection = mock(Connection.class);
    private PreparedStatement statement = mock(PreparedStatement.class);

    @BeforeEach
    void init() throws SQLException {
        given(connection.prepareStatement(any())).willReturn(statement);
    }

    @Test
    void shouldHandleBoolean() throws SQLException {
        // given
        Boolean x = true;

        // when
        var result = com.exys666.stmtpl.Statement.prepare(connection). "SELECT \{ x }" ;

        // then
        assertSame(statement, result);

        verify(statement).setBoolean(1, x);
        verify(connection).prepareStatement("SELECT ?");
        verifyNoMoreInteractions(statement, connection);
    }

    @Test
    void shouldHandleBooleanPrimitive() throws SQLException {
        // given
        boolean x = true;

        // when
        var result = com.exys666.stmtpl.Statement.prepare(connection). "SELECT \{ x }" ;

        // then
        assertSame(statement, result);

        verify(statement).setBoolean(1, x);
        verify(connection).prepareStatement("SELECT ?");
        verifyNoMoreInteractions(statement, connection);
    }

    @Test
    void shouldHandleByte() throws SQLException {
        // given
        Byte x = 66;

        // when
        var result = com.exys666.stmtpl.Statement.prepare(connection). "SELECT \{ x }" ;

        // then
        assertSame(statement, result);

        verify(statement).setByte(1, x);
        verify(connection).prepareStatement("SELECT ?");
        verifyNoMoreInteractions(statement, connection);
    }

    @Test
    void shouldHandleBytePrimitive() throws SQLException {
        // given
        byte x = 66;

        // when
        var result = com.exys666.stmtpl.Statement.prepare(connection). "SELECT \{ x }" ;

        // then
        assertSame(statement, result);

        verify(statement).setByte(1, x);
        verify(connection).prepareStatement("SELECT ?");
        verifyNoMoreInteractions(statement, connection);
    }

    @Test
    void shouldHandleShort() throws SQLException {
        // given
        Short x = 66;

        // when
        var result = com.exys666.stmtpl.Statement.prepare(connection). "SELECT \{ x }" ;

        // then
        assertSame(statement, result);

        verify(statement).setShort(1, x);
        verify(connection).prepareStatement("SELECT ?");
        verifyNoMoreInteractions(statement, connection);
    }

    @Test
    void shouldHandleShortPrimitive() throws SQLException {
        // given
        short x = 66;

        // when
        var result = com.exys666.stmtpl.Statement.prepare(connection). "SELECT \{ x }" ;

        // then
        assertSame(statement, result);

        verify(statement).setShort(1, x);
        verify(connection).prepareStatement("SELECT ?");
        verifyNoMoreInteractions(statement, connection);
    }

    @Test
    void shouldHandleInteger() throws SQLException {
        // given
        Integer x = 666;

        // when
        var result = com.exys666.stmtpl.Statement.prepare(connection). "SELECT \{ x }" ;

        // then
        assertSame(statement, result);

        verify(statement).setInt(1, x);
        verify(connection).prepareStatement("SELECT ?");
        verifyNoMoreInteractions(statement, connection);
    }

    @Test
    void shouldHandleInt() throws SQLException {
        // given
        int x = 666;

        // when
        var result = com.exys666.stmtpl.Statement.prepare(connection). "SELECT \{ x }" ;

        // then
        assertSame(statement, result);

        verify(statement).setInt(1, x);
        verify(connection).prepareStatement("SELECT ?");
        verifyNoMoreInteractions(statement, connection);
    }

    @Test
    void shouldHandleLong() throws SQLException {
        // given
        Long x = 666666666666L;

        // when
        var result = com.exys666.stmtpl.Statement.prepare(connection). "SELECT \{ x }" ;

        // then
        assertSame(statement, result);

        verify(statement).setLong(1, x);
        verify(connection).prepareStatement("SELECT ?");
        verifyNoMoreInteractions(statement, connection);
    }

    @Test
    void shouldHandleLongPrimitive() throws SQLException {
        // given
        long x = 666666666666L;

        // when
        var result = com.exys666.stmtpl.Statement.prepare(connection). "SELECT \{ x }" ;

        // then
        assertSame(statement, result);

        verify(statement).setLong(1, x);
        verify(connection).prepareStatement("SELECT ?");
        verifyNoMoreInteractions(statement, connection);
    }

    @Test
    void shouldHandleFloat() throws SQLException {
        // given
        Float x = 6.66f;

        // when
        var result = com.exys666.stmtpl.Statement.prepare(connection). "SELECT \{ x }" ;

        // then
        assertSame(statement, result);

        verify(statement).setFloat(1, x);
        verify(connection).prepareStatement("SELECT ?");
        verifyNoMoreInteractions(statement, connection);
    }

    @Test
    void shouldHandleFloatPrimitive() throws SQLException {
        // given
        float x = 6.66f;

        // when
        var result = com.exys666.stmtpl.Statement.prepare(connection). "SELECT \{ x }" ;

        // then
        assertSame(statement, result);

        verify(statement).setFloat(1, x);
        verify(connection).prepareStatement("SELECT ?");
        verifyNoMoreInteractions(statement, connection);
    }

    @Test
    void shouldHandleDouble() throws SQLException {
        // given
        Double x = 6.66d;

        // when
        var result = com.exys666.stmtpl.Statement.prepare(connection). "SELECT \{ x }" ;

        // then
        assertSame(statement, result);

        verify(statement).setDouble(1, x);
        verify(connection).prepareStatement("SELECT ?");
        verifyNoMoreInteractions(statement, connection);
    }

    @Test
    void shouldHandleDoublePrimitive() throws SQLException {
        // given
        double x = 6.66d;

        // when
        var result = com.exys666.stmtpl.Statement.prepare(connection). "SELECT \{ x }" ;

        // then
        assertSame(statement, result);

        verify(statement).setDouble(1, x);
        verify(connection).prepareStatement("SELECT ?");
        verifyNoMoreInteractions(statement, connection);
    }

    @Test
    void shouldHandleBigDecimal() throws SQLException {
        // given
        BigDecimal x = new BigDecimal("66666666.66666666");

        // when
        var result = com.exys666.stmtpl.Statement.prepare(connection). "SELECT \{ x }" ;

        // then
        assertSame(statement, result);

        verify(statement).setBigDecimal(1, x);
        verify(connection).prepareStatement("SELECT ?");
        verifyNoMoreInteractions(statement, connection);
    }

    @Test
    void shouldHandleString() throws SQLException {
        // given
        String x = "exys666";

        // when
        var result = com.exys666.stmtpl.Statement.prepare(connection). "SELECT \{ x }" ;

        // then
        assertSame(statement, result);

        verify(statement).setString(1, x);
        verify(connection).prepareStatement("SELECT ?");
        verifyNoMoreInteractions(statement, connection);
    }

    @Test
    void shouldHandleByteArray() throws SQLException {
        // given
        byte[] x = new byte[]{6, 6, 6};

        // when
        var result = com.exys666.stmtpl.Statement.prepare(connection). "SELECT \{ x }" ;

        // then
        assertSame(statement, result);

        verify(statement).setBytes(1, x);
        verify(connection).prepareStatement("SELECT ?");
        verifyNoMoreInteractions(statement, connection);
    }

    @Test
    void shouldHandleDate() throws SQLException {
        // given
       Date x =  Date.valueOf(LocalDate.now());

        // when
        var result = com.exys666.stmtpl.Statement.prepare(connection). "SELECT \{ x }" ;

        // then
        assertSame(statement, result);

        verify(statement).setDate(1, x);
        verify(connection).prepareStatement("SELECT ?");
        verifyNoMoreInteractions(statement, connection);
    }

    @Test
    void shouldHandleTime() throws SQLException {
        // given
        Time x =  Time.valueOf(LocalTime.now());

        // when
        var result = com.exys666.stmtpl.Statement.prepare(connection). "SELECT \{ x }" ;

        // then
        assertSame(statement, result);

        verify(statement).setTime(1, x);
        verify(connection).prepareStatement("SELECT ?");
        verifyNoMoreInteractions(statement, connection);
    }

    @Test
    void shouldHandleTimestamp() throws SQLException {
        // given
        Timestamp x =  Timestamp.valueOf(LocalDateTime.now());

        // when
        var result = com.exys666.stmtpl.Statement.prepare(connection). "SELECT \{ x }" ;

        // then
        assertSame(statement, result);

        verify(statement).setTimestamp(1, x);
        verify(connection).prepareStatement("SELECT ?");
        verifyNoMoreInteractions(statement, connection);
    }

    @Test
    void shouldHandleUrl() throws SQLException, MalformedURLException {
        // given
        URL x = URI.create("https://exys666.com").toURL();

        // when
        var result = com.exys666.stmtpl.Statement.prepare(connection). "SELECT \{ x }" ;

        // then
        assertSame(statement, result);

        verify(statement).setURL(1, x);
        verify(connection).prepareStatement("SELECT ?");
        verifyNoMoreInteractions(statement, connection);
    }

    @Test
    void shouldHandleMultipleParams() throws SQLException {
        // given
        short a = 6;
        int b = 66;
        long c = 666;

        // when
        var result = Statement.prepare(connection). "SELECT \{ a }, \{ b }, \{ c }" ;

        // then
        assertSame(statement, result);

        verify(statement).setShort(1, a);
        verify(statement).setInt(2, b);
        verify(statement).setLong(3, c);
        verify(connection).prepareStatement("SELECT ?, ?, ?");
        verifyNoMoreInteractions(statement, connection);
    }
}
