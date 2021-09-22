package com.console.cli.dao;

import com.console.cli.entity.HobbieDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Log4j2
public class UserHobbieImpl implements IHobbieDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Value("${insert.hobbies}")
    private String insert;

    @Override
    public int register(List<HobbieDTO> hobbieDTO) {
        log.info("Register hobbie");
        return jdbcTemplate.update(insert, hobbieDTO.get(0));
    }
}
