package com.exys666.stmtpl;

import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;

public interface Statement {

    static StringTemplate.Processor<PreparedStatement, SQLException> prepare(Connection connection) {
        return (StringTemplate template) -> {
            var statement = connection.prepareStatement(String.join("?", template.fragments()));

            for (int i = 1; i <= template.values().size(); i++) {
                switch (template.values().get(i - 1)) {
                    case Boolean b -> statement.setBoolean(i, b);
                    case Byte b -> statement.setByte(i, b);
                    case Short s -> statement.setShort(i, s);
                    case Integer x -> statement.setInt(i, x);
                    case Long l -> statement.setLong(i, l);
                    case Float f -> statement.setFloat(i, f);
                    case Double d -> statement.setDouble(i, d);
                    case BigDecimal bd -> statement.setBigDecimal(i, bd);
                    case String s -> statement.setString(i, s);
                    case byte[] b -> statement.setBytes(i, b);
                    case Date d -> statement.setDate(i, d);
                    case Time t -> statement.setTime(i, t);
                    case Timestamp ts -> statement.setTimestamp(i, ts);
                    case URL url -> statement.setURL(i, url);
                    default -> throw new UnsupportedOperationException();
                }
            }

            return statement;
        };
    }
}
