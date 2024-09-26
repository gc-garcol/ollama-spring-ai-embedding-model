package gc.garcol.ollamaspringaiembedded;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.document.Document;
import org.springframework.ai.vectorstore.SearchRequest;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author thaivc
 * @since 2024
 */
@Service
@RequiredArgsConstructor
public class AnimalService
{

    private final VectorStore vectorStore;

    public void save(List<String> documents)
    {
        documents.forEach(this::save);
    }

    public void save(String documentStr)
    {
        Document document = new Document(documentStr);
        vectorStore.add(List.of(document));
    }

    public List<String> search(String query, int topK)
    {
        return vectorStore.similaritySearch(
                SearchRequest
                    .query(query)
                    .withTopK(topK)
            ).stream()
            .map(Document::getContent)
            .toList();
    }

}
