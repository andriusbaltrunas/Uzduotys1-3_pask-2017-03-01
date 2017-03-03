package com.kcs.car.service.service;

import com.kcs.car.service.vo.Client;

import java.util.Set;

/**
 * Created by andriusbaltrunas on 3/2/2017.
 */
public interface ReadDataService {
    Set<Client> readClientInfo(String fileName);

    void writeClientInfo(String fileName, Set<Client> clients);

}
