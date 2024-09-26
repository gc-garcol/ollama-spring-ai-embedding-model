package gc.garcol.ollamaspringaiembedded;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class OllamaSpringAiEmbeddedApplication
{

    private final AnimalService animalService;

    public static void main(String[] args)
    {
        SpringApplication.run(OllamaSpringAiEmbeddedApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    void initDocuments()
    {
        animalService.save(AnimalSeed.DATA);
    }

}
