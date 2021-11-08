package com.haydikodlayalim.contoller;

import com.haydikodlayalim.dto.Pet;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@RestController
@RequestMapping("/pet")
@Api(value = "Benim Pet API dökümantasyonum")
public class PetController {

    private List<Pet> petList = new ArrayList<>();

    @PostConstruct
    public void init() {
        Pet pet = new Pet(1,"sırma",new Date());
        petList.add(pet);
    }

    @PostMapping
    @ApiOperation(value="Yeni Pet Ekleme Metodu",notes="bu metodu dikkatli kullan")
    public ResponseEntity<Pet> kaydet(@RequestBody @ApiParam(value = "hayvan") Pet pet) {
        petList.add(pet);
        return ResponseEntity.ok(pet);
    }

    @GetMapping
    @ApiOperation(value="Pet Listeleme Metodu",notes="bu metod tümünü getirir")
    public ResponseEntity<List<Pet>> tumunuListele() {
        return ResponseEntity.ok(petList);
    }
}
