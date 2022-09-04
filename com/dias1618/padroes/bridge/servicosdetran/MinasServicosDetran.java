package com.dias1618.padroes.bridge.servicosdetran;

public class MinasServicosDetran implements IServicosDetran{

    @Override
    public void registrarAuto(String dados) {
        System.out.println("Registrar auto em Minas");
    }
    
}
