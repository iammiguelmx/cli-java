package com.console.cli.dao;

import com.console.cli.entity.UserDTO;

import java.util.Date;
import java.util.List;

public interface IUserDAO {

    List<UserDTO> getReportUsers(Date date);

}
