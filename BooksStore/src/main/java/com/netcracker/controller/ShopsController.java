package com.netcracker.controller;

import com.netcracker.entity.Shops;

import com.netcracker.service.ShopsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/shops")
public class ShopsController {

    @Autowired
    private ShopsService shopsService;

    //private ShopsInsertService shopsInsertService;


    @PostMapping ("/create")
    @ResponseStatus (code = HttpStatus.CREATED)
    public void createShop(@RequestBody Shops shops) {
        shopsService.addShop(shops);
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<Shops> updateShop(@RequestBody Shops shops,@PathVariable("id") String id){
        shopsService.update(shops);
        return ResponseEntity.ok(shops);
    }

    @DeleteMapping ("/delete/{id}")
    @ResponseStatus (HttpStatus.NO_CONTENT)
    public void deleteShop(@PathVariable int id) {
        shopsService.remove(id);
    }

    @GetMapping ("/find")
    public ResponseEntity<Shops> findById (@RequestParam int id) {
        Shops shops = shopsService.findShop(id);

        if (shops != null) {
            return ResponseEntity.ok(shops);
        }
        else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping ("/find/all")
    public List<Shops> findAll () {
        return shopsService.findAll();
    }

     /* @PatchMapping("/patch/{id}")
    public void updatePartiallyShop(@RequestBody ShopsNameOnly shopsNameOnly, @PathVariable("id") String id){
        shopsService.updatePartially(shopsNameOnly,id);
    }*/

     /*@PatchMapping("/update")
    public void updateShop(@RequestBody Shop shop) {shopsService.update(shop);}*/

    /*@PostMapping ("/create")
    @ResponseStatus (code = HttpStatus.CREATED)
    public void createPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    @GetMapping ("/find")
    public ResponseEntity<Person> findById (@RequestParam int id) {
        Person person = personService.findPerson(id);

        if (person != null) {
            return ResponseEntity.ok(person);
        }
        else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping ("/delete/{id}")
    @ResponseStatus (HttpStatus.NO_CONTENT)
    public void deletePerson(@PathVariable int id) {
        personService.removePerson(id);
    }

    @PutMapping ("/replace/{id}")
    public ResponseEntity<Person> replacePerson (@PathVariable int id, @RequestBody Person person) {
        Person replacedPerson = personService.replacePerson(id, person);

        if (replacedPerson != null)
            return ResponseEntity.ok(replacedPerson);
        else
            return new ResponseEntity(HttpStatus.NOT_MODIFIED);
    }

    @GetMapping ("/find/all")
    public List<Person> findAll () {
        return personService.getPersonList();
    }*/
}
