package com.contalitro.backend;

import com.contalitro.backend.domain.Veiculo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @GetMapping("/teste")
    public String teste() {
        return "Tudo ok";
    }

    @GetMapping("/veiculo")
    public Veiculo buscarVeiculo() {
        Veiculo veiculo = new Veiculo();
        veiculo.setId(1L);
        veiculo.setPlaca("xxx-xxx");
        veiculo.setModelo("BYD");
        return veiculo;
    }
}
