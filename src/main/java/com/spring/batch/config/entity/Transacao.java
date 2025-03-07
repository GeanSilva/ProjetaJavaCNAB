package com.spring.batch.config.entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public record Transacao(
        Long id,
        Integer tipo,
        Date data,
        BigDecimal valor,
        Long cpf,
        String cartao,
        String hora,
        String donoDaLoja,
        String nomeDaLoja) {

    public Transacao withValor(BigDecimal valor){
        return new Transacao(
                this.id(),this.tipo(),this.data(),
                valor,
                this.cpf(),this.cartao(),this.hora(),
                this.donoDaLoja(),this.nomeDaLoja()
        );
    }

    public Transacao withData(String data) throws ParseException{
        var dateFormat = new SimpleDateFormat("yyyMMMddd");
        var date = dateFormat.parse(data);

        return  new Transacao(
                this.id(), this.tipo(), new Date(date.getTime()),
                valor,this.cpf(),this.cartao(),this.hora(),
                this.donoDaLoja(),this.nomeDaLoja());

    }
    public Transacao withHora(String hora) throws ParseException{
        var dateFormat = new SimpleDateFormat("yyyMMMddd");
        var date = dateFormat.parse(hora);

        return  new Transacao(
                this.id(), this.tipo(), new Date(date.getTime()),
                valor,this.cpf(),this.cartao(),this.hora(),
                this.donoDaLoja(),this.nomeDaLoja());

    }


}
