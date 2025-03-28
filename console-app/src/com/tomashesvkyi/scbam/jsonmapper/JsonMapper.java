package com.tomashesvkyi.scbam.jsonmapper;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.tomashesvkyi.scbam.Client.Client;
import com.tomashesvkyi.scbam.Client.ClientRepository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class JsonMapper {
   private final ClientRepository clientRepository;
   private final ObjectMapper objectMapper;
   private final File file = new File(FILE_LOCATION);

    public static final String FILE_LOCATION = "src/resources/clients.json";

    public JsonMapper(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
        this.objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());
    }

    public void save() throws IOException {
        objectMapper.writeValue(file, clientRepository.getClientList());
    }

    public void load() throws IOException{
        ArrayList<Client> loadedClients;
        if(!file.exists()){
            objectMapper.writeValue(file, Collections.emptyList());
        }
        loadedClients = objectMapper.readValue(file, new TypeReference<>() {});
        clientRepository.setClientList(loadedClients);
    }
}
