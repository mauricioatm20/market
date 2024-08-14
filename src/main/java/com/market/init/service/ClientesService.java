package com.market.init.service;

import com.market.init.model.Cliente;

public interface ClientesService {

    Cliente autenticar(String usuario, String passwpord);
    boolean registrar(Cliente cliente);

}
