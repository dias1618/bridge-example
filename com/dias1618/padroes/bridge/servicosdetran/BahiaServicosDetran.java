package com.dias1618.padroes.bridge.servicosdetran;

public class BahiaServicosDetran implements IServicosDetran{

    @Override
    public void registrarAuto(String dados) {
        System.out.println("Registrar auto na Bahia");
    }
    
}
