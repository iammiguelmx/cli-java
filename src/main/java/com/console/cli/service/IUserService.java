package com.console.cli.service;

import com.console.cli.entity.UserDTO;

import java.util.Date;
import java.util.List;

public interface IUserService {

    List<UserDTO> getReportUsers(Date date);

}
