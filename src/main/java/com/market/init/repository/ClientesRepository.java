package com.market.init.repository;

import com.market.init.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<Cliente,String> {

    Cliente findByUsuarioAndPassword(String usuario, String password);
}
