package io.kyrios.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.kyrios.domain.KyriosSample;
import io.kyrios.persistence.SampleRepository;

@RestController
public class ApiController {
    private SampleRepository sampleRepository;

    public ApiController(SampleRepository sampleRepository){
        this.sampleRepository = sampleRepository;
    }

    @GetMapping("/api")
    public List<KyriosSample> getHotels(){
        List<KyriosSample> hotels = this.sampleRepository.findAll();

        return hotels;
    }
}
