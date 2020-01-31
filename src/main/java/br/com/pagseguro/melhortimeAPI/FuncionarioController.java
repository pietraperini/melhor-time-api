package br.com.pagseguro.melhortimeAPI;

import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping(value = "Funcionario")
public class FuncionarioController {

    @GetMapping
    public Funcionario get() {
        Funcionario func = new Funcionario();
        func.setId(1L);
        func.setNome("Pietra");
        func.setCargo("DEV");
        func.setSalario(new BigDecimal(10000));

        return func;
    }

    @PostMapping
    public Funcionario post(@RequestBody Funcionario funcionario){
        funcionario.setId(1L);
        return funcionario;
    }

}
