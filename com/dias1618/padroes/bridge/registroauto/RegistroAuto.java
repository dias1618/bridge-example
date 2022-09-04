package com.dias1618.padroes.bridge.registroauto;

import com.dias1618.padroes.bridge.servicosdetran.IServicosDetran;

public abstract class RegistroAuto {

    protected IServicosDetran servicosDetran;

    public RegistroAuto(IServicosDetran servicosDetran){
        this.servicosDetran = servicosDetran;
    }

    public abstract void registrar(String dados);
}
