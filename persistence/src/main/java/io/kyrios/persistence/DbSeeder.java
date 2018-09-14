package io.kyrios.persistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import io.kyrios.domain.KyriosSample;

@Component
public class DbSeeder implements CommandLineRunner {
    private SampleRepository sampleRepository;

    public DbSeeder(SampleRepository sampleRepository){
        this.sampleRepository = sampleRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        KyriosSample test1 = new KyriosSample("Test1", 5, true);
        KyriosSample test2 = new KyriosSample("Test2", 3, false);
        KyriosSample test3 = new KyriosSample("Test3", 4, true);

        List<KyriosSample> list = new ArrayList<>();
        list.add(test1);
        list.add(test2);
        list.add(test3);

        this.sampleRepository.saveAll(list);
    }
}
