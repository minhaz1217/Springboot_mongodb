package io.github.minhaz1217.springboot_mongodb_tutorial;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.swing.text.html.ListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner{

    protected HotelRepository hotelRepository;

    public DbSeeder(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Hotel marriot = new Hotel(
                "Marriot",
                130,
                new Address("Paris", "France"),
                Arrays.asList(
                        new Review("JOHN", 8, false),
                        new Review("Mary", 8, true)
                )
        );
        Hotel ibis = new Hotel(
                "Ibis",
                90,
                new Address("Buracherest", "Romania"),
                Arrays.asList(
                        new Review("JOHN", 8, false),
                        new Review("Mary", 8, true)
                )
        );
        Hotel sofitel = new Hotel(
                "Sofitel",
                200,
                new Address("Rome", "Italy"),
                new ArrayList<>()
        );
        this.hotelRepository.deleteAll();
        List<Hotel> hotels = Arrays.asList(marriot,ibis, sofitel);
        this.hotelRepository.save(marriot);
        this.hotelRepository.save(ibis);
        this.hotelRepository.save(sofitel);

        System.out.println("DB LOADED");
    }

}
