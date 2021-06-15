package com.example.h2zoo;

import com.example.h2zoo.model.Birds;
import com.example.h2zoo.model.Mammals;
import com.example.h2zoo.model.Reptile;
import com.example.h2zoo.repository.BirdsRepository;
import com.example.h2zoo.repository.MammalsRepository;
import com.example.h2zoo.repository.ReptileRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import java.util.List;

@SpringBootApplication
public class H2ZooApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
		SpringApplication.run(H2ZooApplication.class, args);
		ReptileRepository reptileRepository=
				configurableApplicationContext.getBean(ReptileRepository.class);
		Reptile kingCobra= new Reptile("Slither","Snake","Black & Yellow",
				"Carnivore");
		Reptile komodoDragon =new Reptile("Dennis","Lizard","Brown",
				"Carnivore");
		reptileRepository.saveAll(List.of(kingCobra ,komodoDragon));

		BirdsRepository birdsRepository=
				configurableApplicationContext.getBean(BirdsRepository.class);
		Birds pigeon= new Birds("Grable","Fly","Black &Grey",
				"seeds");
		Birds peacock =new Birds("Dan","Fly","Green & Blue",
				"seeds");
		Birds parrot =new Birds("Pluck","Fly","Green",
				"seeds");
		birdsRepository.saveAll(List.of(pigeon ,peacock,parrot));


		MammalsRepository mammalsRepository=
				configurableApplicationContext.getBean(MammalsRepository.class);
		Mammals elephant= new Mammals("Pluto","BigAnimal","Grey",
				"Carnivore");
		Mammals human =new Mammals("Dennis","Land","White",
				"Carnivore");
		Mammals horses =new Mammals("Harry","Land","Black",
				"Carnivore");
		mammalsRepository.saveAll(List.of(elephant,human,horses));
	}

}




