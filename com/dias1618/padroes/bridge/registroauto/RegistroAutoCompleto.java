package com.dias1618.padroes.bridge.registroauto;

import com.dias1618.padroes.bridge.servicosdetran.IServicosDetran;

public class RegistroAutoCompleto extends RegistroAuto{

    public RegistroAutoCompleto(IServicosDetran servicosDetran){
        super(servicosDetran);
    }

    @Override
    public void registrar(String dados) {
        System.out.println("Registrar Log");
        servicosDetran.registrarAuto(dados);
        System.out.println("Enviar para o banco de dados");
    }
    
}
