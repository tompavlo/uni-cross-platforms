package com.tomashesvkyi.scbam.jsonmapper;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tomashesvkyi.scbam.Client.Client;
import com.tomashesvkyi.scbam.Client.ClientRepository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class JsonMapper {
   private final ObjectMapper objectMapper;
   private final File file ;


    public JsonMapper(String path, ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
        this.file = new File(path);
    }

    public void save(ClientRepository clientRepository) throws IOException {
        objectMapper.writeValue(file, clientRepository.getClientList());
    }

    public void load(ClientRepository clientRepository) throws IOException{
        ArrayList<Client> loadedClients;
        if(!file.exists()){
            objectMapper.writeValue(file, Collections.emptyList());
        }
        loadedClients = objectMapper.readValue(file, new TypeReference<>() {});
        clientRepository.setClientList(loadedClients);
    }
}
