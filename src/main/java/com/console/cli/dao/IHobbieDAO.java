package com.console.cli.dao;

import com.console.cli.entity.HobbieDTO;

import java.util.List;


public interface IHobbieDAO {

    int register(List<HobbieDTO> hobbieDTO);

}
