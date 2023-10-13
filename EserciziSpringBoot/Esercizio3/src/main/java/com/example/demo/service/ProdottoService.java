package com.example.demo.service;


import com.example.demo.entity.Prodotto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProdottoService {
    private List<Prodotto> prodotti = new ArrayList<>();

    public Optional<Prodotto> findForId( Long id){
        Optional<Prodotto> opt = Optional.empty();
        for (Prodotto prodotto : prodotti) {
            if(prodotto.getId().equals(id)){
                opt = Optional.of(prodotto);
            }
        }
        return opt;
    }

    public Optional<Prodotto> findForName( String name){
        Optional<Prodotto> opt = Optional.empty();
        for (Prodotto prodotto : prodotti) {
            if(prodotto.getNome().equals(name)){
                opt = Optional.of(prodotto);
            }
        }
        return opt;
    }

    public Optional<Prodotto> findForPrice( Double price){
        Optional<Prodotto> opt = Optional.empty();
        for (Prodotto prodotto : prodotti) {
            if(prodotto.getPrezzo()==price){
                opt = Optional.of(prodotto);
            }
        }
        return opt;
    }

    public boolean addProdotto(Prodotto prodotto){
        return prodotti.add(prodotto);
    }

    public Optional<Prodotto> modifyProdotto(String name,Prodotto updateProdotto){
        Optional<Prodotto> opt = findForName(name);
        if(opt.isPresent()){
            opt.get().setNome(updateProdotto.getNome());
            opt.get().setPrezzo(updateProdotto.getPrezzo());
            return opt;
        }else return Optional.empty();
    }

    public Optional<Prodotto> modifyPriceByName(String name,Double price){
        Optional<Prodotto> opt = findForName(name);
        if(opt.isPresent()){
            opt.get().setPrezzo(price);
            return opt;
        }else return Optional.empty();
    }

    public Optional<Prodotto> deleteProdottobyId(Long id){
        Optional<Prodotto> opt = findForId(id);
        if(opt.isPresent()){
            prodotti.remove(opt.get());
            return opt;
        }else return Optional.empty();
    }

    public Optional<Prodotto> deleteProdottoByName(String name){
        Optional<Prodotto> opt = findForName(name);
        if(opt.isPresent()){
            prodotti.remove(opt.get());
            return opt;
        }else return Optional.empty();
    }

    public Optional<Prodotto> deleteProdottoByPrice(Double price){
        Optional<Prodotto> opt = findForPrice(price);
        if(opt.isPresent()){
            prodotti.remove(opt.get());
            return opt;
        }else return Optional.empty();
    }

    public List<Prodotto> selectAll(){
        return prodotti;
    }
}

