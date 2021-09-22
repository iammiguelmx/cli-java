package com.console.cli.service;

import com.console.cli.dao.IHobbieDAO;
import com.console.cli.entity.HobbieDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HobbieServiceImpl implements IHobbieService {

    @Autowired
    private IHobbieDAO iHobbieDAO;

    @Override
    public int register(List<HobbieDTO> hobbieDTO) {
        return iHobbieDAO.register(hobbieDTO);
    }
}
