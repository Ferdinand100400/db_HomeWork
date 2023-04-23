package ru.mpei.clickHouse;

import static java.lang.String.format;

import com.clickhouse.jdbc.ClickHouseDataSource;
import java.sql.SQLException;
import javax.sql.DataSource;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Data
@Slf4j
@Component
@ConfigurationProperties("clickhouse")
public class ClickHouseProperties {

    private String host;
    private String port;
    private String database;
    private String user;
    private String password;

    @Bean
    NamedParameterJdbcTemplate namedParameterJdbcTemplate(DataSource dataSource) {
        return new NamedParameterJdbcTemplate(dataSource);
    }

    @Bean
    public DataSource dataSource() throws SQLException {
        return new ClickHouseDataSource(format("jdbc:ch:http://%s:%s", host, port));
    }
}