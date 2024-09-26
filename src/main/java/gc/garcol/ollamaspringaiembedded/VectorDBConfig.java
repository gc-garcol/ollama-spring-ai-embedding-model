package gc.garcol.ollamaspringaiembedded;

import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.ai.vectorstore.SimpleVectorStore;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author thaivc
 * @since 2024
 */
@Configuration
public class VectorDBConfig
{
    @Bean
    VectorStore vectorStore(EmbeddingModel embeddingModel)
    {
        return new SimpleVectorStore(embeddingModel);
    }
}
