package gc.garcol.ollamaspringaiembedded;

import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author thaivc
 * @since 2024
 */
@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class AnimalSeed
{
    public static final List<String> DATA = List.of(
        """
            Dog: Known as loyal and friendly companions, dogs are social animals often regarded as "man's best friend." They come in various breeds, each with unique temperaments and characteristics, and are used for companionship, work, and therapy.
            """,
        """
            Cat: Independent and curious, cats are popular pets known for their agility and playful nature. They are often affectionate with their owners but maintain a level of self-sufficiency, making them low-maintenance pets for many.
            """,
        """
            Fish: Fish are aquatic creatures that live in freshwater or saltwater environments. They come in a wide variety of species and are commonly kept in home aquariums. Known for their calming presence, they require a well-maintained habitat.
            """,
        """
            Duck: Ducks are waterfowl known for their waddling walk and quacking sounds. They live in both wild and domestic environments and are commonly found near ponds and lakes. Ducks are valued for their eggs, meat, and down feathers.
            """,
        """
            Cow: Cows are large, domesticated herbivores raised primarily for milk, meat, and leather. They are vital to agriculture and are known for their gentle nature. Cows play a crucial role in farming economies around the world.
            """
    );
}
