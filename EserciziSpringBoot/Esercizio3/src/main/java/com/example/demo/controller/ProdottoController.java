package com.example.demo.controller;


import com.example.demo.entity.Prodotto;
import com.example.demo.service.ProdottoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProdottoController {

    @Autowired
    private ProdottoService prodottoService;


    @GetMapping("/select-product/{id}")
    public ResponseEntity<Prodotto> selectProductById(@PathVariable Long id){
        Optional<Prodotto> opt =prodottoService.findForId(id);
        if (opt.isPresent()){
            return ResponseEntity.ok(opt.get());
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/selectall")
    public ResponseEntity<List<Prodotto>> selectAllProduct(){

        return ResponseEntity.ok(prodottoService.selectAll());

    }
    @PostMapping("/insert")
    public ResponseEntity<Prodotto> insertProdotto(@RequestBody Prodotto prodotto){
        if(prodottoService.addProdotto(prodotto)) {
            return ResponseEntity.ok(prodotto);
        }
        else{
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/update/{name}")
    public ResponseEntity<Prodotto> updateProdottoByName(@PathVariable String name, @RequestBody Prodotto newProdotto){
        Optional<Prodotto> prodottoOpt = prodottoService.modifyProdotto(name, newProdotto);

        if(prodottoOpt.isPresent()){
            return ResponseEntity.ok(prodottoOpt.get());
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update/{name}/{price}")
    public ResponseEntity<Prodotto> updatePricebyName(@PathVariable("name") String name, @PathVariable("price") Double price){
        Optional<Prodotto> prodottoOpt = prodottoService.modifyPriceByName(name, price);

        if(prodottoOpt.isPresent()){
            return ResponseEntity.ok(prodottoOpt.get());
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{name}")
    public ResponseEntity<Prodotto> deleteProdottobyName(@PathVariable String name){
        Optional<Prodotto> prodottoOpt = prodottoService.deleteProdottoByName(name);
        if(prodottoOpt.isPresent()){
            return ResponseEntity.ok(prodottoOpt.get());
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{price}")
    public ResponseEntity<Prodotto> deleteProdottobyPrice(@PathVariable Double price){
        Optional<Prodotto> prodottoOpt = prodottoService.deleteProdottoByPrice(price);
        if(prodottoOpt.isPresent()){
            return ResponseEntity.ok(prodottoOpt.get());
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

}