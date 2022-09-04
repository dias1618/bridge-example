package com.dias1618.padroes.bridge.registroauto;

import com.dias1618.padroes.bridge.servicosdetran.IServicosDetran;

public class RegistroAutoSimples extends RegistroAuto{

    public RegistroAutoSimples(IServicosDetran servicosDetran){
        super(servicosDetran);
    }

    @Override
    public void registrar(String dados) {
        servicosDetran.registrarAuto(dados);
    }
    
}
