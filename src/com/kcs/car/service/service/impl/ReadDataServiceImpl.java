package com.kcs.car.service.service.impl;

import com.kcs.car.service.service.ReadDataService;
import com.kcs.car.service.vo.Client;

import java.io.*;
import java.util.Set;

/**
 * Created by andriusbaltrunas on 3/2/2017.
 */
public class ReadDataServiceImpl implements ReadDataService{

    @Override
    public Set<Client> readClientInfo(String fileName) {
        try {
            FileInputStream fInput = new FileInputStream(fileName);
            ObjectInputStream ob = new ObjectInputStream(fInput);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void writeClientInfo(String fileName, Set<Client> clients) {
        try {
            FileOutputStream outputStream = new FileOutputStream(fileName);
            ObjectOutputStream ob = new ObjectOutputStream(outputStream);
            for (Client client : clients) {
                ob.writeObject(client);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
