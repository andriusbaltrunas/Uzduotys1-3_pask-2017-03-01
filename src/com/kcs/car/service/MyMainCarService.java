package com.kcs.car.service;

import com.kcs.car.service.service.ReadDataService;
import com.kcs.car.service.service.impl.ReadDataServiceImpl;
import com.kcs.car.service.vo.Client;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by andriusbaltrunas on 3/2/2017.
 */
public class MyMainCarService {

    private static final String FILE_NAME = "client.txt";

    public static void main(String[] args) {
        ReadDataService readDataService = new ReadDataServiceImpl();

        Set<Client> clients = new HashSet<>();
        clients.add(new Client("Andrius", "Baltrunas"));
        clients.add(new Client("Andrius1", "Baltrunas1"));
        clients.add(new Client("Andrius2", "Baltrunas3"));

        readDataService.writeClientInfo(FILE_NAME, clients);
    }
}
