package gc.garcol.ollamaspringaiembedded;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author thaivc
 * @since 2024
 */
@RequestMapping("/animal")
@RestController
@RequiredArgsConstructor
public class AnimalController
{

    private final AnimalService animalService;

    @PostMapping
    public List<String> query(@RequestBody QueryRequest queryRequest)
    {
        return animalService.search(queryRequest.query(), queryRequest.limit());
    }

}
