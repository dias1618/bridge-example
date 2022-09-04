package com.dias1618.padroes.bridge;

import com.dias1618.padroes.bridge.registroauto.RegistroAuto;
import com.dias1618.padroes.bridge.registroauto.RegistroAutoCompleto;
import com.dias1618.padroes.bridge.registroauto.RegistroAutoSimples;
import com.dias1618.padroes.bridge.servicosdetran.BahiaServicosDetran;
import com.dias1618.padroes.bridge.servicosdetran.IServicosDetran;
import com.dias1618.padroes.bridge.servicosdetran.MinasServicosDetran;

public class Principal{

    public static void main(String args[]){
        registrarAuto(new BahiaServicosDetran());
        registrarAutoCompleto(new MinasServicosDetran());
    }

    public static void registrarAuto(IServicosDetran servicosDetran){
        RegistroAuto registroAuto = new RegistroAutoSimples(servicosDetran);
        registroAuto.registrar("Auto de infração");
    }

    public static void registrarAutoCompleto(IServicosDetran servicosDetran){
        RegistroAuto registroAuto = new RegistroAutoCompleto(servicosDetran);
        registroAuto.registrar("Auto de infração");
    }

}