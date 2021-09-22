package com.console.cli.service;

import com.console.cli.entity.HobbieDTO;

import java.util.List;

public interface IHobbieService {

    int register(List<HobbieDTO> hobbieDTO);

}
