package cl.curso.ms.calculadora.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @GetMapping("/sumar")
    public int sumar(@RequestParam(value = "param1", required = true) int a,
                     @RequestParam(value = "param2", required = true) int b){
        int suma = a + b;
        return suma ;
    }

    @GetMapping("/restar/{param1}/{param2}")
    public int restar(@PathVariable(value = "param1", required = true) int a,
                      @PathVariable(value = "param2", required = true) int b){
        int suma = a - b;
        return suma ;
    }
}