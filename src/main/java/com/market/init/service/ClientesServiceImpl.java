package com.market.init.service;

import com.market.init.model.Cliente;
import com.market.init.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesServiceImpl  implements ClientesService{

    @Autowired
    ClientesRepository clientesRepository;

    @Override
    public Cliente autenticar(String usuario, String password) {
        return clientesRepository.findByUsuarioAndPassword(usuario, password);
    }

    @Override
    public boolean registrar(Cliente cliente) {
        return false;
    }
}
